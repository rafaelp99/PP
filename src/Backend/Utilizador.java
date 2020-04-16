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
    private String nomeUser;
    private int Cod_user;
    private String pass;
    
    public Utilizador(String nomeUser, int Cod_user, String pass){
        this.nomeUser=nomeUser;
        this.Cod_user=Cod_user;
        this.pass=pass;
    }
    public String getNome(){
        return this.nomeUser;
    }
    public int getCod(){
        return this.Cod_user;
    }
    public String getPasse(){
        return this.pass;
    }
    public void setNome(String nomeUser){
        this.nomeUser=nomeUser;
    }
    public void setPass(String pass){
        this.pass=pass;
    }
    @Override
    public String toString(){
        return "Nome: " +this.nomeUser +"\nCódigo: " +this.Cod_user +"\nPassword: " +this.pass ;
    }
}
