/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Rafael Pinto
 */
public class Sistema implements Serializable {
    private ListaUtilizadores listaUtilizadores;
    private ListaHospitais listaHospitais;
    private static final String dados = "dadosDB";

    public int codigoUnico;
    public int codEnf;
    public int codPac;
    public int codTrab;
    public Sistema() {
       this.listaUtilizadores = new ListaUtilizadores();
       this.listaHospitais = new ListaHospitais();
    }
    
    public ListaUtilizadores getListaUtilizadores() {
        return listaUtilizadores;
    }
    public ListaHospitais getListaHoospitais(){
        return listaHospitais;
    }
    public void setListaHospitais(ListaHospitais listaHospitais){
        this.listaHospitais = listaHospitais;
    }

    public void setListaUtilizadores(ListaUtilizadores listaUtilizadores) {
        this.listaUtilizadores = listaUtilizadores;
    }

    public void gravarSistema(){
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dados));
                oos.writeObject(this);
                oos.flush();
                oos.close();
                
                System.out.println("Dados guardados");
              
            } catch (Exception e) {
                System.out.println("Alguma coisa deu mal ao gravar");
                Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, e);
            }
        
    }
    
    public Object getSistema(){
        Sistema retSis = new Sistema();
        try{
            ObjectInputStream ooin = new ObjectInputStream(new FileInputStream(dados));
            retSis = (Sistema) ooin.readObject();
            ooin.close();
            System.out.println("Dados carregados");
        } catch(Exception e){
            System.out.println("Alguma coisa deu mal ao carregar");
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, e);
        }
        return retSis;
    }
    
    public boolean checkFileExist(){
        boolean exit = true;
        try{
            ObjectInputStream ooin = new ObjectInputStream(new FileInputStream(dados));
        } catch(FileNotFoundException e){
            System.out.println("Erro ao acessar o ficheiro");
            exit = false;
        } catch (IOException ex) {
            System.out.println("Exceção IOException");
        }
        return exit;
    }
}
