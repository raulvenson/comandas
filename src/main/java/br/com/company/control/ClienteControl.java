/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.control;

import br.com.company.model.domain.Cliente;
import br.com.company.model.dao.ClienteDao;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author david.pereira
 */
public class ClienteControl {

    public Cliente buscarCep(String cepDigitado) {
        Cliente cep = new Cliente();

        try {
            URL url = new URL("https://viacep.com.br/ws/" + cepDigitado + "/json/");
            URLConnection urlConnection = url.openConnection();
            StringBuilder builder = new StringBuilder();
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            bufferedReader.lines().forEach(l -> builder.append(l.trim()));

            JSONObject jsonObj = new JSONObject(builder.toString());

            cep.setCep(jsonObj.getString("cep"));
            cep.setCidade(jsonObj.getString("localidade"));
            cep.setUf(jsonObj.getString("uf"));
            cep.setBairro(jsonObj.getString("bairro"));
            cep.setComplemento(jsonObj.getString("complemento"));
            cep.setLogradouro(jsonObj.getString("logradouro"));
            System.out.println("Resultado da busca: " + cep);

        } catch (IOException | JSONException ex) {

            throw new RuntimeException(ex);
        }
        return cep;
    }

    public void salvarCliente(Cliente cliente) {
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.validaCliente(cliente);
    }

    public List<Cliente> listar() {
        ClienteDao clienteDao = new ClienteDao();
        return clienteDao.listar();
    }

    public void alterar(Cliente cliente) {
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.alterar(cliente);
    }

}
