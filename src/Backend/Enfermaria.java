/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.ArrayList;

/**
 *
 * @author Rafael Pinto
 */
public class Enfermaria {
    private String tipo;
    private int codEnfermaria;
    private int camas;
    private ArrayList<Paciente> listaPaciente;
    private int camaPaciente= 0;
    
    public Enfermaria(String tipo, int codEnfermaria, int camas){
    this.tipo = tipo;
    this.codEnfermaria= codEnfermaria;
    this.camas= camas;
    listaPaciente = new ArrayList<Paciente>();
            
}
    public String getTipo(){
        return tipo;
    }
    public int getCodEnf(){
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
    public void setTipo(){
        this.tipo= tipo;
    }
}
