/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Etablissement;

import Main.JDBC;
import static Main.JDBC.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author walid
 */
public class Supprimer_etablissement extends javax.swing.JFrame {
    public static String abrev;
    public static String nometa;
    /**
     * Creates new form Supprimer_etablissement
     */
    public Supprimer_etablissement() {
        initComponents();
        setSize(800, 500);
        setLocation(545, 260);
        this.setDefaultCloseOperation(2);
        try{
            JDBC DB = new JDBC();
            DB.connection();
            String sq = "SELECT ABRE_ESTA,NOM_ESTA FROM establishment";
            rs = stmt.executeQuery(sq);

            while(rs.next()){
                String abre = rs.getString("ABRE_ESTA");
                String nom = rs.getString("NOM_ESTA");
                String tabData[] = {abre, nom};
                DefaultTableModel tabModel = (DefaultTableModel)table.getModel();
                tabModel.addRow(tabData);
            }
            
            stmt.close();
            rs.close();
            conn.close();
        }
        catch(SQLException e){
            System.out.println("erreur "+e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        abre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        adresse = new javax.swing.JTextField();
        tele = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        link = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supprimer une établissement");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 10, 550, 40);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Abréviation", "Nom Etablissement"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(80);
            table.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 90, 330, 290);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Abréviation : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 120, 40);

        abre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(abre);
        abre.setBounds(150, 90, 290, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Nom_Etablissement : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 140, 160, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        jLabel4.setText("Adresse : ");
        jLabel4.setPreferredSize(new java.awt.Dimension(77, 16));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 200, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("Tele : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 240, 120, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 102));
        jLabel6.setText("Email : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 290, 120, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 102));
        jLabel7.setText("Link : ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 340, 120, 40);

        nom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(nom);
        nom.setBounds(150, 140, 290, 40);

        adresse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(adresse);
        adresse.setBounds(150, 190, 290, 40);

        tele.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(tele);
        tele.setBounds(150, 240, 290, 40);

        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(email);
        email.setBounds(150, 290, 290, 40);

        link.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkActionPerformed(evt);
            }
        });
        getContentPane().add(link);
        link.setBounds(150, 340, 290, 40);

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(670, 400, 110, 40);

        jButton1.setBackground(new java.awt.Color(189, 255, 207));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 400, 230, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ucaav1.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, -10, 810, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int r = table.getSelectedRow();
        String a=table.getValueAt(r,0).toString();
        String n=table.getValueAt(r,1).toString();
        JDBC db=new JDBC();
        db.connection();
        String sql="SELECT * FROM establishment WHERE ABRE_ESTA='"+a+"' AND NOM_ESTA='"+n+"'";
        try {
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                abre.setText(rs.getString("ABRE_ESTA"));
                nom.setText(rs.getString("NOM_ESTA"));
                adresse.setText(rs.getString("ADRESSE_ESTA"));
                tele.setText(rs.getString("TELE_ESTA"));
                email.setText(rs.getString("EMAIL_ESTA"));
                link.setText(rs.getString("LINK_ESTA"));
                
                abrev=rs.getString("ABRE_ESTA");
                nometa=rs.getString("NOM_ESTA");
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_tableMouseClicked

    private void linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int response= JOptionPane.showConfirmDialog(null, "Do you really want to Quit?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response== JOptionPane.NO_OPTION) {
            new Supprimer_etablissement().setVisible(false);
        } else if (response== JOptionPane.YES_OPTION) {
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JDBC db=new JDBC();
        db.connection();
        int id=-1000;
        try {
            if(abrev.length()!=0 && nometa.length() != 0){
                String sq="SELECT ID_ESTA FROM establishment WHERE ABRE_ESTA='"+abrev+"' AND NOM_ESTA='"+nometa+"'";
                rs=stmt.executeQuery(sq);
                while(rs.next()){
                   id=Integer.parseInt(rs.getString("ID_ESTA"));
                }
                
                rs=null;
                String sqq="DELETE FROM professeur WHERE ID_ESTA="+id;
                stmt.executeUpdate(sqq);
                stmt.executeUpdate("commit");
                
                String sql="DELETE FROM establishment WHERE ABRE_ESTA='"+abrev+"' AND NOM_ESTA='"+nometa+"'";
                System.out.println(sql);
                stmt.executeUpdate(sql);
                
                JOptionPane dialogue = new JOptionPane("L'Etablissement est bien supprimer", JOptionPane.INFORMATION_MESSAGE);
                JDialog boîte = dialogue.createDialog("Message");
                boîte.setVisible(true);
                abre.setText("");
                nom.setText("");
                adresse.setText("");
                tele.setText("");
                email.setText("");
                link.setText("");
            }
            this.setVisible(false);
            new Supprimer_etablissement().setVisible(true);
        }
        catch (SQLException ex){
            System.out.println("Erreur1"+ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Supprimer_etablissement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supprimer_etablissement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supprimer_etablissement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supprimer_etablissement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supprimer_etablissement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abre;
    private javax.swing.JTextField adresse;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField link;
    private javax.swing.JTextField nom;
    private javax.swing.JTable table;
    private javax.swing.JTextField tele;
    // End of variables declaration//GEN-END:variables
}