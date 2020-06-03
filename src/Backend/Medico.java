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
    
    public Medico(int codigoTrabalhador, String nomeTrabalhador, String especialidade) {
        super(codigoTrabalhador, nomeTrabalhador);
        listaPac = new ArrayList<Paciente>();
    }
    
}
