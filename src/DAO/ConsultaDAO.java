/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ConsultaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultaDAO {

    Connection conn;
    PreparedStatement pstm;

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
}
