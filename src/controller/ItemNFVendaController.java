package controller;

import dao.ItemNFVendaDAO;
import java.util.List;
import model.ItemNFVenda;

/**
 *
 * @author wfabi0
 */
public class ItemNFVendaController {

    private final ItemNFVendaDAO itemNFVendaDAO = new ItemNFVendaDAO();

    public boolean inserir(ItemNFVenda itemNFVenda) {
        try {
            itemNFVendaDAO.inserir(itemNFVenda);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        return false;
    }

    public List<ItemNFVenda> listarItensNFVenda() {
        return itemNFVendaDAO.listarItensNFVenda();
    }

}
