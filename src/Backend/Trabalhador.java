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
    private Enfermaria enf;
    private String especialidade;

    
    
    public Trabalhador(String nomeTrabalhador, String codigoTrabalhador, Enfermaria enf){
    this.codigoTrabalhador = codigoTrabalhador;
    this.nomeTrabalhador= nomeTrabalhador;
    this.enf=enf;
    }
    
    
    public String getCodigoTrabalhador(){
        return codigoTrabalhador;
    }
    public String getNomeTrabalhador(){
        return nomeTrabalhador;
    }
    public Enfermaria getEnf(){
        return enf;
    }

    public void setNome(String nome){
        this.nomeTrabalhador=nome;
    }
    public void setEnfermaria(Enfermaria e){
        this.enf=e;
    }
}

