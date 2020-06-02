/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Rafael Pinto
 */
public class Trabalhador {
    private int codigoTrabalhador;
    private String nomeTrabalhador;
    
    
    public Trabalhador(int codigoTrabalhador){
    this.codigoTrabalhador = codigoTrabalhador;
    }
    public Trabalhador(String nomeTrabalhador){
    this.nomeTrabalhador = nomeTrabalhador;
    }
    
    public int getCodigoTrabalhador(){
        return codigoTrabalhador;
    }
    public String getNomeTrabalhador(){
        return nomeTrabalhador;
    }
}
