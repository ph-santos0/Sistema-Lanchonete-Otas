package controller;

import dao.NFVendaDAO;
import java.util.List;
import model.NFVenda;

/**
 *
 * @author ph-santos
 */
public class NFVendaController {
    private final NFVendaDAO nfVendaDAO = new NFVendaDAO();

    public boolean inserir(NFVenda nfVenda) {
        try {
            nfVendaDAO.inserir(nfVenda);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }

    public List<NFVenda> listarNFVendas() {
        return nfVendaDAO.listarNFVendas();
    }
}