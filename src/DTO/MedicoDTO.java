/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import DAO.MedicoDAO;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class MedicoDTO {

    public String[] getListaEspecialidades() {
        MedicoDAO objmedicodao = new MedicoDAO();        
        String[] lista = null;
        try {
            ArrayList<String> tempLista = objmedicodao.listarEspecialidades();
            lista = tempLista.toArray(new String[tempLista.size()]);
            return lista;

        } catch (Exception e) {
            System.out.println("MedicoDTO " + e.getMessage());
            return lista;

        }

    }
}
