/*
 * Aplicacion de cifrado/descifrado
 * con el algoritmo RC4
 */
package rc4;

/**
 *
 * @author Ivan Garcia Miranda y Alvaro Alonso Isla
 */
public class Frame extends javax.swing.JFrame {
    //Variables
    private Rc4 cifrador;
    String texto;
    /**
     * Creates new form Frame
     */
    public Frame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        txt_clave = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_plano = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_cifrado = new javax.swing.JTextArea();
        Lclave = new javax.swing.JLabel();
        lTxtPlano = new javax.swing.JLabel();
        ltxtCifrado = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        select_cifrado = new javax.swing.JRadioButton();
        select_descifrado = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RC4Frame");
        setBackground(new java.awt.Color(50, 50, 50));
        setBounds(new java.awt.Rectangle(20, 50, 800, 600));

        txt_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_claveActionPerformed(evt);
            }
        });
        txt_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_claveKeyTyped(evt);
            }
        });

        txt_plano.setColumns(20);
        txt_plano.setRows(5);
        txt_plano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_planoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txt_plano);

        txt_cifrado.setEditable(false);
        txt_cifrado.setColumns(20);
        txt_cifrado.setRows(5);
        jScrollPane2.setViewportView(txt_cifrado);

        Lclave.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        Lclave.setText("Clave");

        lTxtPlano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lTxtPlano.setText("Texo Plano");

        ltxtCifrado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ltxtCifrado.setText("Texto Cifrado");

        btn.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        btn.setText("Cifrar");
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMouseClicked(evt);
            }
        });
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        buttonGroup1.add(select_cifrado);
        select_cifrado.setSelected(true);
        select_cifrado.setText("Cifrar");
        select_cifrado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                select_cifradoItemStateChanged(evt);
            }
        });
        select_cifrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_cifradoActionPerformed(evt);
            }
        });

        buttonGroup1.add(select_descifrado);
        select_descifrado.setText("Descifrar");
        select_descifrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_descifradoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Develop by: Alvaro Alonso & Ivan Garcia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(select_cifrado)
                .addGap(71, 71, 71)
                .addComponent(select_descifrado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_clave, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lTxtPlano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lclave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)
                        .addComponent(ltxtCifrado))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Lclave)
                                .addComponent(lTxtPlano)
                                .addComponent(ltxtCifrado))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_cifrado)
                    .addComponent(select_descifrado))
                .addGap(8, 8, 8)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_claveActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        
    }//GEN-LAST:event_btnActionPerformed

    private void txt_claveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_claveKeyTyped
        if(txt_clave.getText().length() > 32){
            evt.consume();
        }
    }//GEN-LAST:event_txt_claveKeyTyped

    //Accion al pulsar el boton
    private void btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseClicked
        //Si los textos son vacio
        if(txt_clave.getText().length() == 0 || txt_plano.getText().length() == 0){
            evt.consume();
        }else{
            //Guardamos los textos
            String clave = txt_clave.getText();
            String mensaje = txt_plano.getText();
            String cifrado = "";
            String res;
            String cero = "0"; 
            cifrador = new Rc4(clave);
            cifrador.ksa();
            
            //Si esta seleccionado cifrar
            if(select_cifrado.isSelected()){
                //recorremos el texto
                for(int v=0;v<mensaje.length();v++){
                    //Ciframos el mensaje
                    int r = mensaje.charAt(v) ^ cifrador.prga();
                    //pasamos a hexadecimal
                    res = Integer.toHexString(r);
                    //Concatenamos
                    if(res.length()<2){
                        res = cero.concat(res);
                    }
                    cifrado = cifrado.concat(res);
                }
            }else{
                //Desciframos si esta seleccionado
                cifrado = cifrador.descifra(mensaje);
            }
            //Escribimos el texto
            txt_cifrado.setText(cifrado);
        }
    }//GEN-LAST:event_btnMouseClicked

    private void select_cifradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_cifradoActionPerformed
        //Si el select esta en cifrado
        if(select_cifrado.isSelected()){
            lTxtPlano.setText("Texto Plano");
            lTxtPlano.repaint();
            ltxtCifrado.setText("Texto Cifrado");
            ltxtCifrado.repaint();
            btn.setText("Cifrar");
            btn.repaint();
            txt_cifrado.setText(null);
            txt_cifrado.repaint();
        }
    }//GEN-LAST:event_select_cifradoActionPerformed

    private void select_descifradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_descifradoActionPerformed
       //Si el select esta descifrado
        if(select_descifrado.isSelected()){
            lTxtPlano.setText("Mensaje cifrado");
            lTxtPlano.repaint();
            ltxtCifrado.setText("Mensaje original");
            ltxtCifrado.repaint();
            btn.setText("Descifrar");
            txt_plano.setText("");
            btn.repaint();
            txt_cifrado.setText(null);
            txt_cifrado.repaint();
        }
    }//GEN-LAST:event_select_descifradoActionPerformed

    private void select_cifradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_select_cifradoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_select_cifradoItemStateChanged

    private void txt_planoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_planoKeyTyped
        if(txt_plano.getText().length() > 255){
            evt.consume();
        }
    }//GEN-LAST:event_txt_planoKeyTyped

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lclave;
    private javax.swing.JButton btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lTxtPlano;
    private javax.swing.JLabel ltxtCifrado;
    private javax.swing.JRadioButton select_cifrado;
    private javax.swing.JRadioButton select_descifrado;
    private javax.swing.JTextArea txt_cifrado;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextArea txt_plano;
    // End of variables declaration//GEN-END:variables
}
