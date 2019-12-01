/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author JellyLama
 */
public class GuiNuova extends javax.swing.JFrame
{
    
    private Connessione connessione;
    /**
     * Creates new form GuiNuova
     */
    public GuiNuova()
    {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaMessaggi = new javax.swing.JTextArea();
        TextFieldMessaggio = new javax.swing.JTextField();
        ButtonInvio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelStato = new javax.swing.JLabel();
        ButtonConnessione = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        TextAreaMessaggi.setBackground(new java.awt.Color(255, 255, 255));
        TextAreaMessaggi.setColumns(20);
        TextAreaMessaggi.setRows(5);
        jScrollPane1.setViewportView(TextAreaMessaggi);

        TextFieldMessaggio.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldMessaggio.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldMessaggio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TextFieldMessaggioActionPerformed(evt);
            }
        });

        ButtonInvio.setBackground(new java.awt.Color(51, 51, 51));
        ButtonInvio.setForeground(new java.awt.Color(255, 255, 255));
        ButtonInvio.setText("Invio");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Scrivi il messaggio:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Stato:");

        labelStato.setMaximumSize(new java.awt.Dimension(33, 16));
        labelStato.setMinimumSize(new java.awt.Dimension(33, 16));

        ButtonConnessione.setBackground(new java.awt.Color(204, 204, 204));
        ButtonConnessione.setText("Connessione al server");
        ButtonConnessione.setToolTipText("");
        ButtonConnessione.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonConnessioneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonConnessione)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelStato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TextFieldMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonInvio)))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonInvio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonConnessione)
                    .addComponent(jLabel2)
                    .addComponent(labelStato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldMessaggioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TextFieldMessaggioActionPerformed
    {//GEN-HEADEREND:event_TextFieldMessaggioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMessaggioActionPerformed

    private void ButtonConnessioneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonConnessioneActionPerformed
    {//GEN-HEADEREND:event_ButtonConnessioneActionPerformed
        connessione = new Connessione();
        try
        {
            if(connessione.Connetti() == 0)            
            {
                JOptionPane.showMessageDialog(null, "Il server è giù", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                labelStato.setText("Connected to: " + connessione.getServerIP());
            }
        }
        catch( IOException ex )
        {
            Logger.getLogger(GuiNuova.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonConnessioneActionPerformed

    //main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonConnessione;
    private javax.swing.JButton ButtonInvio;
    private javax.swing.JTextArea TextAreaMessaggi;
    private javax.swing.JTextField TextFieldMessaggio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelStato;
    // End of variables declaration//GEN-END:variables
}