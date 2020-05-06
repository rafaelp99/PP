/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Rafael Pinto
 */
public class Paciente {
    private String nomePaciente;
    private int codPaciente;
    private Equipamento equip;
    private Enfermaria enf;
    private int cama;
    
    public Paciente(String nomePaciente, int codPaciente, Enfermaria enf){
        this.nomePaciente=nomePaciente;
        this.codPaciente=codPaciente;
        this.enf=enf;
        if(enf.getListaPaciente().size()<enf.getCamas()){
            
            cama++;
            
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
    public Enfermaria getEnfermaria(){
        return enf;
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
   
}
