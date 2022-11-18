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
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class UnidadeSaudeDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;


    
        public String getIdUbsPorNome(String ubsNome) {
        conn = new ConexaoDAO().conectaBD();

        String sql = "SELECT idUbs FROM UNIDADESAUDE WHERE Nome = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, ubsNome);

            rs = pstm.executeQuery();
            String retorno = "";
            
            while(rs.next()){
            retorno = String.valueOf(rs.getInt("idUbs"));
        }

            return retorno;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
