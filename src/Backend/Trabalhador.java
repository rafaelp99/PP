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
    private String codigoTrabalhador;
    private String especialidade;

    
    
    public Trabalhador(String nomeTrabalhador, String codigoTrabalhador){
    this.codigoTrabalhador = codigoTrabalhador;
    this.nomeTrabalhador= nomeTrabalhador;
    }
    
    
    public String getCodigoTrabalhador(){
        return codigoTrabalhador;
    }
    public String getNomeTrabalhador(){
        return nomeTrabalhador;
    }
    public String getEspecialidade(){
        return especialidade;
    }
}

