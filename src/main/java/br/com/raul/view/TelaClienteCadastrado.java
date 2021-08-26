package br.com.company.view;

import br.com.company.control.ClienteControl;
import br.com.company.control.NotaFiscalControl;
import br.com.company.model.domain.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david.pereira
 */
public class TelaClienteCadastrado extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private JLabel txtIdCliente, txtNome, txtCpfClienteNF;

    public TelaClienteCadastrado() {
        initComponents();
    }

    public TelaClienteCadastrado(JLabel txtIdCliente, JLabel txtNome, JLabel txtCpfClienteNF) {
        initComponents();
        this.txtIdCliente = txtIdCliente;
        this.txtNome = txtNome;
        this.txtCpfClienteNF = txtCpfClienteNF;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txIDClienteCadastrado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCpfClienteCadastrado = new javax.swing.JFormattedTextField();
        btnPesquisarID = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        jlabel = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClienteCadastrado = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cliente Cadastrado");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel1.setText("ID Cliente");

        txIDClienteCadastrado.setEditable(false);
        txIDClienteCadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIDClienteCadastradoActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF");

        txtCpfClienteCadastrado.setEditable(false);
        try {
            txtCpfClienteCadastrado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfClienteCadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfClienteCadastradoActionPerformed(evt);
            }
        });

        btnPesquisarID.setText("Pesquisar");
        btnPesquisarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarIDActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("E-mail");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefone");

        jLabel7.setText("Nascimento");

        jLabel8.setText("Cidade");

        jLabel9.setText("Cep");

        jLabel10.setText("UF");

        jlabel.setText("Bairro");

        jLabel11.setText("Logradouro");

        jLabel12.setText("Complemento");

        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPesquisarID)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txIDClienteCadastrado, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(txtNomeCliente))
                            .addComponent(txtCpfClienteCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCidade)
                            .addComponent(txtCep)
                            .addComponent(txtUf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlabel)
                                .addGap(56, 56, 56)
                                .addComponent(txtBairro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComplemento))))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txIDClienteCadastrado)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCpfClienteCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(btnPesquisarID))
                .addGap(19, 19, 19))
        );

        tabelaClienteCadastrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Cliente", "Nome", "CPF", "Data de Nascimneo", "Email", "Telefone", "Cidade", "Cep", "Bairro", "UF", "Logradouro", "Complemento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClienteCadastrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteCadastradoMouseClicked(evt);
            }
        });
        tabelaClienteCadastrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kylieasetabela(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClienteCadastrado);

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(482, 482, 482)
                .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        selecionar();
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPesquisarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarIDActionPerformed
        prencherTabela();
    }//GEN-LAST:event_btnPesquisarIDActionPerformed

    private void txtCpfClienteCadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfClienteCadastradoActionPerformed

    }//GEN-LAST:event_txtCpfClienteCadastradoActionPerformed

    private void txIDClienteCadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIDClienteCadastradoActionPerformed

    }//GEN-LAST:event_txIDClienteCadastradoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        alterarCadastro();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void kylieasetabela(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kylieasetabela

        if (tabelaClienteCadastrado.getSelectedRow() != -1) {

            txIDClienteCadastrado.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 0).toString());
            txtNomeCliente.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 1).toString());
            txtCpfClienteCadastrado.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 2).toString());
            txtNascimento.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 3).toString());
            txtEmail.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 4).toString());
            txtTelefone.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 5).toString());
            txtCidade.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 6).toString());
            txtCep.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 7).toString());
            txtBairro.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 8).toString());
            txtUf.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 9).toString());
            txtLogradouro.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 10).toString());
            txtComplemento.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 11).toString());
        }
    }//GEN-LAST:event_kylieasetabela

    private void tabelaClienteCadastradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteCadastradoMouseClicked
        // TODO add your handling code here:
        if (tabelaClienteCadastrado.getSelectedRow() != -1) {

            txIDClienteCadastrado.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 0).toString());
            txtNomeCliente.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 1).toString());
            txtCpfClienteCadastrado.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 2).toString());
            txtNascimento.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 3).toString());
            txtEmail.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 4).toString());
            txtTelefone.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 5).toString());
            txtCidade.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 6).toString());
            txtCep.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 7).toString());
            txtBairro.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 8).toString());
            txtUf.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 9).toString());
            txtLogradouro.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 10).toString());
            txtComplemento.setText(tabelaClienteCadastrado.getValueAt(tabelaClienteCadastrado.getSelectedRow(), 11).toString());
        }
    }//GEN-LAST:event_tabelaClienteCadastradoMouseClicked

    public void prencherTabela() {

        Cliente cliente = new Cliente();
        NotaFiscalControl fiscalControl = new NotaFiscalControl();
        DefaultTableModel model = (DefaultTableModel) tabelaClienteCadastrado.getModel();
        tabelaClienteCadastrado.setCellSelectionEnabled(false);
        tabelaClienteCadastrado.setRowSelectionAllowed(true);

        if (txIDClienteCadastrado.getText().trim().length() > 0) {
            cliente.setIdCliente(Long.parseLong(txIDClienteCadastrado.getText()));
        }

        if (txtNomeCliente.getText() != null) {
            cliente.setNome(txtNomeCliente.getText());
        }
        if (txtCpfClienteCadastrado.getText().length() > 0) {
            cliente.setCpf(txtCpfClienteCadastrado.getText());
        }

        List<Cliente> lCliente = fiscalControl.listarCliente(cliente);

        System.out.println("" + model.getRowCount());

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        for (Cliente cli : lCliente) {
            Object[] row = {
                cli.getIdCliente(),
                cli.getNome(),
                cli.getCpf(),
                cli.getDataNascimento(),
                cli.getEmail(),
                cli.getTelefone(),
                cli.getCidade(),
                cli.getCep(),
                cli.getBairro(),
                cli.getUf(),
                cli.getLogradouro(),
                cli.getComplemento()
            };
            model.addRow(row);
        }
    }

    private void limpar() {
        this.txIDClienteCadastrado.setText("");
        this.txtNomeCliente.setText("");
        this.txtCpfClienteCadastrado.setText("");
    }

    public void selecionar() {

        int linha = tabelaClienteCadastrado.getSelectedRow();
        txtIdCliente.setText(tabelaClienteCadastrado.getValueAt(linha, 0).toString());
        txtNome.setText(tabelaClienteCadastrado.getValueAt(linha, 1).toString());
        txtCpfClienteNF.setText(tabelaClienteCadastrado.getValueAt(linha, 2).toString());
        dispose();
    }

    public void limparTabela() {
        DefaultTableModel model = (DefaultTableModel) tabelaClienteCadastrado.getModel();
        model.getDataVector().clear();
    }

    public void alterarCadastro() {
        ClienteControl clienteControl = new ClienteControl();

        Cliente cliente = new Cliente();

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        try {
            if (txtNomeCliente.getText().isEmpty()
                    || txtNascimento.getText().isEmpty()
                    || txtEmail.getText().isEmpty()
                    || txtTelefone.getText().isEmpty()
                    || txtCidade.getText().isEmpty()
                    || txtUf.getText().isEmpty()
                    || txtCep.getText().isEmpty()
                    || txtBairro.getText().isEmpty()
                    || txtLogradouro.getText().isEmpty()
                    || txtComplemento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campos de alteração não podem ser deixados vazios");
            } else {
                cliente.setIdCliente(Long.valueOf("" + txIDClienteCadastrado.getText()));
                cliente.setNome(txtNomeCliente.getText());
                cliente.setDataNascimento(formato.parse(txtNascimento.getText()));
                cliente.setTelefone(txtTelefone.getText());
                cliente.setEmail(txtEmail.getText());
                cliente.setCidade(txtCidade.getText());
                cliente.setCep(txtCep.getText());
                cliente.setBairro(txtBairro.getText());
                cliente.setUf(txtUf.getText());
                cliente.setLogradouro(txtLogradouro.getText());
                cliente.setComplemento(txtComplemento.getText());

                clienteControl.alterar(cliente);
            }
        } catch (ParseException ex) {
            Logger.getLogger(TelaClienteCadastrado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void preencherCampos() {

        int linhaSelecionada = tabelaClienteCadastrado.getSelectedRow();

        txIDClienteCadastrado.setText(tabelaClienteCadastrado.getValueAt(linhaSelecionada, 0).toString());
        txtNomeCliente.setText(tabelaClienteCadastrado.getValueAt(linhaSelecionada, 1).toString());
        txtCpfClienteCadastrado.setText(tabelaClienteCadastrado.getValueAt(linhaSelecionada, 2).toString());
        txtNascimento.setText(tabelaClienteCadastrado.getValueAt(linhaSelecionada, 3).toString());
        txtEmail.setText(tabelaClienteCadastrado.getValueAt(linhaSelecionada, 4).toString());
        txtTelefone.setText(tabelaClienteCadastrado.getValueAt(linhaSelecionada, 5).toString());
        txtCidade.setText(tabelaClienteCadastrado.getValueAt(linhaSelecionada, 6).toString());
        txtCep.setText(tabelaClienteCadastrado.getValueAt(linhaSelecionada, 7).toString());
        txtBairro.setText(tabelaClienteCadastrado.getValueAt(linhaSelecionada, 8).toString());
        txtUf.setText(tabelaClienteCadastrado.getValueAt(linhaSelecionada, 9).toString());
        txtLogradouro.setText(tabelaClienteCadastrado.getValueAt(linhaSelecionada, 10).toString());
        txtComplemento.setText(tabelaClienteCadastrado.getValueAt(linhaSelecionada, 11).toString());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisarID;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JTable tabelaClienteCadastrado;
    private javax.swing.JTextField txIDClienteCadastrado;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpfClienteCadastrado;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
