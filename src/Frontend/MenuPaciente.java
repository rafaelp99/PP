/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.Enfermaria;
import Backend.Hospital;
import Backend.ListaHospitais;
import Backend.Medico;
import Backend.Paciente;
import Backend.Sistema;
import Backend.Utilizador;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rafael Pinto
 */
public class MenuPaciente extends javax.swing.JFrame {
       private static Sistema sist;
       private static Hospital hosp;
       private static Utilizador user;
       private static ListaHospitais listH;
       AbstractTableModel tabela;
       private int i=0;
       
    /**
     * Creates new form MenuPaciente
     */
    public MenuPaciente(Sistema sist, Utilizador user, Hospital hosp) {
        this.sist = sist;
        this.user = user;
        this.hosp = hosp;
        initComponents();
        this.tabela= criarTabela();
        tabPaciente.setModel(tabela);
        this.setLocationRelativeTo(null);
        
    }
public AbstractTableModel criarTabela() {   
        String[] nomeColunas = {"Nome", "Código", "Código da Enfermaria", "Cama", "Médico", "Data de entrada", "Data da saída", "Estado"};
        
        tabPaciente.setAutoCreateRowSorter(true);

        return new AbstractTableModel() {     
            @Override
            public String getColumnName(int column) {
                return nomeColunas[column];
            }
           
            @Override
            public int getRowCount() {
                //Retorna o número de linhas que a tabela deverá ter
                return hosp.getListaPacientes().size();
            }

            @Override
            public int getColumnCount() {
                //Retorna o número de colunas que a tabela deverá ter
                return nomeColunas.length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
            /*
                Este método é invocado quando se pretende "popular" cada uma das células da tabela
                Se a tabela tem 3 linhas e 2 colunas existem 6 células (3*2), logo o método será invocado 6 vezes
                    rowIndex representa a linha da célula (0 a rowCount -1)
                    columnIndex representa a coluna da célula (0 a ColumnCount -1)
            */
                switch (columnIndex) {
                    case 0: 
                        return hosp.getListaPacientes().get(rowIndex).getNome();
                    
                    case 1:
                        return hosp.getListaPacientes().get(rowIndex).getCod();
                    case 2:
                        if(hosp.getListaPacientes().get(rowIndex).getEnfermaria()== null){
                            return "";
                        }
                else{
                        return hosp.getListaPacientes().get(rowIndex).getEnfermaria().getCodEnf();
                        }
                    case 3:
                        if(hosp.getListaPacientes().get(rowIndex).getCama() == 0){
                            return "";
                        }
                else{
                        return hosp.getListaPacientes().get(rowIndex).getCama();
                        }
                    case 4:
                       try{
                        return hosp.getListaPacientes().get(rowIndex).getMedico().getNomeTrabalhador();
                       }
                       catch (Exception NullPointerException){
                           return "";
                       }
                    case 5:
                        return hosp.getListaPacientes().get(rowIndex).getDataEntrada();
                        
                    case 6 :
                        return hosp.getListaPacientes().get(rowIndex).getDataSaida();    
                    case 7 :
                        return hosp.getListaPacientes().get(rowIndex).getEstado();
                   
                    default:
                        return "";
                        
                }
                
            } 
            
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabPaciente = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Paciente");

        tabPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabPaciente);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Dar Alta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Editar Dados");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Adcionar Paciente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/filtro.png")));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>());
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setVisible(false);
        jComboBox2.setVisible(false);
        jButton6.setVisible(false);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enfermaria", "Médico", "Estado"}));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton6.setVisible(false);
        jButton6.setText("Filtrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new MenuHospitais(user, sist).setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int row = tabPaciente.getSelectedRow();
        Paciente p = hosp.getPaciente(row);
        System.out.print(hosp.getListaEnfermaria().get(0).getListaEquipamento().size());
        new EditarPaciente(sist, user, hosp, p).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void btnAlta(){
        int row = tabPaciente.getSelectedRow();
        Paciente p = hosp.getPaciente(row);
        if(!p.getDataSaida().equals("")){
            jButton4.setEnabled(false);
            
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new CriarPaciente(sist, hosp, this).setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row = tabPaciente.getSelectedRow();
        Paciente p = hosp.getPaciente(row);
        Calendar today = Calendar.getInstance();
        p.setDataSaida(today);
        tabela.fireTableDataChanged();
        sist.gravarSistema();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(i==0){
        jComboBox3.setVisible(true);
        jComboBox2.setVisible(true);
        jButton6.setVisible(true);
        
        i=1;   
       }
       else if(i==1){
        jComboBox3.setVisible(false);
        jComboBox2.setVisible(false);
        jButton6.setVisible(false);
        i=0;
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        
        atualizarComboBox();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
      
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        filtrarTabela();
    }//GEN-LAST:event_jButton6ActionPerformed
 
     private void filtrarTabela(){
          String key = "";
          key = jComboBox2.getSelectedItem().toString();
          tabela =  (AbstractTableModel) tabPaciente.getModel();
          TableRowSorter<AbstractTableModel> rf = new TableRowSorter<AbstractTableModel>(tabela);
           tabPaciente.setRowSorter(rf);
           rf.setRowFilter(RowFilter.regexFilter(key));
          
     }
     private void atualizarComboBox(){
         switch(jComboBox3.getSelectedIndex()){
             case 0:
                String[] codEnf = new String[hosp.getListaEnfermaria().size()];
                ArrayList<String> listaenf = new ArrayList<String>();
                for(Enfermaria e : hosp.getListaEnfermaria()){
                    listaenf.add(e.getCodEnf());
                }

                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(listaenf.toArray(codEnf)));
                break;
             case 1:
                 String[] medico = new String[hosp.getListaMedicos().size()];
                 ArrayList<String> listamed = new ArrayList<String>();
                 for(Medico m: hosp.getListaMedicos()){
                     listamed.add(m.getNomeTrabalhador());
                 }
                 jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(listamed.toArray(medico)));
                 break;
             case 2:
                 jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Ligeiro", "Moderado", "Grave"}));
                 break;
         }
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
            java.util.logging.Logger.getLogger(MenuPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPaciente(sist, user, hosp).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabPaciente;
    // End of variables declaration//GEN-END:variables
}
