/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.model.dao;

import br.com.company.model.domain.Cliente;
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
public class ClienteDao {

    public Cliente verificarCep(Cliente cep) {
        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection connection = connnectionFactory.recuperaConexao();
            String sql = "SELECT * FROM CLIENTES WHERE cep = '" + cep.getCep() + "'";
            PreparedStatement pstm = connection.prepareStatement(sql);
            ResultSet rst = pstm.executeQuery(sql);
            if (rst.next()) {

            } else {

                validaCliente(cep);
            }
            return cep;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Cliente> listar() {
        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection connection = connnectionFactory.recuperaConexao();
            List<Cliente> lCliente = new ArrayList<Cliente>();
            String sql = "SELECT cep, localidade, uf, codigo_ibge, bairro, logradouro, complemento FROM ceps";

            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.execute();

                trasformarResultSetEmProduto(lCliente, pstm);
            }
            return lCliente;

        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }

    private void trasformarResultSetEmProduto(List<Cliente> lCliente, PreparedStatement pstm) {
        try {

            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {
                    Cliente cliente = new Cliente(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDate(5), rst.getString(6), rst.getString(7),
                            rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13));

                    lCliente.add(cliente);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean validaCliente(Cliente cliente) {
        String sql;

        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection connection = connnectionFactory.recuperaConexao();

            Statement stm = connection.createStatement();

            String where = "WHERE 1 = 1 ";

            if (cliente.getCpf() != null && cliente.getCpf().length() > 0) {
                where += " AND cpf = '" + cliente.getCpf() + "'";
            }

            if (cliente.getNome() != null && cliente.getNome().length() > 0) {
                where += " AND upper(NOME) = '" + cliente.getNome().toUpperCase() + "'";
            }

            if (cliente.getIdCliente() != null) {
                where += " AND id_cliente = '" + cliente.getIdCliente() + "'";
            }

            sql = "SELECT * FROM CLIENTES " + where;
            System.out.println(sql);
            ResultSet rs = stm.executeQuery(sql);

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Cliente já inserido, verifique os campos");
            } else {
                salvarCliente(cliente);

                JOptionPane.showMessageDialog(null, "Inserido com sucesso");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public Boolean salvarCliente(Cliente cliente) {
        String sql;
        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection connection = connnectionFactory.recuperaConexao();

            sql = "INSERT INTO CLIENTES (nome, sexo, DATA_NASCIMENTO, cpf,"
                    + " telefone,"
                    + " email,"
                    + " cidade,"
                    + " cep,"
                    + " bairro,"
                    + " uf,"
                    + " logradouro,"
                    + " complemento) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement pstm = connection.prepareStatement(sql);

            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getSexo());
            pstm.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTime()));
            pstm.setString(4, cliente.getCpf());
            pstm.setString(5, cliente.getTelefone());
            pstm.setString(6, cliente.getEmail());
            pstm.setString(7, cliente.getCidade());
            pstm.setString(8, cliente.getCep());
            pstm.setString(9, cliente.getBairro());
            pstm.setString(10, cliente.getUf());
            pstm.setString(11, cliente.getLogradouro());
            pstm.setString(12, cliente.getComplemento());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Inserido com sucesso");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return true;
    }

    public void alterar(Cliente cliente) {
        try {
            ConnectionFactory connnectionFactory = new ConnectionFactory();
            Connection connection = connnectionFactory.recuperaConexao();

            String sql = "UPDATE CLIENTES SET "
                    + " nome =?,"
                    + " DATA_NASCIMENTO=?,"
                    + " telefone=?,"
                    + " email=?,"
                    + " cidade=?,"
                    + " cep=?,"
                    + " bairro=?,"
                    + " uf =?,"
                    + " logradouro=?,"
                    + " complemento=?"
                    + "  WHERE id_cliente =?";

            PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, cliente.getNome());
            stm.setDate(2, new java.sql.Date(cliente.getDataNascimento().getTime()));
            stm.setString(3, cliente.getTelefone());
            stm.setString(4, cliente.getEmail());
            stm.setString(5, cliente.getCidade());
            stm.setString(6, cliente.getCep());
            stm.setString(7, cliente.getBairro());
            stm.setString(8, cliente.getUf());
            stm.setString(9, cliente.getLogradouro());
            stm.setString(10, cliente.getComplemento());
            stm.setLong(11, cliente.getIdCliente());

            stm.execute();

            JOptionPane.showMessageDialog(null, "Cadastro Atualizado");
            stm.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
