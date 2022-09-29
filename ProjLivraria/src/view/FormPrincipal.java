/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author prodrigo
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
        this.setTitle("LIVRARIA do João");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    private void abrirFormulario(JInternalFrame f) {
        if (areaTrabalho.getAllFrames().length == 0) {
            areaTrabalho.add(f);
            Dimension d = f.getDesktopPane().getSize();
            f.setLocation(
                (d.width - f.getSize().width) / 2,
                (d.height - f.getSize().height) / 2
            );
            f.setVisible(true);
        }
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaTrabalho = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        menuItemCadastrarEditora = new javax.swing.JMenuItem();
        menuItemCadastrarLivro = new javax.swing.JMenuItem();
        menuPesquisar = new javax.swing.JMenu();
        menuItemPesquisarEditora = new javax.swing.JMenuItem();
        menuItemPesquisarLivro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        menuCadastrar.setText("Cadastrar");

        menuItemCadastrarEditora.setText("Editora");
        menuItemCadastrarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarEditoraActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuItemCadastrarEditora);

        menuItemCadastrarLivro.setText("Livro");
        menuItemCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarLivroActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuItemCadastrarLivro);

        barraMenu.add(menuCadastrar);

        menuPesquisar.setText("Pesquisar");

        menuItemPesquisarEditora.setText("Editora");
        menuItemPesquisarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPesquisarEditoraActionPerformed(evt);
            }
        });
        menuPesquisar.add(menuItemPesquisarEditora);

        menuItemPesquisarLivro.setText("Livro");
        menuItemPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPesquisarLivroActionPerformed(evt);
            }
        });
        menuPesquisar.add(menuItemPesquisarLivro);

        barraMenu.add(menuPesquisar);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCadastrarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarEditoraActionPerformed
        
        abrirFormulario(new FormCadastroEditora());
        
    }//GEN-LAST:event_menuItemCadastrarEditoraActionPerformed

    private void menuItemPesquisarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPesquisarEditoraActionPerformed
        
        abrirFormulario(new FormPesquisaEditora());
        
    }//GEN-LAST:event_menuItemPesquisarEditoraActionPerformed

    private void menuItemCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarLivroActionPerformed
        
        abrirFormulario(new FormCadastroLivro() );
        
    }//GEN-LAST:event_menuItemCadastrarLivroActionPerformed

    private void menuItemPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPesquisarLivroActionPerformed
        
        abrirFormulario(new FormPesquisaLivro());
        
    }//GEN-LAST:event_menuItemPesquisarLivroActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenuItem menuItemCadastrarEditora;
    private javax.swing.JMenuItem menuItemCadastrarLivro;
    private javax.swing.JMenuItem menuItemPesquisarEditora;
    private javax.swing.JMenuItem menuItemPesquisarLivro;
    private javax.swing.JMenu menuPesquisar;
    // End of variables declaration//GEN-END:variables
}
