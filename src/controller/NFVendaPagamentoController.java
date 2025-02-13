package controller;

import dao.NFVendaPagamentoDAO;
import java.util.List;
import model.NFVendaPagamento;

/**
 *
 * @author ph-santos
 */
public class NFVendaPagamentoController {

    private final NFVendaPagamentoDAO nfVendaPagamentoDAO = new NFVendaPagamentoDAO();

    public boolean inserir(NFVendaPagamento nfVendaPagamento) {
        try {
            nfVendaPagamentoDAO.inserir(nfVendaPagamento);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        return false;
    }

    public List<NFVendaPagamento> listarNFVendaPagamentos() {
        return nfVendaPagamentoDAO.listarNFVendaPagamentos();
    }
}
