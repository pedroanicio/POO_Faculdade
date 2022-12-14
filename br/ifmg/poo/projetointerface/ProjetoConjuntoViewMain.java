/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.ifmg.poo.projetointerface;

import javax.swing.JOptionPane;

/**
 *
 * @author 0072383
 */
public class ProjetoConjuntoViewMain extends javax.swing.JFrame {

    
    private ManutencaoConjuntoView manutencaoConjuntoView; 
    /**
     * Creates new form ProjetoConjuntoViewMain
     */
    public ProjetoConjuntoViewMain() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        jMenuItemNovo = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuConjunto = new javax.swing.JMenu();
        jMenuItemManutencao = new javax.swing.JMenuItem();
        menuPonto = new javax.swing.JMenu();
        jMenuItemManutenção2 = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArquivo.setMnemonic('A');
        menuArquivo.setText("Arquivo");

        jMenuItemNovo.setMnemonic('N');
        jMenuItemNovo.setText("Novo");
        menuArquivo.add(jMenuItemNovo);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemSair.setMnemonic('S');
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(jMenuItemSair);

        jMenuBar1.add(menuArquivo);

        menuEditar.setMnemonic('E');
        menuEditar.setText("Editar");
        jMenuBar1.add(menuEditar);

        menuConjunto.setMnemonic('C');
        menuConjunto.setText("Conjunto ");

        jMenuItemManutencao.setText("Manutenção...");
        jMenuItemManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManutencaoActionPerformed(evt);
            }
        });
        menuConjunto.add(jMenuItemManutencao);

        jMenuBar1.add(menuConjunto);

        menuPonto.setMnemonic('P');
        menuPonto.setText("Ponto");

        jMenuItemManutenção2.setText("Manutenção...");
        menuPonto.add(jMenuItemManutenção2);

        jMenuBar1.add(menuPonto);

        menuSobre.setMnemonic('S');
        menuSobre.setText("Sobre");
        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        int opçao = JOptionPane.showConfirmDialog (this, "Deseja sair?");
        if (opçao == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManutencaoActionPerformed
        if(manutencaoConjuntoView == null){
            manutencaoConjuntoView = new ManutencaoConjuntoView(this, true);
        }
        manutencaoConjuntoView.setVisible(true);
    }//GEN-LAST:event_jMenuItemManutencaoActionPerformed

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
            java.util.logging.Logger.getLogger(ProjetoConjuntoViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoConjuntoViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoConjuntoViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoConjuntoViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoConjuntoViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemManutencao;
    private javax.swing.JMenuItem jMenuItemManutenção2;
    private javax.swing.JMenuItem jMenuItemNovo;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuConjunto;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuPonto;
    private javax.swing.JMenu menuSobre;
    // End of variables declaration//GEN-END:variables
}
