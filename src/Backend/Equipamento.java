/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;

/**
 *
 * @author Rafael Pinto
 */
public class Equipamento implements Serializable {
    private String codigoEquipamento;
    private String nomeEquipamento;
    private Paciente paciente;
    private String estado;
    
    
    public Equipamento(String codigoEquipamento, String nomeEquipamento){
    this.codigoEquipamento = codigoEquipamento;
    this.nomeEquipamento=nomeEquipamento;
    this.estado="Livre";
    }
    
    public String getCodigoEquipamento(){
        return codigoEquipamento;
    }
    public String getNome(){
        return nomeEquipamento;
    }
    public void setPaciente(Paciente p){
        if(estado.equals("Livre")){
        p.setEquipamento(this);
        this.paciente=p;
        this.estado="Ocupado";
        }
        else{
            p.setEquipamento(this);
            this.paciente=p;
        }
    }
    public void removerPaciente(){
        if(estado.equals("Ocupado")){
            this.paciente.setEquipamento(null);
            this.paciente=null;
            this.estado="Livre";
        }
        else{
            throw new IllegalArgumentException("O equipamento não está a ser usado");
        }
    }
    public Paciente getPaciente(){
        return paciente;
    }
    public String getEstado(){
        return estado;
    }

}
