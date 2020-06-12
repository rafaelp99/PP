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
public class Hospital implements Serializable{
    private String codHospital;
    private String nomeHospital;
    private String localidade;
    private int contador;
    private ArrayList<Paciente> listaPacientes;
    private ArrayList<Trabalhador> listaTrabalhadores;
    private ArrayList<Enfermaria> listaEnfermaria;
    private ArrayList<Enfermaria> listaEnfermariaDisponivel;
    private ArrayList<Medico> listaMedicos;
    public Hospital(String codHospital, String nomeHospital, String localidade){
        this.codHospital=codHospital;
        this.nomeHospital= nomeHospital;
        this.localidade=localidade;
        listaPacientes= new ArrayList<Paciente>();
        listaTrabalhadores= new ArrayList<Trabalhador>();
        listaEnfermaria = new ArrayList<Enfermaria>();
        listaMedicos = new ArrayList<Medico>();

    }
    public ArrayList<Paciente> getListaPacientes(){
        return listaPacientes;
    }

    public int getPacientesAtuais(){
        ArrayList<Paciente> listaPacientesAtuais = new ArrayList<Paciente>();
            for(Paciente p : listaPacientes){
                if(p.getDataSaida().isEmpty()){
                listaPacientesAtuais.add(p);
            }
        }
            return listaPacientesAtuais.size();
    }
     public ArrayList<Trabalhador> getListaTrabalhadores(){
        return listaTrabalhadores;
    }
     public ArrayList<Enfermaria> getListaEnfermaria(){
        return listaEnfermaria;
    } 
     public ArrayList<Enfermaria> getListaEnfermariaLivres(){
         listaEnfermariaDisponivel = new ArrayList<Enfermaria>();
         for(Enfermaria e : listaEnfermaria){
             if(e.getCamasLivres()!= 0){
                 listaEnfermariaDisponivel.add(e);
                 
             }
         }
         return listaEnfermariaDisponivel;
     }
    public ArrayList<Medico> getListaMedicos(){
         
         return listaMedicos;
     }
    
     public String getNomeHospital(){
         return nomeHospital;
     } 
     public String getLocalidade(){
         return localidade;
     }
     public String getCodHospital(){
         return codHospital;
     }
     public Enfermaria getEnfermaria(int i){
         return listaEnfermaria.get(i);
     }
     public Paciente getPaciente(int i){
         return listaPacientes.get(i);
     }
     public Enfermaria getEnfermariaMaisOcupada(){
         int i = 0;
         Enfermaria e1=null;
         for(Enfermaria e :listaEnfermaria){
             
             if((e.getCamas()-e.getCamasLivres())>i)
                 i= e.getCamas()-e.getCamasLivres();
                 e1=e;
         }
         return e1;
     }
     public Enfermaria getEnfermariaEquipamentos(){
         int i=0;
         int a= 0;
         Enfermaria e1 = null;
         for(Enfermaria e : listaEnfermaria){
             for(Equipamento eq : e.getListaEquipamento()){
                 if(eq.getEstado().equals("Ocupado")){
                     a++;
                 }
             }
             if(a>=i){
                 i=a;
                 e1=e;
             }
         }
         return e1;
     }
     public void adcionarMedico(Medico m){
         listaMedicos.add(m);
     }
    public void adcionarPaciente(Paciente p){
        listaPacientes.add(p);
    } 
    public void adcionarTrabalhador(Trabalhador t){
        listaTrabalhadores.add(t);
    }
    public void adcionarEnfermaria(Enfermaria e){
        listaEnfermaria.add(e);
    }
    public void removerPaciente(Paciente p){
        listaPacientes.remove(p);
    } 
    public void removerTrabalhador(Trabalhador t){
        listaTrabalhadores.remove(t);
    }
    public void removerEnfermaria(Enfermaria e) throws Exception{
        if(e.getCamasLivres()==e.getCamas()){
            listaEnfermaria.remove(e);
        }
        else{
            throw new Exception("Mova todos os Pacientes");
        }
    }
    public void setNome(String nome){
        this.nomeHospital=nome;
    }
    public void setLocalidade(String local){
        this.localidade = local;
    }
}
