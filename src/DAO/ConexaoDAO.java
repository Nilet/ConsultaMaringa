/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mathe
 */
public class ConexaoDAO {
    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/consulta_maringa?user=root&password=database123";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
        return conn;
    }
    
}
