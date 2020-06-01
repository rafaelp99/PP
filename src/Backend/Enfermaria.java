/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;


/**
 *
 * @author Rafael Pinto
 */
public class Enfermaria implements Serializable {
    private String tipo;
    private String codEnfermaria;
    private int camas;
    private int camasLivres;
    private ArrayList<Equipamento> listaEquipamento;
    //private int camaPaciente= 1;
    private HashMap<Integer, Paciente> camaPaciente;
    
    
    public Enfermaria(String tipo, String codEnfermaria, int camas){
    this.tipo = tipo;
    this.codEnfermaria= codEnfermaria;
    this.camas= camas;
    listaEquipamento = new ArrayList<Equipamento>();
    camaPaciente= new HashMap<Integer, Paciente>();
    for(int i = 1; i<=camas; i++){
        camaPaciente.put(i, null);
        
        System.out.println(camaPaciente.toString());
        System.out.println(camaPaciente.containsValue(null));
        System.out.println(camaPaciente.entrySet());
    }
            
}
    public String getTipo(){
        return tipo;
    }
    public ArrayList<Equipamento> getListaEquipamento(){
        return listaEquipamento;
    }
    public String getCodEnf(){
        return codEnfermaria;
    }
    public int getCamas(){
        return camas;
    }
    public void addEquipamento(Equipamento eq){
        listaEquipamento.add(eq);
    }
    public void removerEquipamento(Equipamento eq){
        listaEquipamento.remove(eq);
    }
    public HashMap<Integer, Paciente> getCamaPaciente(){
        return camaPaciente;
    }
    public int getCamasLivres(){
        int i= 0;
        for (HashMap.Entry<Integer, Paciente> entry : camaPaciente.entrySet()){
            if(entry.getValue()==null){
                i++;
            }
           
        }
        
        return (camasLivres=i);
    }
    public void setTipo(String tipo){
        this.tipo= tipo;
    }
    
    public void setCamas(int camas){
        this.camas=camas;
    }
    
    public void setPaciente(Paciente p){
      if(camaPaciente.containsValue(null)){
         
            for (HashMap.Entry<Integer, Paciente> entry : camaPaciente.entrySet()) {
             if(entry.getValue()==null){
                
                camaPaciente.replace(entry.getKey(), p);
                //camaPaciente.replace(key, p);
                
                break;
               
            }
        }
        
    }
        else{
        System.out.println("Enfermaria Cheia!");
        }
    }
    public void removerPaciente(Paciente p){
 
            for(HashMap.Entry<Integer, Paciente> entry : camaPaciente.entrySet()){
                if(entry.getValue().equals(p)){
                int key = entry.getKey();
                camaPaciente.replace(key, null);
                    }
    }
    }
    
 

       public String toString(){
       return "Código da Enfermaria:" + getCodEnf(); 
   }
    
}
