package controller;

import dao.ItemNFCompraDAO;
import java.util.List;
import model.ItemNFCompra;

/**
 *
 * @author ph-santos
 */
public class ItemNFCompraController {

    private final ItemNFCompraDAO itemNFCompraDAO = new ItemNFCompraDAO();

    public boolean inserir(ItemNFCompra itemNFCompra) {
        try {
            itemNFCompraDAO.inserir(itemNFCompra);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        return false;
    }

    public List<ItemNFCompra> listarItensNFCompra() {
        return itemNFCompraDAO.listarItensNFCompra();
    }
}
