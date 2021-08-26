/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.model.domain;

import java.util.Date;

/**
 *
 * @author david.pereira
 */
public class Cliente {

    private Long idCliente;
    private String nome;
    private String sexo;
    private String cpf;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String cidade;
    private String cep;
    private String bairro;
    private String uf;
    private String complemento;
    private String logradouro;

    public Cliente() {
    }

    public Cliente(String nome, String sexo, String cpf, Date dataNascimento, String telefone, String email, String cidade, String cep, String bairro,
            String uf, String complemento, String logradouro) {
        super();

        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;

    }

    public Cliente(Integer id_Cliente, String nome, String sexo, String cpf, Date dataNascimento, String telefone, String email, String cidade, String cep, String bairro,
            String uf, String complemento, String logradouro) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;
        this.uf = uf;
        this.complemento = complemento;
        this.logradouro = logradouro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
