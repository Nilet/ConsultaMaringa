/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import DAO.PacienteDAO;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class PacienteDTO {

    public String[] getListaNome() {
        PacienteDAO objpacientedao = new PacienteDAO();        
        String[] lista = null;
        try {
            ArrayList<String> tempLista = objpacientedao.listarPacientes();
            lista = tempLista.toArray(new String[tempLista.size()]);
            return lista;

        } catch (Exception e) {
            System.out.println("PacienteDTO " + e.getMessage());
            return lista;

        }

    }
}
