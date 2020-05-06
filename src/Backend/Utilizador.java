/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.util.*;
import java.io.*;
/**
 *
 * @author Rafael Pinto
 */
public class Utilizador implements Serializable{
    private String nome;
    private int cod;
    private String pass;
    
    public Utilizador(String nome, int cod, String pass){
        this.nome=nome;
        this.cod=cod;
        this.pass=pass;
    }
    public String getNome(){
        return this.nome;
    }
    public int getCod(){
        return this.cod;
    }
    public String getPasse(){
        return this.pass;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPass(String pass){
        this.pass=pass;
    }
    @Override
    public String toString(){
        return "Nome: " +this.nome +"\nCódigo: " +this.cod +"\nPassword: " +this.pass ;
    }
}
