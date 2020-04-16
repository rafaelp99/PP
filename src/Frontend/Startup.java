/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.*;


/**
 *
 * @author Rafael Pinto
 */
public class Startup {

    private static Sistema sist;
    
    public static void main(String[] args) {
        // TODO code application logic here
        sist = new Sistema();
        if(sist.checkFileExist()){
            sist = (Sistema) sist.getSistema();
            new Login(sist).setVisible(true);
        }else{
            new Login(sist).setVisible(true);
        }

    }
    
}
