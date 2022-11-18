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
    
    public void inserirConsulta(ConsultaDTO objconsultadto){
        String sql = "INSERT INTO CONSULTA(CRM, CNS, IDUBS, DATAHORA) VALUES (?,?,?,?)";
        String crm, cns, idubs, datahora;
        
        MedicoDAO objMedicoDAO = new MedicoDAO();
        crm = objMedicoDAO.getCrmPorEspecialidade(objconsultadto.getEspecialidade());
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, crm);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
