package controller;

import dao.NFCompraDAO;
import java.util.List;
import model.NFCompra;

/**
 *
 * @author joaop
 */
public class NFCompraController {

    private final NFCompraDAO nfCompraDAO = new NFCompraDAO();

    public boolean inserir(NFCompra nfCompra) {
        try {
            nfCompraDAO.inserir(nfCompra);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }

    public List<NFCompra> getTodasNFCompra() {
        try {
            return nfCompraDAO.listarNFCompra();
        } catch (RuntimeException e) {
            System.out.println(e);
            return null;
        }
    }
}
