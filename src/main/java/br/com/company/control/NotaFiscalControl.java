/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.control;

import br.com.company.model.domain.Cliente;
import br.com.company.model.domain.NotaFiscal;
import br.com.company.model.domain.Produto;
import br.com.company.model.dao.NotaFiscalDao;
import java.util.List;

/**
 *
 * @author david.pereira
 */
public class NotaFiscalControl {

    public List<Cliente> listarCliente(Cliente cliente) {
        NotaFiscalDao fiscalDao = new NotaFiscalDao();
        return fiscalDao.lCliente(cliente);
    }

    public List<Produto> listarProduto(Produto produto) {
        NotaFiscalDao fiscalDao = new NotaFiscalDao();
        return fiscalDao.lProduto(produto);
    }

    public void salvarNota(NotaFiscal fiscal) {
        NotaFiscalDao fiscalDao = new NotaFiscalDao();
        fiscalDao.insereItemNaNota(fiscal);
    }

    public void verificaVenda(NotaFiscal notaFiscal) {
        NotaFiscalDao fiscalDao = new NotaFiscalDao();
        fiscalDao.buscarVenda(notaFiscal);
    }
}
