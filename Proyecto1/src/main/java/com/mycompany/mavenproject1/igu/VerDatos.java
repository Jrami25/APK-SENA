/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1.igu;

import com.mycompany.mavenproject1.logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {
    
    Controladora control = null;
    
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 42)); // NOI18N
        jLabel1.setText("VISUALIZACION DE DATOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit)
                    .addComponent(btnEliminar))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(tablaCar.getRowCount()>0){
            if(tablaCar.getSelectedRow()!=-1){
                int num_owner = integer.parseInt(String.valueOf(tablaCar.getValueAt(tablaCar.getSelectedRow(),0)));
                control.borrarCar(id_owner);
                
                mostrarMensaje("Registro Eliminado Correctamente", "info", "Borrado de Auto");
                cargarTabla();
                
                JOptionPane optionPane = new JOptionPane("Datos guardados correctamente");
    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    JDialog dialog = optionPane.createDialog("Guardado exitoso");
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);
            }
            else{
                mostrarMensaje("No selecciono ningun carro", "Error", "Error al eliminar")
            }
        }
        else{
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
            
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(tablaCar.getRowCount()>0){
            if(tablaCar.getSelectedRow()!=-1){
                int num_car = integer.parseInt(String.valueOf(tablaCar.getValueAt(tablaCar.getSelectedRow(),0)));
                control.borrarCar(cc_owner);
                
                ModificarDatos pantallamodif = new ModificarDatos(id_Owner);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                Carowner Car modif = new ModificarCar(cc_owner,car);
                
                mostrarMensaje("Registro editado correctamente", "info", "Editado de Auto");
                cargarTabla();
                
                JOptionPane optionPane = new JOptionPane("Datos editados correctamente");
    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    JDialog dialog = optionPane.createDialog("Editado exitoso");
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);
            
            
            }
            else{
                mostrarMensaje("No selecciono ningun carro para editar", "Error", "Error al editar")
            }
        }
        else{
            mostrarMensaje("No hay nada para editar en la tabla", "Error", "Error al editar");
            
        }
    }//GEN-LAST:event_btnEditActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("info")){
    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    }
        else if(tipo.equals("Error_Message")){  
            }
        
    JDialog dialog = optionPane.createDialog(titulo);
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);
    }
        
            

        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modelotabla= new DefaultTableModel();       
        }
    public boolean isCellEditable( int row, int column){
                return false;
            }
    
    String titulos[] = {"Num", "Tipo", "Marca", "Modelo", "Matricula", "Descrpt"};
    tabla.setColumnIdentifiers(titulos);

    control.dataCar();
    
    List <Carros> listaCarros = control.dataCar();
    
    if(listaCarros!=null){
        for(Carros owcar : listaCarros){
            Object[] objeto = {owcar.getBrand(), owcar.getModel() , owcar.getRegistrationf() , owcar.getType() , owcar.getDescription() }
        owcar.getUnOwner(), owcar.getownersname(), owcar.getCC_owner()};
        
        modelotabla.addRow(objeto);
        
}
    
    tablaCar.setModel(modelotabla);




