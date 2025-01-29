/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author 0077110
 */
public class ConexaoBanco {
    private static final String URL = "jdbc:mysql://localhost:3306/dbotas";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    private static Connection connection = null;

    public static Connection getConexao() throws SQLException {
        if (connection == null) {
            Properties prop = new Properties();
            prop.put("user", USUARIO);
            prop.put("password", SENHA);
            connection = DriverManager.getConnection(URL, prop);
        }
        return connection;
    }

    public void fecharConexao() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}