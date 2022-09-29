package view;

import controller.EditoraDAO;
import controller.LivroDAO;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Editora;
import model.Livro;

public class FormPesquisaLivro extends javax.swing.JInternalFrame {

    public FormPesquisaLivro() {
        initComponents();

        this.setTitle("Pesquisar Livro");
        this.setResizable(false);
        this.setIconifiable(false);
        this.setMaximizable(false);
        this.setClosable(true);
        configurarTabela();

        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbId);
        bg.add(rdbNome);
        rdbNome.setSelected(true);

    }

    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        m.addColumn("Id");
        m.addColumn("Título");
        m.addColumn("Autor");
        m.addColumn("Editora");
        m.addColumn("Ano");
        m.addColumn("Preço");
        m.addColumn("Qtde.");
        tabResultado.setModel(m);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpTabela = new javax.swing.JScrollPane();
        tabResultado = new javax.swing.JTable();
        lblPesquisarPor1 = new javax.swing.JLabel();
        btnListarPorId = new javax.swing.JButton();
        lblPesquisarPor = new javax.swing.JLabel();
        rdbNome = new javax.swing.JRadioButton();
        rdbId = new javax.swing.JRadioButton();
        txtPesquisa = new javax.swing.JTextField();
        btnListarPorTitulo = new javax.swing.JButton();

        tabResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResultadoMouseClicked(evt);
            }
        });
        scpTabela.setViewportView(tabResultado);

        lblPesquisarPor1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPesquisarPor1.setText("Listar por");

        btnListarPorId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnListarPorId.setText("Id");
        btnListarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPorIdActionPerformed(evt);
            }
        });

        lblPesquisarPor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPesquisarPor.setText("Pesquisar por");

        rdbNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rdbNome.setText("Título");
        rdbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNomeActionPerformed(evt);
            }
        });

        rdbId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rdbId.setText("Id");
        rdbId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbIdActionPerformed(evt);
            }
        });

        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        btnListarPorTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnListarPorTitulo.setText("Título");
        btnListarPorTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPorTituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scpTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbNome))
                            .addComponent(lblPesquisarPor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPesquisarPor1)
                                .addGap(114, 114, 114))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnListarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnListarPorTitulo))))
                    .addComponent(txtPesquisa))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPesquisarPor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListarPorId)
                            .addComponent(btnListarPorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPesquisarPor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbNome)
                            .addComponent(rdbId))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scpTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResultadoMouseClicked

        //CLIQUE DUPLO
        if (evt.getClickCount() == 2) {
            //Descobrir a linha selecionada
            int linha = tabResultado.getSelectedRow();

            //Recuperar o ID selecionado
            int id = Integer.parseInt(
                    tabResultado.getValueAt(linha, 0).toString()
            );

            //Abrir o FormCadastro
            FormCadastroLivro f = new FormCadastroLivro(id);
            this.getDesktopPane().add(f);
            f.setVisible(true);

            //Fechar o FormPesquisa
            this.dispose();
        }
    }//GEN-LAST:event_tabResultadoMouseClicked

    private void btnListarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPorIdActionPerformed

        configurarTabela();
        List<Livro> lista = new LivroDAO().listarPorId();
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabResultado.getModel();
            for (Livro e : lista) {
                m.addRow(new Object[]{
                    e.getId(), e.getTitulo(), e.getAutor(),
                    e.getId_editora(), e.getAno(), e.getPreco(),
                    e.getQuantidade()
                });
            }
            tabResultado.setModel(m);
        } else {
            JOptionPane.showMessageDialog(
                    null, "Nenhum registro encontrado."
            );
        }

    }//GEN-LAST:event_btnListarPorIdActionPerformed

    private void rdbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNomeActionPerformed

    private void rdbIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbIdActionPerformed

    }//GEN-LAST:event_rdbIdActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed

    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtPesquisa.getText().isEmpty()) {
                JOptionPane.showMessageDialog(
                        null, "Informe o critério de pesquisa."
                );
            } else {
                configurarTabela();
                //
                // PESQUISAR POR ID
                //
                if (rdbId.isSelected()) {
                    try {
                        Livro livro = new LivroDAO().pesquisarPorId(
                                Integer.parseInt(txtPesquisa.getText())
                        );
                        if (livro != null) {
                            DefaultTableModel m = (DefaultTableModel) tabResultado.getModel();
                            m.addRow(new Object[]{
                                livro.getId(), livro.getTitulo(), livro.getAutor(),
                                livro.getId_editora(), livro.getAno(), livro.getPreco(),
                                livro.getQuantidade()
                            });
                            tabResultado.setModel(m);
                        } else {
                            JOptionPane.showMessageDialog(
                                    null, "Nenhum registro encontrado."
                            );
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(
                                null, "O campo de pesquisa deve ser numérico."
                        );
                    }
                } else {
                    //
                    // PESQUISAR POR NOME
                    //
                    List<Livro> lista = new LivroDAO()
                            .pesquisarPorTitulo(txtPesquisa.getText());
                    if (lista.size() > 0) {
                        DefaultTableModel m = (DefaultTableModel) tabResultado.getModel();
                        for (Livro livro : lista) {
                            m.addRow(new Object[]{
                                livro.getId(), livro.getTitulo(), livro.getAutor(),
                                livro.getId_editora(), livro.getAno(), livro.getPreco(),
                                livro.getQuantidade()
                            });
                        }
                        tabResultado.setModel(m);
                    } else {
                        JOptionPane.showMessageDialog(
                                null, "Nenhum registro encontrado."
                        );
                    }
                }
            }
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnListarPorTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPorTituloActionPerformed

        configurarTabela();
        List<Livro> lista = new LivroDAO().listarPorTitulo();
        if (lista.size() > 0) {
            DefaultTableModel m = (DefaultTableModel) tabResultado.getModel();
            for (Livro e : lista) {
                m.addRow(new Object[]{
                    e.getId(), e.getTitulo(), e.getAutor(),
                    e.getId_editora(), e.getAno(), e.getPreco(),
                    e.getQuantidade()
                });
            }
            tabResultado.setModel(m);
        } else {
            JOptionPane.showMessageDialog(
                    null, "Nenhum registro encontrado."
            );
        }
    }//GEN-LAST:event_btnListarPorTituloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarPorId;
    private javax.swing.JButton btnListarPorTitulo;
    private javax.swing.JLabel lblPesquisarPor;
    private javax.swing.JLabel lblPesquisarPor1;
    private javax.swing.JRadioButton rdbId;
    private javax.swing.JRadioButton rdbNome;
    private javax.swing.JScrollPane scpTabela;
    private javax.swing.JTable tabResultado;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
