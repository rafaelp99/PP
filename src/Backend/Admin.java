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
public class Admin extends Utilizador implements Serializable{

    public Admin(String nomeUser, int Cod_user, String pass) {
        super(nomeUser, Cod_user, pass);
    }
}
