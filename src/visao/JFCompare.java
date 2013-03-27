/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import bean.Jogador;
import bean.Stats;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class JFCompare extends javax.swing.JFrame {
    Jogador jogador1, jogador2;
    Stats stats1, stats2;
    ArrayList arrayList = new ArrayList(12);
    /**
     * Creates new form JFCompare
     */
    public JFCompare(Jogador jog1, Jogador jog2) {
        initComponents();
        this.jogador1 = jog1;
        this.jogador2 = jog2;         
        this.setTitle("Comparação - "+jogador1.getNome()+" x "+jogador2.getNome());
        for (int i = 0; i<12; i++) {
            arrayList.add(0);
        }
        

    }
    public JFCompare() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @Override
//    public Image getIconImage(){
//        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icones/foot.png"));
//        return retValue;
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLFoto1 = new javax.swing.JLabel();
        jLFoto2 = new javax.swing.JLabel();
        jLNome1 = new javax.swing.JLabel();
        jLNome2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLFoto1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLFoto1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 39, 100, 100));

        jLFoto2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLFoto2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLFoto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 39, 100, 100));

        jLNome1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLNome1.setText("Neymar");
        getContentPane().add(jLNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 17, -1, -1));

        jLNome2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLNome2.setText("Lucas");
        getContentPane().add(jLNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 17, -1, -1));

        jTable1.setBackground(new java.awt.Color(240, 240, 240));
        jTable1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"100"},
                {""},
                {"100"},
                {""},
                {"100"},
                {""},
                {"100"},
                {null},
                {"100"},
                {null},
                {"100"},
                {null},
                {"100"},
                {""},
                {"100"},
                {null},
                {"100"}
            },
            new String [] {
                ""
            }
        ));
        jTable1.setGridColor(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 157, 55, 292));

        jButton1.setText("Filtrar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 111, 33));

        jButton2.setText("Vol");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 531, -1, -1));

        jTable2.setBackground(new java.awt.Color(240, 240, 240));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jTable2.setGridColor(new java.awt.Color(240, 240, 240));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 157, 56, 292));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jogos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 168, 83, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gols");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 195, 83, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Média Gols");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 229, 83, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Assistências");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 256, 83, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Média Assit.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 288, 83, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("C. Amarelos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 322, 83, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("C. Vermelhos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 356, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Gols Sofridos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 390, 83, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Defesas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 424, 83, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "2009", "2010", "2011", "2012" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 460, 95, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "2012", "2011", "2010", "2009" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 460, 95, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/BG_Comparar.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 560));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-466)/2, (screenSize.height-599)/2, 466, 599);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFCompare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCompare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCompare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCompare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCompare().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    public javax.swing.JLabel jLFoto1;
    public javax.swing.JLabel jLFoto2;
    public javax.swing.JLabel jLNome1;
    public javax.swing.JLabel jLNome2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
