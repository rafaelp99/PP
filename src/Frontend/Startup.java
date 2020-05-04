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
    private static ListaHospitais listHosp;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Administrador admin = new Administrador("admin", 1, "1234");
        Hospital h1 = new Hospital(1, "Hospital", "Fafe" );
        
        
        
        sist = new Sistema();
        if(!sist.checkFileExist()){
            list = new ListaUtilizadores();
            listHosp = new ListaHospitais(); 
            list.registarUtilizador(admin);
            listHosp.registarHospital(h1);
            sist.setListaUtilizadores(list);
            sist.setListaHospitais(listHosp);
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
