
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omen
 */
public class bigserver extends javax.swing.JFrame {

   ServerSocket welcomeSocket;
    DataInputStream din;
    DataOutputStream dout;
    public static final List<Socket> clients = new CopyOnWriteArrayList<Socket>();
    public static final List<String> IN=new CopyOnWriteArrayList<String>();
    ExecutorService pool=Executors.newFixedThreadPool(5);
    Socket connectionSocket;
    private String portt;
    DefaultListModel mod=new DefaultListModel();
    InetAddress ip;
    public bigserver() {
        initComponents();
        servertext.setEditable(false);
        servertext.setBackground(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        portTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        button1 = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        servertext = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 153));
        jLabel1.setText("Port :");

        portTxt.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        portTxt.setForeground(new java.awt.Color(102, 0, 153));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setText("online user:");

        jScrollPane1.setViewportView(jList1);

        button1.setBackground(new java.awt.Color(102, 0, 153));
        button1.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("online lisning");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 153));
        jLabel3.setText("status");

        servertext.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        servertext.setForeground(new java.awt.Color(102, 0, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(servertext))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(portTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(portTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(servertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if(portTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "you must enter a value");
        }
        else{
        TCP tcp=new TCP();
        Thread th2=new Thread(tcp);
        th2.start();
       try {
           ip = InetAddress.getLocalHost();
       } catch (Exception ex) {
           Logger.getLogger(bigserver.class.getName()).log(Level.SEVERE, null, ex);
       }
        servertext.setText("address: "+ip +", port: "+ portTxt.getText());
    }
    }//GEN-LAST:event_button1ActionPerformed
  private class TCP implements Runnable{
    
    public void run(){
        jList1.setModel(mod);
        try {
            portt=portTxt.getText();
            welcomeSocket = new ServerSocket(Integer.parseInt(portt));
        } catch (IOException ex) {
            Logger.getLogger(TCP.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(true) { 
  
            try { 
                connectionSocket = welcomeSocket.accept();
                clients.add(connectionSocket);
               // System.out.println(clients);
                
                ServerCon sc=new ServerCon();
                Thread tht=new Thread(sc);
                tht.start();
                
               
            } catch (IOException ex) {
                Logger.getLogger(TCP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
        
        
      private class ServerCon implements Runnable{
        int index;
        public void run(){
            try {
                din =new DataInputStream(connectionSocket.getInputStream());
            } catch (IOException ex) {
                Logger.getLogger(bigserver.class.getName()).log(Level.SEVERE, null, ex);
            }
            while (true) {                
                try {
                    String s=din.readUTF();
                   // System.out.println(s);
                    String [] tokkk=s.split(" ");
                    if(tokkk[1].equalsIgnoreCase("close")){
                        
                        for (String iii:IN){
                            if(tokkk[0].equalsIgnoreCase(iii)){
                                index=IN.indexOf(iii);
                                IN.remove(iii);
                            }
                        }
                        
                        clients.remove(index);
                        
                        String o=new String();
                        for(String item :IN){
                            o+=item+" ";
                        }
                        
                        //System.out.println(IN);
                        
                        for(Socket so:clients){
                            dout=new DataOutputStream(so.getOutputStream());
                            dout.writeUTF(o);
                        }

                        mod.removeAllElements();

                        String []to=o.split(" ");
                        for(String cc:to){
                            mod.addElement(cc);
                        }
                        
                        
                    }
                    
                    else {
                        IN.add(tokkk[0]);

                        String o=new String();
                        for(String item :IN){
                            o+=item+" ";
                        }

                        for(Socket so:clients){
                            dout=new DataOutputStream(so.getOutputStream());
                            dout.writeUTF(o);
                        }

                        mod.removeAllElements();

                        String []to=o.split(" ");
                        for(String cc:to){
                            mod.addElement(cc);
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(bigserver.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
            
            
        }
    }
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
            java.util.logging.Logger.getLogger(bigserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bigserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bigserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bigserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bigserver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField portTxt;
    private javax.swing.JTextField servertext;
    // End of variables declaration//GEN-END:variables
}
