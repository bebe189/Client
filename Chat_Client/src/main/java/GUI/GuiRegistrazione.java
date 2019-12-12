package GUI;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author JellyLama
 */
public class GuiRegistrazione extends javax.swing.JFrame
{
    private String username;
    private String topic;
    //serve per avere l'istanza della gui precedente in modo da poterla riaprire o riattivare
    private GuiNuova home;
    //istanza della connessione con il server
    private Connessione c;
    /**
     * Creates new form GuiRegistrazione
     * @param g
     * @param c
     */
    public GuiRegistrazione(GuiNuova g, Connessione c)
    {
        initComponents();
        //imposta la gui precedente
        home = g;
        //imposta l'istanza della connessione con il server
        this.c = c;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername( String username )
    {
        this.username = username;
    }

    public String getTopic()
    {
        return topic;
    }

    public void setTopic( String topic )
    {
        this.topic = topic;
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
        TextFieldAlias = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        asd = new javax.swing.JLabel();
        TextFieldTopic = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buttonRegistrati = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TextFieldServerIP = new javax.swing.JTextField();
        ComboBoxIP = new javax.swing.JComboBox<>();
        ComboBoxUser = new javax.swing.JComboBox<>();

        setTitle("Registrazione");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        TextFieldAlias.setText("JellyLama");
        TextFieldAlias.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TextFieldAliasActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("UserName");

        asd.setBackground(new java.awt.Color(204, 204, 204));
        asd.setText("Topic");

        TextFieldTopic.setEditable(false);
        TextFieldTopic.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldTopic.setText("general");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Registrazione");

        buttonRegistrati.setText("Registrati");
        buttonRegistrati.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonRegistratiActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("ServerIP");

        TextFieldServerIP.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TextFieldServerIPActionPerformed(evt);
            }
        });

        ComboBoxIP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "127.0.0.1", "192.168.1.7", "188.216.231.30", "79.31.190.185" }));
        ComboBoxIP.setSelectedItem("");
        ComboBoxIP.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBoxIPActionPerformed(evt);
            }
        });

        ComboBoxUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JellyLama", "Barubba" }));
        ComboBoxUser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBoxUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonRegistrati, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asd)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldAlias)
                            .addComponent(TextFieldTopic)
                            .addComponent(TextFieldServerIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextFieldServerIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextFieldAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asd)
                    .addComponent(TextFieldTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonRegistrati)
                .addContainerGap(63, Short.MAX_VALUE))
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

    private void TextFieldAliasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TextFieldAliasActionPerformed
    {//GEN-HEADEREND:event_TextFieldAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAliasActionPerformed

    private void buttonRegistratiActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonRegistratiActionPerformed
    {//GEN-HEADEREND:event_buttonRegistratiActionPerformed
        //prende lo username digitato
        this.username = TextFieldAlias.getText();
        //prende il topic digitato
        this.topic = TextFieldTopic.getText();
        //imposta l'ip del server
        this.c.setServerIP(TextFieldServerIP.getText());
        
        if(!" ".equals(this.TextFieldServerIP.getText()) && this.username.length() > 6 && this.username.length() < 32 && !this.username.contains(" "))
        {
            this.c.setGuard(true);
            try
            {   
                   //invia la richiesta di registrazione
                if(c.ConnettiInviaRegistrazione(username, topic) == 0)  //se da esito negativo
                {
                    //apre un popup
                    JOptionPane.showMessageDialog(null, "Il server è giù", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
                }
                else //se da esito positivo
                {       
                    //Avvia il Thread per la ricezione dei messaggi
                    
                    Ricezione r1 =new Ricezione(this.c.getInput(), this.c.getOutput(), this.c.getSocket(), this.home);  
                    Thread t1 =new Thread(r1);  
                    t1.start();
                    
                    //cambia il bottone nella home da registrati a disconnetti
                    home.setButtonConnessioneText("Disconnetti");

                    //imposta lo stato
                    home.setLabelStatoColor(new Color(0,0,255));
                    home.setLabelStatoText("Connected to: " + c.getServerIP());

                    //imposta il profilo
                    home.setLabelProfileText("Username: " + this.username);

                    //riattiva la gui precedente
                    home.setEnabled(true);
                    
                    //scrive il destinatario nella finestra della chat
                    home.setTextAreaMessaggi1("Destination: " + this.TextFieldTopic.getText());
                    
                    //Abilita la scrittura di messaggi 
                    home.setTextFieldMessaggio(true);
                    
                    //Abilita il bottone per l'invio dei messaggi
                    home.setButtonInvio(true);             

                    //chiude la gui corrente
                    this.setVisible(false);
                    Repo.userS = this.username;
                }
            }
            catch( IOException ex )
            {
                Logger.getLogger(GuiRegistrazione.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else if("".equals(this.TextFieldServerIP.getText()))
        {
            //apre un popup
            JOptionPane.showMessageDialog(null, "Digitare o scegliere un IP!", "ATTENZIONE", JOptionPane.WARNING_MESSAGE); 
            
        }
        else if(this.username.length() > 32)
        {
            //apre un popup
            JOptionPane.showMessageDialog(null, "Il nome utente è TROPPO LUNGO! \nMAX 32 caratteri", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
            
            //svuota il campo username 
            TextFieldAlias.setText("");

        }
        else if(this.username.length() < 6)
        {
            //apre un popup
            JOptionPane.showMessageDialog(null, "Il nome utente è TROPPO CORTO! \nMIN 6 caratteri", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
            
            //svuota il campo username 
            TextFieldAlias.setText("");
        }
        else if(this.username.contains(" "))
        {
            //apre un popup
            JOptionPane.showMessageDialog(null, "Il nome utente CONTIENE SPAZI! \nSpazi non permessi", "ATTENZIONE", JOptionPane.WARNING_MESSAGE); 
            
            //svuota il campo username 
            TextFieldAlias.setText("");
        }

    }//GEN-LAST:event_buttonRegistratiActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        home.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void TextFieldServerIPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TextFieldServerIPActionPerformed
    {//GEN-HEADEREND:event_TextFieldServerIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldServerIPActionPerformed

    private void ComboBoxIPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxIPActionPerformed
    {//GEN-HEADEREND:event_ComboBoxIPActionPerformed
        this.TextFieldServerIP.setText(this.ComboBoxIP.getSelectedItem().toString());
    }//GEN-LAST:event_ComboBoxIPActionPerformed

    private void ComboBoxUserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxUserActionPerformed
    {//GEN-HEADEREND:event_ComboBoxUserActionPerformed
        this.TextFieldAlias.setText(this.ComboBoxUser.getSelectedItem().toString());
    }//GEN-LAST:event_ComboBoxUserActionPerformed

    public JTextField getTextFieldAlias()
    {
        return TextFieldAlias;
    }

    public void setTextFieldAlias( JTextField TextFieldAlias )
    {
        this.TextFieldAlias = TextFieldAlias;
    }

    public JTextField getTextFieldTopic()
    {
        return TextFieldTopic;
    }

    public void setTextFieldTopic( JTextField TextFieldTopic )
    {
        this.TextFieldTopic = TextFieldTopic;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxIP;
    private javax.swing.JComboBox<String> ComboBoxUser;
    private javax.swing.JTextField TextFieldAlias;
    private javax.swing.JTextField TextFieldServerIP;
    private javax.swing.JTextField TextFieldTopic;
    private javax.swing.JLabel asd;
    private javax.swing.JButton buttonRegistrati;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
