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
public class User extends Utilizador implements Serializable {

    public User(String nome, int cod, String pass) {
        super(nome, cod, pass);
    }
}
