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
public class PacienteDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public ArrayList<String> listarPacientes() {
        ArrayList<String> lista = new ArrayList<>();
        conn = new ConexaoDAO().conectaBD();
        String sql = "SELECT NOME FROM PACIENTE";

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                lista.add(rs.getString("Nome"));
            }
        } catch (SQLException e) {
            System.out.println("PacienteDAO " + e.getMessage());
        }
        return lista;

    }
}
