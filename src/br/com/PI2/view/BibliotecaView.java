/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.PI2.view;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author jvazu
 */
public class BibliotecaView extends javax.swing.JFrame {

    /**
     * Creates new form BibliotecaView
     */
    public BibliotecaView() {
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

        jLabelBibliotecaVirtual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBiblioteca = new javax.swing.JTable();
        jButtonBibliotecaVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelBibliotecaVirtual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelBibliotecaVirtual.setText("Biblioteca Virtual");

        jTableBiblioteca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Harry Potter e a Pedra Filosofal", "J.K. Rowling", "	Fantasia", "Disponível"},
                {"1984", "George Orwell", "Ficção Científica", "Indisponível"},
                {"O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Fábula", "Disponível"},
                {"Dom Quixote", "	Miguel de Cervantes", "Romance", "Disponível"},
                {"Orgulho e Preconceito", "Jane Austen", "Romance", "Disponível"}
            },
            new String [] {
                "Título", "Autor", "Gênero", "Disponibilidade"
            }
        ));
        jTableBiblioteca.setEnabled(false);
        jScrollPane1.setViewportView(jTableBiblioteca);

        jButtonBibliotecaVoltar.setText("Voltar ao Menu");
        jButtonBibliotecaVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBibliotecaVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabelBibliotecaVirtual)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBibliotecaVoltar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButtonBibliotecaVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBibliotecaVirtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBibliotecaVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBibliotecaVoltarActionPerformed
        HomeView homeView = new HomeView();
        homeView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBibliotecaVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(BibliotecaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BibliotecaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BibliotecaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BibliotecaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BibliotecaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBibliotecaVoltar;
    private javax.swing.JLabel jLabelBibliotecaVirtual;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBiblioteca;
    // End of variables declaration//GEN-END:variables


    public JTable getjTableBiblioteca() {
        return jTableBiblioteca;
    }

    public JButton getJButtonVoltar() {
         return jButtonBibliotecaVoltar;
    }

}
