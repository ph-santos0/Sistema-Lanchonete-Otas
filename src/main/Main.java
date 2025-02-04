package main;

import visao.produto.ProdutoCadastrarVisao;
import visao.produto.ProdutoConsultarVisao;

/**
 *
 * @author wfabi0
 */
public class Main {

    public static void main(String[] args) {
        ProdutoCadastrarVisao produtoCadastrarVisao = new ProdutoCadastrarVisao();
        ProdutoConsultarVisao produtoConsultarVisao = new ProdutoConsultarVisao();
        produtoCadastrarVisao.setVisible(false);
        produtoConsultarVisao.setVisible(true);
    }

}
