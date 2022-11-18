/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mathe
 */
public class MedicoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public ResultSet getEspecialidades() {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT ESPECIALIDADE FROM MEDICOS GROUP BY ESPECIALIDADE";

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String getCrmPorEspecialidade(String especialidade) {
        conn = new ConexaoDAO().conectaBD();

        String sql = "SELECT CRM FROM MEDICOS WHERE ESPECIALIDADE = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, especialidade);

            rs = pstm.executeQuery();
            String retorno = "";
            
            while(rs.next()){
            retorno = rs.getString("crm");
        }

            return retorno;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

}
