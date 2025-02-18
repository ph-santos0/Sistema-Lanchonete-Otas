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

    public NFVenda inserir(NFVenda nfVenda) {
        try {
            return nfVendaDAO.newInserir(nfVenda);
        } catch (RuntimeException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<NFVenda> listarNFVendas() {
        return nfVendaDAO.listarNFVendas();
    }
}
