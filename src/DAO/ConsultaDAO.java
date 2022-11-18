/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ConsultaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ConsultaDTO> lista = new ArrayList<>();

    public void inserirConsulta(ConsultaDTO objconsultadto) {
        String sql = "INSERT INTO CONSULTA(CRM, CNS, IDUBS, DATAHORA) VALUES (?,?,?,?)";
        String crm, cns, datahora;
        int idubs;

        MedicoDAO objMedicoDAO = new MedicoDAO();
        PacienteDAO objPacienteDAO = new PacienteDAO();
        UnidadeSaudeDAO objUbsDAO = new UnidadeSaudeDAO();

        conn = new ConexaoDAO().conectaBD();

        try {

            crm = objMedicoDAO.getCrmPorEspecialidade(objconsultadto.getEspecialidade());
            cns = objPacienteDAO.getCnsPorNome(objconsultadto.getPaciente());
            idubs = Integer.parseInt(objUbsDAO.getIdUbsPorNome(objconsultadto.getUnidadeDeSaude()));

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, crm);
            pstm.setString(2, cns);
            pstm.setInt(3, idubs);
            pstm.setString(4, objconsultadto.getDataHora());

            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<ConsultaDTO> ListarConsultas() {
        String sql = "SELECT MEDICOS.ESPECIALIDADE as 'Especialidade',\n"
                + " PACIENTE.NOME as 'Paciente',\n"
                + " UNIDADESAUDE.NOME as 'UBS',\n"
                + " CONSULTA.DATAHORA as 'Data e Hora' \n"
                + " FROM CONSULTA \n"
                + " JOIN MEDICOS ON MEDICOS.CRM = CONSULTA.CRM\n"
                + " JOIN PACIENTE ON PACIENTE.CNS = CONSULTA.CNS\n"
                + " JOIN UNIDADESAUDE ON UNIDADESAUDE.IDUBS = CONSULTA.IDUBS";

        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ConsultaDTO objconsultadto = new ConsultaDTO();
                objconsultadto.setEspecialidade(rs.getString("Especialidade"));
                objconsultadto.setPaciente(rs.getString("Paciente"));
                objconsultadto.setUnidadeDeSaude(rs.getString("UBS"));
                objconsultadto.setDataHora(rs.getString("Data e Hora"));

                lista.add(objconsultadto);
            }
        } catch (SQLException e) {
        }
        return lista;
    }
}
