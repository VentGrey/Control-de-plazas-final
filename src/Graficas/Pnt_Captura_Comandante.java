/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import MisClases.Comandante;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author omar
 */
public class Pnt_Captura_Comandante extends javax.swing.JInternalFrame {

    ArrayList<Comandante> datos = null;
    
    public void setDatos(ArrayList<Comandante> datos) {
        this.datos = datos;
    }
    /**
     * Creates new form Pnt_Captura_Comandante
     */
    public Pnt_Captura_Comandante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_ced = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_ape = new javax.swing.JTextField();
        txt_esp = new javax.swing.JTextField();
        txt_ant = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();

        setClosable(true);
        setTitle("Registro de Comandantes");

        jLabel2.setText("Número de Cédula:");

        jLabel3.setText("Nombre (s):");

        jLabel4.setText("Apellido Paterno:");

        jLabel5.setText("Especialidad:");

        jLabel6.setText("Antiguedad:");

        txt_ced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedActionPerformed(evt);
            }
        });

        txt_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomActionPerformed(evt);
            }
        });

        jLabel7.setText("(Max: 15 carácteres)");

        jLabel8.setText("(Max: 15 carácteres)");

        jLabel9.setText("(Max: 15 carácteres)");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("¡ÚNICO!");

        jLabel1.setText("Ingrese un número entero");

        btn_save.setText("Guardar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_esp, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(txt_ape, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nom, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ced, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_ced)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nom)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_ape)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_esp)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_ant)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedActionPerformed

    private void txt_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try {
        Integer Cedula = Integer.valueOf(txt_ced.getText());
        
        int flag = 0;
        
        String Nombre = txt_nom.getText();
        if(Nombre.length() > 15) {
            JOptionPane.showMessageDialog(null, "El nombre excede los 15 carácteres");
            flag += 1;
        }
        if(Nombre.length() < 1) {
            JOptionPane.showMessageDialog(null, "._. mínimo escribe algo");
            flag += 1;
        }
        
        String Apaterno = txt_ape.getText();
        if(Apaterno.length() > 15) {
            JOptionPane.showMessageDialog(null, "El nombre excede los 15 carácteres");
            flag += 1;
        }
        if(Apaterno.length() < 1) {
            JOptionPane.showMessageDialog(null, "._. mínimo escribe algo");
            flag += 1;
        }
        String Especialidad = txt_esp.getText();
        if(Especialidad.length() > 15) {
            JOptionPane.showMessageDialog(null, "El nombre excede los 15 carácteres");
            flag += 1;
        }
        if(Especialidad.length() < 1) {
            JOptionPane.showMessageDialog(null, "._. mínimo escribe algo");
            flag += 1;
        }
        
        Integer Antiguedad = Integer.valueOf(txt_ant.getText());
        
        Comandante c = new Comandante(Cedula);
        
        if(flag != 0) {
            JOptionPane.showMessageDialog(null, "Corrija los campos erróneos");
            txt_ced.setText("");
            txt_nom.setText("");
            txt_ape.setText("");
            txt_esp.setText("");
            txt_ant.setText("");
        }
        
        c.setNombre(Nombre);
        c.setApaterno(Apaterno);
        c.setEspecialidad(Especialidad);
        c.setAntiguedad(Antiguedad);
        
        this.datos.add(c);
        
        txt_ced.setText("");
        txt_nom.setText("");
        txt_ape.setText("");
        txt_esp.setText("");
        txt_ant.setText("");
       
        
        } catch(NumberFormatException e ) {
                JOptionPane.showMessageDialog(null, "Dije Números >:V");
        } 
    }//GEN-LAST:event_btn_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_ant;
    private javax.swing.JTextField txt_ape;
    private javax.swing.JTextField txt_ced;
    private javax.swing.JTextField txt_esp;
    private javax.swing.JTextField txt_nom;
    // End of variables declaration//GEN-END:variables
}
