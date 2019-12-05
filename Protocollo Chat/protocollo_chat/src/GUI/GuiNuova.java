package GUI;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author JellyLama
 */
public class GuiNuova extends javax.swing.JFrame
{
    //istanza della connessione con il server
    private Connessione connessione;
    private GuiRegistrazione gr;
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

        TabbedPanelUtoU = new javax.swing.JTabbedPane();
        PanelPrivate = new javax.swing.JPanel();
        TextFieldMessaggio = new javax.swing.JTextField();
        ButtonInvio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelStato = new javax.swing.JLabel();
        ButtonConnessione = new javax.swing.JButton();
        labelProfile = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextFieldDst = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaMessaggi = new javax.swing.JTextArea();
        PanelPublic = new javax.swing.JPanel();
        TextFieldMessaggioPu = new javax.swing.JTextField();
        ButtonInvioPu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelStatoPu = new javax.swing.JLabel();
        ButtonConnessionePu = new javax.swing.JButton();
        labelProfilePu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaMessaggiPu = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat");

        TabbedPanelUtoU.setName(""); // NOI18N

        PanelPrivate.setBackground(new java.awt.Color(204, 204, 204));

        TextFieldMessaggio.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldMessaggio.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldMessaggio.setEnabled(false);
        TextFieldMessaggio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TextFieldMessaggioActionPerformed(evt);
            }
        });
        TextFieldMessaggio.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                TextFieldMessaggioKeyPressed(evt);
            }
        });

        ButtonInvio.setBackground(new java.awt.Color(51, 51, 51));
        ButtonInvio.setForeground(new java.awt.Color(255, 255, 255));
        ButtonInvio.setText("Invio");
        ButtonInvio.setEnabled(false);
        ButtonInvio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonInvioActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Scrivi il messaggio:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Stato:");

        labelStato.setBackground(new java.awt.Color(204, 204, 204));
        labelStato.setForeground(new java.awt.Color(255, 0, 0));
        labelStato.setText("non connesso");
        labelStato.setIconTextGap(2);
        labelStato.setMaximumSize(new java.awt.Dimension(33, 16));
        labelStato.setMinimumSize(new java.awt.Dimension(33, 16));

        ButtonConnessione.setBackground(new java.awt.Color(204, 204, 204));
        ButtonConnessione.setText("Connetti");
        ButtonConnessione.setToolTipText("");
        ButtonConnessione.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonConnessioneActionPerformed(evt);
            }
        });

        labelProfile.setBackground(new java.awt.Color(204, 204, 204));
        labelProfile.setForeground(new java.awt.Color(0, 0, 255));
        labelProfile.setIconTextGap(2);
        labelProfile.setMaximumSize(new java.awt.Dimension(33, 16));
        labelProfile.setMinimumSize(new java.awt.Dimension(33, 16));
        labelProfile.setPreferredSize(new java.awt.Dimension(80, 16));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Destinazione:");

        TextFieldDst.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldDst.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldDst.setEnabled(false);

        TextAreaMessaggi.setEditable(false);
        TextAreaMessaggi.setBackground(new java.awt.Color(255, 255, 255));
        TextAreaMessaggi.setColumns(20);
        TextAreaMessaggi.setRows(5);
        jScrollPane1.setViewportView(TextAreaMessaggi);

        javax.swing.GroupLayout PanelPrivateLayout = new javax.swing.GroupLayout(PanelPrivate);
        PanelPrivate.setLayout(PanelPrivateLayout);
        PanelPrivateLayout.setHorizontalGroup(
            PanelPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrivateLayout.createSequentialGroup()
                .addGroup(PanelPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrivateLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PanelPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrivateLayout.createSequentialGroup()
                                .addGroup(PanelPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TextFieldDst)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonInvio))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelPrivateLayout.createSequentialGroup()
                                .addComponent(ButtonConnessione, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelStato, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(PanelPrivateLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelPrivateLayout.setVerticalGroup(
            PanelPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrivateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldDst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldMessaggio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonInvio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonConnessione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        TabbedPanelUtoU.addTab("Private", PanelPrivate);

        PanelPublic.setBackground(new java.awt.Color(204, 204, 204));

        TextFieldMessaggioPu.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldMessaggioPu.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldMessaggioPu.setEnabled(false);
        TextFieldMessaggioPu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TextFieldMessaggioPuActionPerformed(evt);
            }
        });
        TextFieldMessaggioPu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                TextFieldMessaggioPuKeyPressed(evt);
            }
        });

        ButtonInvioPu.setBackground(new java.awt.Color(51, 51, 51));
        ButtonInvioPu.setForeground(new java.awt.Color(255, 255, 255));
        ButtonInvioPu.setText("Invio");
        ButtonInvioPu.setEnabled(false);
        ButtonInvioPu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonInvioPuActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Scrivi il messaggio:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Stato:");

        labelStatoPu.setBackground(new java.awt.Color(204, 204, 204));
        labelStatoPu.setForeground(new java.awt.Color(255, 0, 0));
        labelStatoPu.setText("non connesso");
        labelStatoPu.setIconTextGap(2);
        labelStatoPu.setMaximumSize(new java.awt.Dimension(33, 16));
        labelStatoPu.setMinimumSize(new java.awt.Dimension(33, 16));

        ButtonConnessionePu.setBackground(new java.awt.Color(204, 204, 204));
        ButtonConnessionePu.setText("Connetti");
        ButtonConnessionePu.setToolTipText("");
        ButtonConnessionePu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonConnessionePuActionPerformed(evt);
            }
        });

        labelProfilePu.setBackground(new java.awt.Color(204, 204, 204));
        labelProfilePu.setForeground(new java.awt.Color(0, 0, 255));
        labelProfilePu.setIconTextGap(2);
        labelProfilePu.setMaximumSize(new java.awt.Dimension(33, 16));
        labelProfilePu.setMinimumSize(new java.awt.Dimension(33, 16));
        labelProfilePu.setPreferredSize(new java.awt.Dimension(80, 16));

        TextAreaMessaggiPu.setEditable(false);
        TextAreaMessaggiPu.setBackground(new java.awt.Color(255, 255, 255));
        TextAreaMessaggiPu.setColumns(20);
        TextAreaMessaggiPu.setRows(5);
        jScrollPane2.setViewportView(TextAreaMessaggiPu);

        javax.swing.GroupLayout PanelPublicLayout = new javax.swing.GroupLayout(PanelPublic);
        PanelPublic.setLayout(PanelPublicLayout);
        PanelPublicLayout.setHorizontalGroup(
            PanelPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPublicLayout.createSequentialGroup()
                .addGroup(PanelPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPublicLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PanelPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPublicLayout.createSequentialGroup()
                                .addGroup(PanelPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldMessaggioPu, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonInvioPu))
                            .addGroup(PanelPublicLayout.createSequentialGroup()
                                .addComponent(ButtonConnessionePu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelProfilePu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelStatoPu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(PanelPublicLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelPublicLayout.setVerticalGroup(
            PanelPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPublicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldMessaggioPu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonInvioPu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonConnessionePu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStatoPu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelProfilePu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65))
        );

        TabbedPanelUtoU.addTab("Public", PanelPublic);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPanelUtoU, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPanelUtoU, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonConnessioneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonConnessioneActionPerformed
    {//GEN-HEADEREND:event_ButtonConnessioneActionPerformed
        if("Connetti".equals(ButtonConnessione.getText()))
        {
            this.connessione = new Connessione();

            //istanzia la gui per la registrazione
            gr = new GuiRegistrazione(this, connessione);
            //fa apparire la gui per la registrazione
            gr.setVisible(true);
            //disabilita la gui corrente
            this.setEnabled(false);
        }
        else if("Disconnetti".equals(ButtonConnessione.getText()))
        {
            try
            {
                this.connessione.disconnetti();
                
                //cambia il bottone nella home da Disconnetti a Connetti
                this.setButtonConnessioneText("Connetti");

                //imposta lo stato
                this.setLabelStatoColor(Color.red);
                this.setLabelStatoText("non connesso");

                //imposta il profilo
                this.setLabelProfileText("");

                //scrive il destinatario nella finestra della chat
                this.TextAreaMessaggiPu.setText("");

                //Disabilita la scrittura di messaggi 
                this.setTextFieldMessaggio(false);

                //Disabilita il bottone per l'invio dei messaggi
                this.setButtonInvio(false);

                //Disabilita la scrittura del destinatario
                this.setTextFieldDst(false);
            }
            catch( IOException ex )
            {
                Logger.getLogger(GuiNuova.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ButtonConnessioneActionPerformed

    private void ButtonInvioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonInvioActionPerformed
    {//GEN-HEADEREND:event_ButtonInvioActionPerformed
        try
        {
            this.connessione.UsertoUser(this.TextFieldDst.getText(), this.TextFieldMessaggio.getText());
            this.TextAreaMessaggi.append(this.gr.getUsername() + ": " + this.TextFieldMessaggio.getText() + "\n");
            this.TextFieldMessaggio.setText("");
        }
        catch( Exception ex )
        {
            Logger.getLogger(GuiNuova.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonInvioActionPerformed

    private void TextFieldMessaggioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TextFieldMessaggioActionPerformed
    {//GEN-HEADEREND:event_TextFieldMessaggioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMessaggioActionPerformed

    private void TextFieldMessaggioKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TextFieldMessaggioKeyPressed
    {//GEN-HEADEREND:event_TextFieldMessaggioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMessaggioKeyPressed

    private void TextFieldMessaggioPuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TextFieldMessaggioPuActionPerformed
    {//GEN-HEADEREND:event_TextFieldMessaggioPuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMessaggioPuActionPerformed

    private void TextFieldMessaggioPuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TextFieldMessaggioPuKeyPressed
    {//GEN-HEADEREND:event_TextFieldMessaggioPuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMessaggioPuKeyPressed

    private void ButtonInvioPuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonInvioPuActionPerformed
    {//GEN-HEADEREND:event_ButtonInvioPuActionPerformed
        String msg = this.TextFieldMessaggioPu.getText();
        try
        {
            this.connessione.UsertoChat(msg);
            this.TextFieldMessaggioPu.setText("");
            this.TextAreaMessaggiPu.append(this.gr.getUsername() + ": " + msg + "\n");
        }
        catch( Exception ex )
        {
            Logger.getLogger(GuiNuova.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonInvioPuActionPerformed

    private void ButtonConnessionePuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonConnessionePuActionPerformed
    {//GEN-HEADEREND:event_ButtonConnessionePuActionPerformed
        if("Connetti".equals(ButtonConnessione.getText()))
        {
            this.connessione = new Connessione();

            //istanzia la gui per la registrazione
            gr = new GuiRegistrazione(this, connessione);
            //fa apparire la gui per la registrazione
            gr.setVisible(true);
            //disabilita la gui corrente
            this.setEnabled(false);
        }
        else if("Disconnetti".equals(ButtonConnessione.getText()))
        {
            try
            {
                this.connessione.disconnetti();
                
                //cambia il bottone nella home da Disconnetti a Connetti
                this.setButtonConnessioneText("Connetti");

                //imposta lo stato
                this.setLabelStatoColor(Color.red);
                this.setLabelStatoText("non connesso");

                //imposta il profilo
                this.setLabelProfileText("");

                //scrive il destinatario nella finestra della chat
                this.TextAreaMessaggiPu.setText("");

                //Disabilita la scrittura di messaggi 
                this.setTextFieldMessaggio(false);

                //Disabilita il bottone per l'invio dei messaggi
                this.setButtonInvio(false);

                //Disabilita la scrittura del destinatario
                this.setTextFieldDst(false);
            }
            catch( IOException ex )
            {
                Logger.getLogger(GuiNuova.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ButtonConnessionePuActionPerformed
    
    public void setLabelStatoColor(Color c)
    {
        this.labelStato.setForeground(c);
        this.labelStatoPu.setForeground(c);
    }
    public void setLabelStatoText(String s)
    {
        this.labelStato.setText(s);
        this.labelStatoPu.setText(s);
    }
    public void setLabelProfileText(String s)
    {
        this.labelProfile.setText(s);
        this.labelProfilePu.setText(s);
    }
    public void setButtonConnessioneText(String s)
    {
        this.ButtonConnessione.setText(s);
        this.ButtonConnessionePu.setText(s);
    }
    public void setButtonInvio(Boolean b)
    {
        this.ButtonInvio.setEnabled(b);
        this.ButtonInvioPu.setEnabled(b);
    }
    public void setTextAreaMessaggi(String s)
    {
        this.TextAreaMessaggi.append(s+"\n");
    }
    public void setTextAreaMessaggi1(String s)
    {
        this.TextAreaMessaggiPu.append(s+"\n");
    }
    public void setTextFieldMessaggio(boolean b)
    {
        this.TextFieldMessaggio.setEnabled(b);
        this.TextFieldMessaggioPu.setEnabled(b);
    }
    public void setTextFieldDst(boolean b)
    {
        this.TextFieldDst.setEnabled(b);
    }
    public String getAlias()
    {
        return this.gr.getUsername();
    }
    
    public boolean socketClosed()
    {
        return connessione.getSocket().isClosed();
    }

    public Connessione getConnessione()
    {
        return connessione;
    }
    
    
               
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonConnessione;
    private javax.swing.JButton ButtonConnessionePu;
    private javax.swing.JButton ButtonInvio;
    private javax.swing.JButton ButtonInvioPu;
    private javax.swing.JPanel PanelPrivate;
    private javax.swing.JPanel PanelPublic;
    private javax.swing.JTabbedPane TabbedPanelUtoU;
    private javax.swing.JTextArea TextAreaMessaggi;
    private javax.swing.JTextArea TextAreaMessaggiPu;
    private javax.swing.JTextField TextFieldDst;
    private javax.swing.JTextField TextFieldMessaggio;
    private javax.swing.JTextField TextFieldMessaggioPu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelProfile;
    private javax.swing.JLabel labelProfilePu;
    private javax.swing.JLabel labelStato;
    private javax.swing.JLabel labelStatoPu;
    // End of variables declaration//GEN-END:variables
}
