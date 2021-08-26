/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.model.connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author david.pereira
 */
public class ConnectionFactory {

    public DataSource dataSource;

    public ConnectionFactory() {

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/Cadastro");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("123456");

        comboPooledDataSource.setMaxPoolSize(100);
        this.dataSource = comboPooledDataSource;
    }

    public Connection recuperaConexao() throws SQLException {
        return this.dataSource.getConnection();
    }
}
