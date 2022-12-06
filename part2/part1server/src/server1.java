

import java.awt.Color;
import java.io.*; 
import static java.lang.Integer.parseInt;
import java.net.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class server1 extends javax.swing.JFrame {
  
 InetSocketAddress IPAddress;
 public Thread threada,threada2;
  public String userName,txt2,txt3 ,txt,LocalIP,LocalPort,RemoteIP,RemotePort,tt;
 boolean flag = true;
 boolean op=false;
 boolean rec=false;
 Socket sok;
 DataInputStream datain;
 
 DefaultListModel mode=new DefaultListModel();
 Data dataa=new Data(); 
    public server1(){
        initComponents();
        text6.setEditable(false);
        text6.setBackground(null);
        text7.setEditable(false);
         text7.setBackground(null);
       
   
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        typeMsg = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        text8 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        text5 = new javax.swing.JTextField();
        onlineLabel = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        text2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text7 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        buttonSend = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        buttonTest = new java.awt.Button();
        button3 = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        chatArea = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        onlineList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        typeMsg.setColumns(20);
        typeMsg.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        typeMsg.setForeground(new java.awt.Color(102, 0, 153));
        typeMsg.setRows(5);
        typeMsg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                typeMsgFocusGained(evt);
            }
        });
        typeMsg.setText("enter text here");         typeMsg.setForeground(Color.GRAY);
        jScrollPane2.setViewportView(typeMsg);

        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 153));
        jLabel7.setText("Remote IP :");

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setText(" TCP server IP :");

        text6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text6ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 0, 204));
        jComboBox1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 0, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WIFI : 192.255.87.1" }));
        jComboBox1.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 153));
        jLabel9.setText("State :");

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 153));
        jLabel5.setText("Local IP :");

        text8.setEditable(false);
        text8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 153));
        jLabel6.setText("Local Port :");

        onlineLabel.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        onlineLabel.setForeground(new java.awt.Color(102, 0, 153));
        onlineLabel.setText("Online user :");

        text1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        text1.setForeground(new java.awt.Color(102, 0, 153));
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });

        button1.setActionCommand("login");
        button1.setBackground(new java.awt.Color(102, 0, 153));
        button1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Log in");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 153));
        jLabel8.setText("Remote Port :");

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 153));
        jLabel3.setText("TCP server port :");

        buttonSend.setBackground(new java.awt.Color(102, 0, 153));
        buttonSend.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        buttonSend.setForeground(new java.awt.Color(255, 255, 255));
        buttonSend.setLabel("Send");
        buttonSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSendMouseClicked(evt);
            }
        });
        buttonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 153));
        jLabel4.setText("Available interfaces");

        buttonTest.setBackground(new java.awt.Color(102, 0, 153));
        buttonTest.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        buttonTest.setForeground(new java.awt.Color(255, 255, 255));
        buttonTest.setLabel("Test Button");
        buttonTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTestActionPerformed(evt);
            }
        });

        button3.setActionCommand("Logout");
        button3.setBackground(new java.awt.Color(102, 0, 153));
        button3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setLabel("Log out");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(chatArea);

        jLabel10.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 153));
        jLabel10.setText(" User Name :");

        onlineList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                onlineListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(onlineList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(buttonTest, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(onlineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2))
                            .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3))
                            .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel5))
                            .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTest, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(onlineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSendMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_buttonSendMouseClicked

    private void buttonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendActionPerformed
        RemoteIP=text6.getText();
        RemotePort=text7.getText();
        if(RemoteIP.equals("")||RemotePort.equals("") ){
             JOptionPane.showMessageDialog(null, "you must select a online user");
        }else{
            if(typeMsg.getText().equals("")){
                JOptionPane.showMessageDialog(null, "please type some word to send");
            }else{
                 IPAddress=new InetSocketAddress(RemoteIP, Integer.parseInt(RemotePort));     
                 userName=text1.getText();
                 flag=false;
                 txt=typeMsg.getText();
            tt=typeMsg.getText();
            if(txt.isEmpty()){
            dataa.stop();
            }
            txt = userName+":"+txt;
        try {
            dataa.send(IPAddress, txt);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "try catch");
        }
        
        //change color's text
             StyledDocument doc = chatArea.getStyledDocument();
             Style style = chatArea.addStyle("", null);
             StyleConstants.setForeground(style, Color.BLUE);            
        try {
            doc.insertString(doc.getLength(), "Me: "+tt +"\n", style);//p1.setText(textx"Red")
        } catch (BadLocationException ex) {
          //  Logger.getLogger(server1.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null, "try catch 2");
        }
   
       
        typeMsg.setText("");
        }
    }
         
        

        
    }//GEN-LAST:event_buttonSendActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void text6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text6ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_text6ActionPerformed

    private void buttonTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTestActionPerformed
        // TODO add your handling code here:
        
          if( text5.getText() !="" && text7.getText() != ""){
            String localport=text5.getText();
            String remoteport=text7.getText();
            if(parseInt(localport)>1024 && parseInt(remoteport)>1024){
                if(parseInt(localport)== parseInt(remoteport)){
                    JOptionPane.showMessageDialog(null, "port unvalid chose another one");
                }else{
                    JOptionPane.showMessageDialog(null, "port valid");}

            }else{
                JOptionPane.showMessageDialog(null, "port unvalid chose another one");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "some field is empty!!\n plese fill all ");
        }

        LocalIP=text4.getText();
        LocalPort=text5.getText();
        RemoteIP=text6.getText();
        RemotePort=text7.getText();

        if(flag){
            try {
                dataa.dataport(Integer.parseInt(LocalPort));
            } catch (SocketException ex) {
                JOptionPane.showMessageDialog(null, "from test");
            }
            flag=false;
        }

        threada=new Thread(dataa);
        threada.start();
        IPAddress=new InetSocketAddress(RemoteIP, Integer.parseInt(RemotePort));
    }//GEN-LAST:event_buttonTestActionPerformed

    private void typeMsgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typeMsgFocusGained
        // TODO add your handling code here:
         if (typeMsg.getText().equals("enter text here")) {
            typeMsg.setText("");
            typeMsg.setForeground(Color.BLACK);
         }
    }//GEN-LAST:event_typeMsgFocusGained

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       if(text1.getText().equals("")){
           JOptionPane.showMessageDialog(null, "you must enter the user name");
       }else{
           if(text4.getText().equals("")||text5.getText().equals("")||text3.getText().equals("")||text2.getText().equals("")){
           JOptionPane.showMessageDialog(null, "some feild empty you must fill it");
           }else{
        op=true;
        onlineList.setModel(mode);
        
        String IPserv=text2.getText();
        String portserv=text3.getText();
        int serverPort=Integer.parseInt(portserv);
        try {
            
            sok =new Socket(IPserv,serverPort );
            ClientHandler chh=new ClientHandler(sok);
            threada2=new Thread(chh);
            threada2.start();
            
        DataOutputStream doutstream=new DataOutputStream(sok.getOutputStream());
        String login=text4.getText()+","+text5.getText()+" "+"open";
        doutstream.writeUTF(login);
        } catch (IOException ex) {
           // Logger.getLogger(server1.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, " you must enter the server ");
        }
       }
    }
        
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
         op=false;
        DataOutputStream doutstr=null;
        try {
            doutstr = new DataOutputStream(sok.getOutputStream());
            String log=text4.getText()+","+text5.getText()+" "+"close";
            doutstr.writeUTF(log);
        } catch (IOException ex) {
         //   Logger.getLogger(server1.class.getName()).log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null, "try catch 4");
        }      
        threada2.stop();
        mode.removeAllElements();
        chatArea.setText("");  
        text6.setText("");
        text7.setText("");
              
    }//GEN-LAST:event_button3ActionPerformed

    private void onlineListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_onlineListValueChanged
        // TODO add your handling code here:
         String selected=onlineList.getSelectedValue();
        if(! onlineList.isSelectionEmpty() && ! selected.isEmpty()){
            String []tokens =selected.split(",");
            text6.setText(tokens[0]);
            text7.setText(tokens[1]);
    }//GEN-LAST:event_onlineListValueChanged
    }
    
    private class ClientHandler implements Runnable{
        Socket socke;
        public ClientHandler(Socket s){
            
            socke=s;
            try {
                datain=new DataInputStream(socke.getInputStream());
            } catch (IOException ex) {
               // Logger.getLogger(server1.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, "try catch 7");
            }
        }
           @Override
        public void run(){
            while(true){
                try {
                    if(op){
                    String mmm=datain.readUTF();
                    //System.out.println(mmm);
                    mode.addElement("sss");
                    mode.removeAllElements();
                    
                    String []to=mmm.split(" ");
                   
                    for(String cc:to){
                        mode.addElement(cc);
                    }
                    
                    
                    for (String zzz:to){
                        
                        LocalIP=text4.getText();
                        LocalPort=text5.getText();
                        RemoteIP=text6.getText();
                        try {
                            if(flag){
                                dataa.dataport(Integer.parseInt(LocalPort));
                                flag=false;
                            }
                        } 
                        catch (SocketException ex) {
                           // Logger.getLogger(server1.class.getName()).log(Level.SEVERE, null, ex);
                           JOptionPane.showMessageDialog(null, "try catch 8");
                        }
                        threada=new Thread(dataa);
                        threada.start();
                        
                        String []tokens =zzz.split(",");
                        String RIPP=tokens[0];
                      //  t7.setText(tokens[1]);
                      String RRPort=tokens[1];
                       IPAddress=new InetSocketAddress(RIPP, Integer.parseInt(RRPort));
                    }
                    
                    }
                    if(rec){ }
                } catch (IOException ex) {
                   // Logger.getLogger(server1.class.getName()).log(Level.SEVERE, null, ex);
                   JOptionPane.showMessageDialog(null, "try catch 9");
                }
            }
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
            java.util.logging.Logger.getLogger(server1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(server1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(server1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(server1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                    new server1().setVisible(true);
                    new server1().setVisible(true);
                    new server1().setVisible(true);
                    new bigserver().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button3;
    private java.awt.Button buttonSend;
    private java.awt.Button buttonTest;
    private javax.swing.JTextPane chatArea;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel onlineLabel;
    private javax.swing.JList<String> onlineList;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    private javax.swing.JTextField text7;
    private javax.swing.JTextField text8;
    private javax.swing.JTextArea typeMsg;
    // End of variables declaration//GEN-END:variables


private  class Data implements Runnable{
    private boolean a;
      private DatagramSocket clientSocket;

       public Data() {  
        }
        
       public void dataport(int p) throws SocketException {
       clientSocket  =new DatagramSocket(p);
        }
       
       public void stop(){
        a=false;
        clientSocket.close();
       
    }
       
       public void send(InetSocketAddress address,String textx) throws IOException{
        
        byte[] sendData =textx.getBytes();
        DatagramPacket sendPacket=new DatagramPacket(sendData, sendData.length);
        sendPacket.setSocketAddress(address);
        clientSocket.send(sendPacket);
        text8.setText("Send to: IP="+text4.getText()+" ,"+"Port="+text7.getText());
    
    }
       
       @Override
    public void run(){
            byte[] receiveData = new byte[2048]; 
         DatagramPacket receivePacket=new DatagramPacket(receiveData, receiveData.length);
         
           while(true){
            try {
            clientSocket.receive(receivePacket);                
               String message = new String(receivePacket.getData(),0,receivePacket.getLength()); 
               int port=receivePacket.getPort();
                 //color's text
        StyledDocument docStyle = chatArea.getStyledDocument();
        Style style = chatArea.addStyle("",null);
        StyleConstants.setForeground(style, Color.red);
        try {
                docStyle.insertString(docStyle.getLength(), message+"\n", style);
            } 
            catch (BadLocationException ex) {
              //JOptionPane.showMessageDialog(null, "from color run");
              JOptionPane.showMessageDialog(null, "try catch 10 ");
            }
              
               text8.setText("Received from: IP="+text6.getText()+" ,"+"Port="+port);
            
            }
            catch (IOException ex) {
                break;
            }    
          
        }
    }
 }


}
