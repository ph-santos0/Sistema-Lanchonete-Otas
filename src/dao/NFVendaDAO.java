package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.NFVenda;

/**
 *
 * @author ph-santos
 */
public class NFVendaDAO {

    public void inserir(NFVenda nfVenda) {
        String sql = "INSERT INTO nf_venda (codigo, data_emissao, valor, cpf_cliente) VALUES (?, ?, ?, ?);";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, nfVenda.getCodigo());
            statement.setDate(2, nfVenda.getDataEmissao());
            statement.setDouble(3, nfVenda.getValor());
            statement.setString(4, nfVenda.getCpfCliente());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir NF de Venda", e);
        }
    }

    public List<NFVenda> listarNFVendas() {
        List<NFVenda> nfVendas = new ArrayList<>();
        String sql = "SELECT * FROM nf_venda;";
        try {
            Connection connection = ConexaoBanco.getConexao();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                NFVenda nfVenda = new NFVenda();
                nfVenda.setCodigo(resultSet.getInt("codigo"));
                nfVenda.setDataEmissao(resultSet.getDate("data_emissao"));
                nfVenda.setValor(resultSet.getDouble("valor"));
                nfVenda.setCpfCliente(resultSet.getString("cpf_cliente"));
                nfVendas.add(nfVenda);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar NFs de Venda", e);
        }
        return nfVendas;
    }
}