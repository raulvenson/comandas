/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.model.domain;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author david.pereira
 */
public class NotaFiscal {

    private int numeroNf;
    private double valorNota;
    private int idVenda;
    private Date dataEmissao;
    private int idCliente;
    private List<NotaFiscalItem> itens = new LinkedList<>();

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    private double precoProduto;

    public List<NotaFiscalItem> getItens() {
        return itens;
    }

    public void setItens(List<NotaFiscalItem> itens) {
        this.itens = itens;
    }

    public int getNumeroNf() {
        return numeroNf;
    }

    public void setNumeroNf(int numeroNf) {
        this.numeroNf = numeroNf;
    }

    public double getValorNota() {
        return valorNota;
    }

    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

}
