/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Rafael Pinto
 */
public class Paciente implements Serializable {
    private String nomePaciente;
    private int codPaciente;
    private String localidade;
    private Equipamento equip;
    private Enfermaria enf;
    private int cama;
    private Calendar dataEntrada;
    private Calendar dataSaida;
    
    public Paciente(String nomePaciente, String localidade, int codPaciente, Enfermaria enf, Calendar dataEntrada){
        this.nomePaciente=nomePaciente;
        this.codPaciente=codPaciente;
        this.localidade= localidade;
        this.dataEntrada= dataEntrada;
        this.enf=enf;
        if(enf.getListaPaciente().size()<enf.getCamas()){
            
            cama = enf.getCamaPaciente();
            int x= enf.getCamaPaciente();
            enf.setCamaPaciente(x);
        }
    }
    public String getNome(){
        return nomePaciente;
    }    
    public int getCod(){
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

    public Calendar getDataEntrada(){
        return dataEntrada;
    }
    public Calendar getDataSaida(){
        return dataSaida;
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
    public void setEnfermaria(Enfermaria enf){
        this.enf= enf;
    }
    public void setCama(int cama){
        this.cama = cama;
    }
    public void setLocalidade(String Localidade){
        this.localidade=localidade;
    }
   public void setDataSaida(Calendar dataSaida){
       this.dataSaida= dataSaida;
   }

}
