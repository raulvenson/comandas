/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.model.domain;

/**
 *
 * @author david.pereira
 */
public class Produto {

    private int idProduto;
    private String nomeProduto;
    private String descricaoproduto;
    private double preco;
    private Long quantidade;
    private String idCategoria;

    public Produto(int idProduto, String nomeProduto, String descricaoproduto, double precoUnitario, Long qtdProduto, String categoriaId) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoproduto = descricaoproduto;
        this.preco = precoUnitario;
        this.quantidade = qtdProduto;
        this.idCategoria = categoriaId;
    }

    public Produto() {
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoproduto() {
        return descricaoproduto;
    }

    public void setDescricaoproduto(String descricaoproduto) {
        this.descricaoproduto = descricaoproduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Long getQtdProduto() {
        return quantidade;
    }

    public void setQtdProduto(Long qtdProduto) {
        this.quantidade = qtdProduto;
    }
}
