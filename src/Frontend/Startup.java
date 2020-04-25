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
    private static ListaUtilizadores list;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Administrador admin = new Administrador("admin", 1, "1234");
        
        sist = new Sistema();
        if(!sist.checkFileExist()){
            list = new ListaUtilizadores();
            list.registarUtilizador(admin);
            sist.setListaUtilizadores(list);
            sist.gravarSistema();
            System.out.print("a");
        }
        
        
        
        else if(sist.checkFileExist()){
            
            sist = (Sistema) sist.getSistema();
            new Login(sist).setVisible(true);
        }else{
            new Login(sist).setVisible(true);
        }

    }
    
}
