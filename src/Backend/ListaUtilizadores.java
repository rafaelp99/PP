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
public class ListaUtilizadores implements Serializable {
    private ArrayList<Utilizador> listautilizadores;
    
    public ListaUtilizadores(){
        listautilizadores= new ArrayList<Utilizador>();
    }
    public ArrayList<Utilizador> getListaUtilizador(){
        return listautilizadores;
    }
    public void registarUtilizador(Utilizador u){
        listautilizadores.add(u);
    }
    public void removerUtilizador(Utilizador u){
        listautilizadores.remove(u);
    }
        public int numeroUtilizadores(){
        return listautilizadores.size();
    }
    public Utilizador getUtilizador(int i){
        return listautilizadores.get(i);
    }
    public Utilizador getUtilizadorNome(String nome){
        Utilizador u = null;
        for(Utilizador user : listautilizadores){
            if(user.getNome().equals(nome)){
                u = user;
            }
        }
        return u;
    }
 public Utilizador getUtilizadorCodigo(int cod){
        Utilizador u = null;
        for(Utilizador user : listautilizadores){
            if(user.getCod() == (cod)){
                u = user;
            }
        }
        return u;
    }
}

