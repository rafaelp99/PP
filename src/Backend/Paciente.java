/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Pinto
 */
public class Paciente implements Serializable {
    private String nomePaciente;
    private String codPaciente;
    private String localidade;
    private String estado;
    private Equipamento equip;
    private Enfermaria enf;
    private int cama;
    private Calendar dataEntrada;
    private Calendar dataSaida;
    private Medico medico;
   
    
    public Paciente(String nomePaciente, String localidade, String codPaciente, Enfermaria enf, Calendar dataEntrada, String estado){
        this.nomePaciente=nomePaciente;
        this.codPaciente=codPaciente;
        this.localidade= localidade;
        this.dataEntrada= dataEntrada;
        this.estado= estado;
        this.enf=enf;
       if(!enf.getCamaPaciente().containsValue(null)){
           throw new IllegalArgumentException(
                   "Enfermaria Cheia");
       }
      
       
    }
    public String getNome(){
        return nomePaciente;
    }    
    public String getCod(){
        return codPaciente;
    }
    public Equipamento getEquipamento(){
        return equip;
    }
    public String getLocalidade(){
        return localidade;
    }
    public Enfermaria getEnfermaria(){
        return enf;
    }
    public String getEstado(){
        return estado;
    }
    public Medico getMedico(){
        return medico;
    }

    public String getDataEntrada(){
        return getTempo(dataEntrada);
    }
   public String getTempo(Calendar calendar){
       if(calendar != null){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(calendar.getTime());
         
    }
       else{
           return "";
       } 
   }
    public String getDataSaida(){
        return getTempo(dataSaida);
    }
   
    public int getCama(){
        return cama;
    }
    public void setNome(String nomePaciente){
        this.nomePaciente = nomePaciente;
    }
    public void setEquipamento(Equipamento equip){
        this.equip = equip;
        
    }
    public void setEnfermaria(Enfermaria e){
       
             this.enf= e;
       
        

    }
    public void setCama(int cama){
        this.cama = cama;
    }
    public void setLocalidade(String local){
        this.localidade=local;
    }
   public void setDataSaida(Calendar dataSaida){
       this.dataSaida= dataSaida;
       
       enf.removerPaciente(this);
       if(!(this.getEquipamento() == null)){
       this.getEquipamento().removerPaciente();
       this.setEquipamento(null);
       
       }
       this.setMedico(null);
       this.setEstado("");
       this.enf=null;
       this.setCama(0);
   }
   public void setEstado(String estado){
       this.estado=estado;
   }
   public void setMedico(Medico m){
       this.medico=m;
   }
}
