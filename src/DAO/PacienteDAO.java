/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PacienteDTO;
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
    
        public String getCnsPorNome(String pacienteNome) {
        conn = new ConexaoDAO().conectaBD();

        String sql = "SELECT CNS FROM PACIENTE WHERE Nome = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, pacienteNome);

            rs = pstm.executeQuery();
            String retorno = "";
            
            while(rs.next()){
            retorno = rs.getString("CNS");
        }

            return retorno;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
        
        public boolean autenticacaoUsuario(PacienteDTO objpacientedto){
            conn = new ConexaoDAO().conectaBD();
            
            try {
                String sql = "SELECT * FROM PACIENTE WHERE CNS = ? AND CPF = ?";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, objpacientedto.getCns());
                pstm.setString(2, objpacientedto.getCpf());
                
                rs = pstm.executeQuery();
                return rs.next();
                
            } catch (SQLException e) {
                return false;
            }
        }
                
}
