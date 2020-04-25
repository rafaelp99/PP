/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.*;

/**
 *
 * @author Rafael Pinto
 */
public class Administrador extends Utilizador implements Serializable{
   
    public Administrador(String nome, int cod, String pass) {
        super(nome, cod, pass);
    }
   
}
