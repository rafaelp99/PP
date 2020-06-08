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
public class Medico extends Trabalhador implements Serializable {
    
    private String especialidade;
    private ArrayList<Paciente> listaPac;
    private Enfermaria enf;
    
    public Medico(String codigoTrabalhador, String nomeTrabalhador, String especialidade, Enfermaria enf) {
        super(codigoTrabalhador, nomeTrabalhador);
        listaPac = new ArrayList<Paciente>();
        this.enf= enf;
        this.especialidade= especialidade;
    }
    @Override
    public String getEspecialidade(){
        return especialidade;
    }
    public ArrayList<Paciente> getListaPac(){
        return listaPac;
    }
    public Enfermaria getEnfermaria(){
        return enf;
    }
    public void setEspecialidade(String esp){
        this.especialidade= esp;
    }
    public void setEnfermaria(Enfermaria e){
        this.enf= e;
    }
}
