/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProdutoDAO;
import java.util.List;
import model.Produto;

/**
 *
 * @author 0077110
 */
public class ProdutoController {
    private final ProdutoDAO produtoDAO = new ProdutoDAO();

    public boolean inserir(Produto produto) {
        try {
            produtoDAO.inserir(produto);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }

    public List<Produto> getTodosProdutos() {
        return produtoDAO.listarProdutos();
    }
}