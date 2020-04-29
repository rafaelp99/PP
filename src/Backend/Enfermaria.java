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
public class Enfermaria {
    private String tipo;
    private int codEnfermaria;
    private int camas;
    
    public Enfermaria(String tipo, int codEnfermaria, int camas){
    this.tipo = tipo;
    this.codEnfermaria= codEnfermaria;
    this.camas= camas;
            
}
    public String getTipo(){
        return this.tipo;
    }
    public int getCodEnf(){
        return this.codEnfermaria;
    }
    public int getCamas(){
        return this.camas;
    }
    public void setTipo(){
        this.tipo= tipo;
    }
}
