/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.model.dao;

import br.com.company.model.domain.Cliente;
import br.com.company.model.domain.NotaFiscal;
import br.com.company.model.domain.NotaFiscalItem;
import br.com.company.model.domain.Produto;
import br.com.company.model.connection.ConnectionFactory;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author david.pereira
 */
public class NotaFiscalDao {

    public List<Cliente> lCliente(Cliente cliente) {
        String sql;

        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection conn = connnectionFactory.recuperaConexao();

            Statement pstm = conn.createStatement();
            String where = "WHERE 1 = 1 ";

            if (cliente.getCpf() != null && cliente.getCpf().trim().length() == 14) {
                where += " AND cpf = '" + cliente.getCpf() + "'";
            }

            if (cliente.getNome() != null && cliente.getNome().length() > 0) {
                where += " AND upper(NOME) LIKE '%" + cliente.getNome().toUpperCase() + "%'";
            }

            if (cliente.getIdCliente() != null) {
                where += " AND id_cliente = '" + cliente.getIdCliente() + "'";
            }

            sql = "SELECT * FROM CLIENTES " + where;
            System.out.println(sql);
            ResultSet rs = pstm.executeQuery(sql);

            List<Cliente> lCliente = new LinkedList<>();

            while (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getLong("id_Cliente"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setDataNascimento(rs.getDate("DATA_NASCIMENTO"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setUf(rs.getString("uf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setCep(rs.getString("cep"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setLogradouro(rs.getString("logradouro"));
                cliente.setComplemento(rs.getString("complemento"));
                lCliente.add(cliente);
            }
            return lCliente;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produto> lProduto(Produto produto) {
        String sql;

        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection conn = connnectionFactory.recuperaConexao();

            Statement pstm = conn.createStatement();
            String where = "WHERE 1 = 1 ";

            if (produto.getNomeProduto() != null && produto.getNomeProduto().length() > 0) {
                where += " AND upper(nome_produto) LIKE '%" + produto.getNomeProduto().toUpperCase() + "%'";
            }

            if (produto.getIdProduto() > 0) {
                where += " AND id_produto = '" + produto.getIdProduto() + "'";
            }

            sql = "SELECT * FROM PRODUTOS " + where;
            System.out.println(sql);
            ResultSet rs = pstm.executeQuery(sql);

            List<Produto> lProduto = new LinkedList<>();

            while (rs.next()) {
                produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setNomeProduto(rs.getString("nome_produto"));
                produto.setDescricaoproduto(rs.getString("descricao_produto"));
                produto.setPreco(rs.getInt("PRECO"));
                produto.setQtdProduto(rs.getLong("QUANTIDADE"));
                produto.setIdCategoria(rs.getString("id_Categoria"));

                lProduto.add(produto);
            }
            return lProduto;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int buscaProxIdVenda(NotaFiscal notaFiscal) {
        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection connection = connnectionFactory.recuperaConexao();

            String sql = "SELECT IFNULL(MAX(ID_VENDA) + 1,1) AS ID_VENDA FROM NOTAS_FISCAIS ORDER BY ID_VENDA ASC";

            PreparedStatement pstm = connection.prepareStatement(sql);

            ResultSet rst = pstm.executeQuery();

            if (rst.next()) {
                return Integer.parseInt(rst.getString("ID_VENDA"));

            } else {
                JOptionPane.showMessageDialog(null, "Erro metdodo verifica Id: ");
                throw new RuntimeException("Erro ao tentar localizar o proximo ID");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int buscaProximoIdItem(int idNotaFiscal) {
        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection conn = connnectionFactory.recuperaConexao();

            String sql = "SELECT IFNULL(MAX(id_item) + 1,1)  AS ID_ITEM  FROM NOTAS_FISCAIS_ITENS WHERE NOTA_FISCAL = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idNotaFiscal);

            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return parseInt(rs.getString("ID_ITEM"));
            } else {
                JOptionPane.showMessageDialog(null, "Erro metdodo verifica Id: ");
                throw new RuntimeException("Erro ao tentar localizar o proximo ID");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro metdodo ID Item: " + ex);
            throw new RuntimeException(ex);
        }
    }

    public void insereItemNaNota(NotaFiscal notaFiscal) {
        try {

            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection connection = connnectionFactory.recuperaConexao();

            connection.setAutoCommit(false);
            String nfitem = "INSERT INTO NOTAS_FISCAIS ( ID_VENDA, id_cliente, VALOR_NOTA , DATA_EMISSAO ) VALUES (?,?,?,?)";

            PreparedStatement pstm = connection.prepareStatement(nfitem);
            notaFiscal.setIdVenda(buscaProxIdVenda(notaFiscal));

            pstm.setInt(1, notaFiscal.getIdVenda());
            pstm.setInt(2, notaFiscal.getIdCliente());
            pstm.setDouble(3, notaFiscal.getValorNota());
            pstm.setDate(4, new java.sql.Date(notaFiscal.getDataEmissao().getTime()));

            pstm.execute();

            String sqlitem = "INSERT INTO NOTAS_FISCAIS_ITENS (id_item, NOTA_FISCAL, id_produto, QUANTIDADE, PRECO) VALUES (?,?,?,?,?)";
            PreparedStatement pstmItem = connection.prepareStatement(sqlitem);

            int idItem = buscaProximoIdItem(notaFiscal.getIdVenda());

            for (NotaFiscalItem item : notaFiscal.getItens()) {

                pstmItem.setInt(1, idItem);
                pstmItem.setInt(2, notaFiscal.getIdVenda());
                pstmItem.setInt(3, item.getIdProduto());
                pstmItem.setInt(4, item.getQuantidade());
                pstmItem.setDouble(5, item.getPreco());

                int resultado = pstmItem.executeUpdate();

                if (resultado <= 0) {
                    JOptionPane.showMessageDialog(null, "Erro ao iserir nota: ");
                    connection.rollback();
                    throw new RuntimeException("Erro ao tentar inserir. ");
                }
                idItem++;
            }
            connection.commit();
            pstm.close();
            pstmItem.close();
            JOptionPane.showMessageDialog(null, "Item inserido, NF criada com sucesso");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro metdodo insere nota: ");
            throw new RuntimeException(e);
        }
    }

    public void buscarVenda(NotaFiscal notaFiscal) {

        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection connection = connnectionFactory.recuperaConexao();

            String sqlIVenda = " SELECT MAX(ID_VENDA) ID_VENDA from NOTAS_FISCAIS ";
            PreparedStatement pstmVenda = connection.prepareStatement(sqlIVenda);
            ResultSet rst = pstmVenda.executeQuery();
            while (rst.next()) {
                notaFiscal.setIdVenda(rst.getInt("ID_VENDA") + 1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
