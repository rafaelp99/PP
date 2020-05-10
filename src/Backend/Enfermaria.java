/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rafael Pinto
 */
public class Enfermaria implements Serializable {
    private String tipo;
    private String codEnfermaria;
    private int camas;
    private ArrayList<Paciente> listaPaciente;
    private int camaPaciente= 1;
    
    public Enfermaria(String tipo, String codEnfermaria, int camas){
    this.tipo = tipo;
    this.codEnfermaria= codEnfermaria;
    this.camas= camas;
    listaPaciente = new ArrayList<Paciente>();
            
}
    public String getTipo(){
        return tipo;
    }
    public int getCamaPaciente(){
        return camaPaciente;
    }
    public String getCodEnf(){
        return codEnfermaria;
    }
    public int getCamas(){
        return camas;
    }
    public ArrayList<Paciente> getListaPaciente(){
        return listaPaciente;
    }
    public void registarPacienteEnf(Paciente p){
        listaPaciente.add(p);
    }
    public void removerPacienteEnf(Paciente p){
        listaPaciente.remove(p);
    }
    /*public int camaAtribuida(){

    }*/
    public void setTipo(String tipo){
        this.tipo= tipo;
    }
    
    public void setCamas(int camas){
        this.camas=camas;
    }
    
    public void setCamaPaciente(int camaPaciente){
        this.camaPaciente=camaPaciente;
    }
       public String toString(){
       return "Código da Enfermaria:" + getCodEnf(); 
   }
    
}
