/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.Enfermaria;
import Backend.Equipamento;
import Backend.Hospital;
import Backend.Medico;
import Backend.Paciente;
import Backend.Sistema;
import Backend.Utilizador;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Pinto
 */
public class EditarPaciente extends javax.swing.JFrame {
    private static Sistema sist;
       private static Hospital hosp;
       private static Utilizador user;
       private static Paciente pac;
       private static Enfermaria enf;

    /**
     * Creates new form EditarPaciente
     */
    public EditarPaciente(Sistema sist, Utilizador user, Hospital hosp, Paciente pac) {
        this.sist = sist;
        this.user = user;
        this.hosp = hosp;
        this.pac = pac;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Paciente");

        jLabel1.setText("Nome do Paciente");

        jTextField1.setText(pac.getNome());

        jLabel2.setText("Localidade");

        jTextField2.setText(pac.getLocalidade());

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Estado");

        jLabel4.setText("Enfermaria");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Equipamento");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Médico");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>());
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        String[] est = new String[]{"Ligeiro", "Moderado", "Grave"};

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(est));
        String[] codEnf = new String[hosp.getListaEnfermaria().size()];
        ArrayList<String> listaenf = new ArrayList<String>();
        for(Enfermaria e : hosp.getListaEnfermaria()){
            listaenf.add(e.getCodEnf());
        }

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(listaenf.toArray(codEnf)));
        if(enf == null){

        }
        else{
            String[] equip = new String[enf.getListaEquipamento().size()+1];

            ArrayList<String> listaequip = new ArrayList<String>();
            for(Equipamento eq : enf.getListaEquipamento()){
                listaequip.add(eq.getNome() +" " +eq.getCodigoEquipamento());
            }
            listaequip.add("Nenhum equipamento");
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(listaequip.toArray(equip)));
        }
        String[] medicos = new String[hosp.getListaMedicos().size()];

        ArrayList<String> listamed = new ArrayList<String>();
        for(Medico m : hosp.getListaMedicos()){
            listamed.add(m.getNomeTrabalhador() +" " +m.getCodigoTrabalhador());
        }

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(listamed.toArray(medicos)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
       enf = hosp.getListaEnfermariaLivres().get(jComboBox1.getSelectedIndex());
       
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new MenuPaciente(sist,user, hosp).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty())){
            String nome = jTextField1.getText();
            String local = jTextField2.getText();
            //mudar enfermaria 
            int i = jComboBox1.getSelectedIndex();
            Enfermaria e = hosp.getListaEnfermaria().get(i);
             if(e.equals(pac.getEnfermaria())){
                
            }
            else{
                 try{
                pac.getEnfermaria().removerPaciente(pac);
                pac.setEnfermaria(e);
                e.setPaciente(pac);
             
            for(HashMap.Entry<Integer, Paciente> entry : e.getCamaPaciente().entrySet()){
           
            if(entry.getValue()==pac){
                int it= entry.getKey();
                pac.setCama(it);
                    }
                }
            
                 }
                 catch(Exception ex){
                     JOptionPane.showMessageDialog(null,
                    "Selecione outra enfermaria para colocar o Paciente",
                    "Enfermaria Cheia",
                    JOptionPane.ERROR_MESSAGE);
                 }
            }
             //associar equipamento
            int b = jComboBox3.getSelectedIndex();
            Equipamento eq;
            if(jComboBox3.getSelectedItem().toString().equals("Nenhum equipamento")){
                
            }
            else{
                 eq = e.getListaEquipamento().get(b);
                 pac.setEquipamento(eq);
                 eq.setPaciente(pac);
            }
           
            
            pac.setNome(nome);
            pac.setLocalidade(local);
            
            //associar o paciente a um médico
            int x =jComboBox4.getSelectedIndex();
            
            Medico med = hosp.getListaMedicos().get(x);
            if(med.equals(pac.getMedico())){
                
            }
            else{
                pac.setMedico(med);
                med.getListaPac().add(pac); 
            }
            
            
            //definir estado
            String estado = (String) jComboBox2.getSelectedItem();
            pac.setEstado(estado);
            sist.gravarSistema();
            this.dispose();
            new MenuPaciente(sist, user, hosp).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,
    "Preencha todos os campos",
    "Erro",
    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        enf = hosp.getListaEnfermaria().get(jComboBox1.getSelectedIndex());
        atualizarEquipamento();
        atualizarMedico();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        enf = hosp.getListaEnfermaria().get(jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jComboBox4ActionPerformed
       
    private void atualizarEquipamento(){
        
            String[] listasEquip = new String[enf.getListaEquipamento().size()+1];
            ArrayList<String> listas = new ArrayList<String>();
            for(Equipamento eq : enf.getListaEquipamento()){
                listas.add(eq.getCodigoEquipamento() + " " +eq.getNome());
            }
            listas.add("Nenhum equipamento");
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(listas.toArray(listasEquip)));
            System.out.println("Atualizado");
        
    }
        
        
        
    private void atualizarMedico()
        {
            ArrayList<Medico> listaMedicosEnf= new ArrayList<Medico>();
            for(Medico m : hosp.getListaMedicos()){
                if(m.getEnfermaria().equals(enf)){
                    listaMedicosEnf.add(m);
                }
            }
            String[] medicos = new String[listaMedicosEnf.size()];

            ArrayList<String> listamed = new ArrayList<String>();
            for(Medico m : listaMedicosEnf){
                listamed.add(m.getNomeTrabalhador() +" " +m.getCodigoTrabalhador());
            }

            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(listamed.toArray(medicos)));
        }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPaciente(sist, user, hosp, pac).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
