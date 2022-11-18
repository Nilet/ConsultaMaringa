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
    
    private String cns, cpf, dataNascimento, cep, endereco, bairro;

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

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
    
    public boolean autenticaPaciente(){
        PacienteDAO objpacientedao = new PacienteDAO();
        return objpacientedao.autenticacaoUsuario(this);
    }
}
