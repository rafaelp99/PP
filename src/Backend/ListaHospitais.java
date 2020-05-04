/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Rafael Pinto
 */
public class ListaHospitais implements Serializable {
    private ArrayList<Hospital> listaHospitais;
    
    public ListaHospitais(){
       listaHospitais= new ArrayList<Hospital>();
    }
    public ArrayList<Hospital> getListaHospital(){
        return listaHospitais;
    }
    public void registarHospital(Hospital h){
        listaHospitais.add(h);
    }
    public Hospital getHospital(int i){
        return listaHospitais.get(i);
    }
}
