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
public class Trabalhador implements Serializable{
    private String nomeTrabalhador;
    private int codigoTrabalhador;
    
    
    public Trabalhador(int codigoTrabalhador, String nomeTrabalhador){
    this.codigoTrabalhador = codigoTrabalhador;
    }
    
    public int getCodigoTrabalhador(){
        return codigoTrabalhador;
    }
}
