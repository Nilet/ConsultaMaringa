/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import DAO.UnidadeSaudeDAO;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class UnidadeSaudeDTO {

    public String[] getListaUnidades() {
        UnidadeSaudeDAO objubsdao = new UnidadeSaudeDAO();
        String[] lista = null;
        try {
            ArrayList<String> tempLista = objubsdao.listarUnidades();
            lista = tempLista.toArray(new String[tempLista.size()]);
            return lista;

        } catch (Exception e) {
            System.out.println("UnidadeSaudeDTO " + e.getMessage());
            return lista;

        }

    }
}
