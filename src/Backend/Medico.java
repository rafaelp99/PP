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
    
    
    public Medico(String codigoTrabalhador, String nomeTrabalhador, String especialidade, Enfermaria enf) {
        super(codigoTrabalhador, nomeTrabalhador, enf);
        listaPac = new ArrayList<Paciente>();
        this.especialidade= especialidade;
        
    }

    public ArrayList<Paciente> getListaPac(){
        return listaPac;
    }

    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String esp){
        this.especialidade= esp;
    }

}
