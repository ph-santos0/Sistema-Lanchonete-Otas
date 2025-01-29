/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author 0077110
 */
public class ProdutoDAO {
    public void inserir(Produto produto) {
        String sql = "INSERT INTO produto (codigo, nome, estoque, valor, imposto, unidade) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection connection = ConexaoBanco.getConexao();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, produto.getCodigo());
            statement.setString(2, produto.getNome());
            statement.setInt(3, produto.getEstoque());
            statement.setDouble(4, produto.getValor());
            statement.setDouble(5, produto.getImposto());
            statement.setString(6, produto.getUnidade());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir produto", e);
        }
    }
    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<Produto>();
        String sql = "SELECT * FROM produto";
        try {
            Connection connection = ConexaoBanco.getConexao();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Produto produto = new Produto(
                        resultSet.getInt("codigo"),
                        resultSet.getString("nome"),
                        resultSet.getInt("estoque"),
                        resultSet.getDouble("valor"),
                        resultSet.getDouble("imposto"),
                        resultSet.getString("unidade")
                );
                produtos.add(produto);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar produtos", e);
        }
        return produtos;
    }
}
