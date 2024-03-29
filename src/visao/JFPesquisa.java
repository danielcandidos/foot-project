package visao;

import bean.Jogador;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import negocio.ControleBanco;
import java.util.Collections;

/**
 *
 * @author Daniel
 */
public class JFPesquisa extends javax.swing.JFrame {
    private ArrayList<String> lista_jog;
    private Jogador jogador;
    static Collections col;

    public JFPesquisa(){        
        initComponents();
    }

    @Override
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icones/foot.png"));
       return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jBPassar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jBVisu = new javax.swing.JButton();
        jBClear = new javax.swing.JButton();
        jLMensagem = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("Buscar Jogador");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField1MouseExited(evt);
            }
        });
        jTextField1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTextField1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextField1MouseMoved(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 155, 35));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lucas", "Neymar", "Ronaldinho", " " }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 160, 35));

        jBPassar.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jBPassar.setText("Buscar");
        jBPassar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPassarActionPerformed(evt);
            }
        });
        getContentPane().add(jBPassar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 80, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confere? ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jPanel1.setMaximumSize(new java.awt.Dimension(392, 170));
        jPanel1.setOpaque(false);
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Foot Project\\Im_Jogadores\\padrao.jpg")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Nome do Jogador Completo");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setText("Idade:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setText("Clube Atual:");

        jLabel5.setText("         ");

        jLabel6.setText("          ");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(jLabel3)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(jLabel4)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 260, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(11, 11, 11)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel2)
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(jLabel5))
                        .add(11, 11, 11)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(jLabel6))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 138, -1, -1));

        jBBuscar.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jBBuscar.setText("Confirmar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 88, 95, 32));

        jBVisu.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jBVisu.setText("Visualizar");
        jBVisu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisuActionPerformed(evt);
            }
        });
        getContentPane().add(jBVisu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 100, 33));

        jBClear.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jBClear.setText("Limpar");
        jBClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearActionPerformed(evt);
            }
        });
        getContentPane().add(jBClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 88, 95, 32));

        jLMensagem.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLMensagem.setForeground(new java.awt.Color(204, 0, 0));
        jLMensagem.setText("       ");
        getContentPane().add(jLMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/BG_Pesquisar.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 390));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-506)/2, (screenSize.height-423)/2, 506, 423);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVisuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisuActionPerformed
        try {
            this.setVisible(false);
            JFVisualiza janelaVisualizar = new JFVisualiza(jogador);
            janelaVisualizar.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(JFPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBVisuActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            ControleBanco banco = new ControleBanco();
            banco.conectarBanco();
            //Retorno de cada atributo da tabela jogador
            jogador = banco.buscarJogador(jComboBox1.getSelectedItem().toString());//É AQUI!
            jLabel2.setText(jogador.getNomeComp());//nome
            jLabel5.setText(jogador.getDataNasc());//data de nascimento 
            jLabel6.setText(jogador.getClubeAtual());//clube atual
            //imagem do jogador setada na Label
            jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Foot Project\\Im_Jogadores\\"+jogador.getImagem()+".jpg"));
        } catch (Exception ex) {
            Logger.getLogger(JFPesquisa.class.getName()).log(Level.SEVERE, null, ex);            
        }        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClearActionPerformed
        ControleBanco banco = new ControleBanco();
        try {
            lista_jog = banco.buscaListaJog();
        } catch (Exception ex) {
            Logger.getLogger(JFPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComboBox1.removeAllItems();
        col.sort(lista_jog);
        for (int i = 0; i<lista_jog.size(); i++) {
            jComboBox1.addItem(lista_jog.get(i));
        }
        jComboBox1.updateUI();
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Foot Project\\Im_Jogadores\\Padrao.jpg"));
        jLabel2.setText("Nome do Jogador Completo");
        jLabel5.setText("");
        jLabel6.setText("");
        jTextField1.setText("Buscar Jogador");
        jLMensagem.setText("");
        
    }//GEN-LAST:event_jBClearActionPerformed

    private void jBPassarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPassarActionPerformed
        try {            
            ControleBanco banco = new ControleBanco();
            lista_jog=banco.buscaParcial(jTextField1.getText());
            if (lista_jog.size() > 0){
                jComboBox1.removeAllItems();
                col.sort(lista_jog);
                for (int i = 0; i<lista_jog.size(); i++) {
                    jComboBox1.addItem(lista_jog.get(i));
                }
                jComboBox1.updateUI();
                jLMensagem.setText("");
            } else {
                jLMensagem.setText("Jogador não encontrado");
            }              
        } catch (Exception ex) {
            Logger.getLogger(JFPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jBPassarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseMoved
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseMoved

    private void jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseExited
        //String nova = jTextField1.getText();
        //jTextField1.setText(nova);
    }//GEN-LAST:event_jTextField1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        JFInicial jFInicial = new JFInicial();
        jFInicial.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jTextField1MouseDragged(java.awt.event.MouseEvent evt){
        //
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
            java.util.logging.Logger.getLogger(JFPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new JFPesquisa().setVisible(true);                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBClear;
    private javax.swing.JButton jBPassar;
    private javax.swing.JButton jBVisu;
    private javax.swing.JButton jButton1;
    public javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLMensagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
