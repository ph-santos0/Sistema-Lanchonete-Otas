package controller;

import dao.NFCompraPagamentoDAO;
import java.util.List;
import model.NFCompraPagamento;

/**
 *
 * @author wfabi0
 */
public class NFCompraPagamentoController {

    private final NFCompraPagamentoDAO nfCompraPagamentoDAO = new NFCompraPagamentoDAO();

    public boolean inserir(NFCompraPagamento nfCompraPagamento) {
        try {
            nfCompraPagamentoDAO.inserir(nfCompraPagamento);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        return false;
    }

    public List<NFCompraPagamento> listarNFCompraPagamentos() {
        return nfCompraPagamentoDAO.listarNFCompraPagamentos();
    }

}
