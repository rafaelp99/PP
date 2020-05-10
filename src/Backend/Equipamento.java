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
public class Equipamento implements Serializable {
    private int codigoEquipamento;
    
    
    public Equipamento(int codigoEquipamento){
    this.codigoEquipamento = codigoEquipamento;
    }
    
    public int getCodigoEquipamento(){
        return codigoEquipamento;
    }
}
