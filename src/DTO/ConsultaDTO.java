/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import DAO.ConsultaDAO;

/**
 *
 * @author mathe
 */
public class ConsultaDTO {
    private String especialidade;
    private String dataAgenda;
    private String horaAgenda;
    private String unidadeDeSaude;
    private String paciente;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getDataAgenda() {
        return dataAgenda;
    }

    public void setDataAgenda(String dataAgenda) {
        this.dataAgenda = dataAgenda;
    }

    public String getHoraAgenda() {
        return horaAgenda;
    }

    public void setHoraAgenda(String horaAgenda) {
        this.horaAgenda = horaAgenda + ":00";
    }

    public String getUnidadeDeSaude() {
        return unidadeDeSaude;
    }

    public void setUnidadeDeSaude(String unidadeDeSaude) {
        this.unidadeDeSaude = unidadeDeSaude;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    
    public void CadastrarConsulta(){
        ConsultaDAO objconsultadao = new ConsultaDAO();
        objconsultadao.inserirConsulta(this);
    }
}
