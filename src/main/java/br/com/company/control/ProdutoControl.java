/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.control;

import br.com.company.model.domain.Produto;
import br.com.company.model.dao.ProdutoDao;
import java.util.List;

/**
 *
 * @author david.pereira
 */
public class ProdutoControl {

    public void salvarProduto(Produto produto) {
        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.salvarProduto(produto);
    }

    public List<Produto> listar() {
        ProdutoDao produtoDao = new ProdutoDao();
        return produtoDao.listar();
    }

    public void alterarCadastro(Produto produto) {
        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.alterarProduto(produto);
    }
}
