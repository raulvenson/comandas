/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.model.dao;

import br.com.company.model.domain.Produto;
import br.com.company.model.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author david.pereira
 */
public class ProdutoDao {

    public void salvarProduto(Produto produto) {
        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection connection = connnectionFactory.recuperaConexao();
            String sql = "insert into PRODUTOS (nome_produto, descricao_produto, PRECO, QUANTIDADE, ID_CATEGORIA)"
                    + "values (?,?,?,?,?)";
            try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setString(1, produto.getNomeProduto());
                pstm.setString(2, produto.getDescricaoproduto());
                pstm.setDouble(3, produto.getPreco());
                pstm.setLong(4, produto.getQuantidade());
                pstm.setString(5, produto.getIdCategoria());

                pstm.execute();

                try (ResultSet rst = pstm.getGeneratedKeys()) {
                    while (rst.next()) {
                        produto.setIdProduto(rst.getInt(1));
                    }
                }
                JOptionPane.showMessageDialog(null, "Produto Salvo com Sucesso");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produto> listar() {
        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection connection = connnectionFactory.recuperaConexao();
            List<Produto> produtos = new ArrayList<Produto>();
            String sql = "SELECT id_produto, nome_produto, descricao_produto, PRECO, QUANTIDADE, ID_CATEGORIA FROM PRODUTOS";

            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.execute();

                trasformarResultSetEmProduto(produtos, pstm);
            }
            return produtos;

        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }

    private void trasformarResultSetEmProduto(List<Produto> Lprodutos, PreparedStatement pstm) {
        try {

            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {
                    Produto produto = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getLong(5), rst.getString(6));

                    Lprodutos.add(produto);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterarProduto(Produto produto) {
        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection connection = connnectionFactory.recuperaConexao();

            String sql = "UPDATE PRODUTOS SET "
                    + " nome_produto =?,"
                    + " descricao_produto=?,"
                    + " PRECO=?,"
                    + " QUANTIDADE=?,"
                    + " ID_CATEGORIA=?"
                    + " WHERE id_produto =?";

            PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, produto.getNomeProduto());
            stm.setString(2, produto.getDescricaoproduto());
            stm.setDouble(3, produto.getPreco());
            stm.setLong(4, produto.getQuantidade());
            stm.setString(5, produto.getIdCategoria());
            stm.setInt(6, produto.getIdProduto());

            stm.execute();

            JOptionPane.showMessageDialog(null, "Produto Atualizado");
            stm.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
