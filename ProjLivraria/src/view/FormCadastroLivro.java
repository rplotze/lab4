package view;

import controller.EditoraDAO;
import controller.LivroDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Editora;
import model.Livro;


public class FormCadastroLivro extends javax.swing.JInternalFrame {

    public FormCadastroLivro() {
        initComponents();
        
        this.setTitle("Cadastrar Livro");
        this.setResizable(false);
        this.setIconifiable(false);
        this.setMaximizable(false);
        this.setClosable(false);
        txtId.setEditable(false);
        
        //
        // PREENCHER O COMBOBOX DE Editora
        //
        DefaultComboBoxModel m1 = new DefaultComboBoxModel();
        List<Editora> lista = new EditoraDAO().listarPorNome();
        for(Editora e : lista){
            m1.addElement(e);
        }
        cbxEditora.setModel(m1);
    }
    
    public FormCadastroLivro(int id){
        this(); 
        txtId.setText(String.valueOf(id));
        
        Livro livro = new LivroDAO().pesquisarPorId(id);
        
        txtTitulo.setText(livro.getTitulo());
        txtAutor.setText(livro.getAutor());
        txtAno.setText(String.valueOf(livro.getAno()));
        txtPreco.setText(String.valueOf(livro.getPreco()));
        txtQuantidade.setText(
            String.valueOf(livro.getQuantidade())
        );
        
        DefaultComboBoxModel m = (DefaultComboBoxModel)
            cbxEditora.getModel();
        int i;
        for (i = 0; i < m.getSize(); i++) {
            Editora e = (Editora)m.getElementAt(i);
            if (e.getId() == livro.getId_editora()){
                break;
            }
        }
        cbxEditora.setSelectedIndex(i);
    }    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAno = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        lblEditora = new javax.swing.JLabel();
        cbxEditora = new javax.swing.JComboBox<>();
        lblAutor = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblId2 = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        txtAno.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        lblAno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAno.setText("Ano");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Título");

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        txtAutor.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        lblEditora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEditora.setText("Editora");

        cbxEditora.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        cbxEditora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAutor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAutor.setText("Autor(es)");

        txtPreco.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        lblPreco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPreco.setText("Preço");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        lblId2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblId2.setText("Id");

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblQuantidade.setText("Quantidade");

        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSalvar.setText("salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCancelar.setText("cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblId2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addComponent(lblAutor)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEditora)
                            .addComponent(cbxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblAno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPreco)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidade)
                            .addComponent(txtQuantidade)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblId2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEditora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(lblPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        //Recuperar os dados sobre o Livro
        Livro livro = new Livro();
        livro.setTitulo(txtTitulo.getText());
        livro.setAutor(txtAutor.getText());
        livro.setAno(Integer.parseInt(txtAno.getText()));
        livro.setPreco(Double.parseDouble(txtPreco.getText()));
        livro.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        
        //Recuperar o ID da Editora
        Editora e = (Editora)cbxEditora.getSelectedItem();
        livro.setId_editora(e.getId());
        
        int res = -1;
        if (txtId.getText().isEmpty()){
            res = new LivroDAO().inserir(livro);
        }else{
            livro.setId(Integer.parseInt(txtId.getText()));
            res = new LivroDAO().atualizar(livro);
        }

        //Verificar se deu certo
        if (res > 0){
            txtId.setText(String.valueOf(res));
            JOptionPane.showMessageDialog(
                null,"Operação realizada com sucesso!"
            );
        }else{
            JOptionPane.showMessageDialog(
                null,"Não foi possível realizar a operação!"
            );
        }
        this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxEditora;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblEditora;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
