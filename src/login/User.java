package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Classe que representa um usuário e interage com um banco de dados MySQL
public class User {
    // Método para estabelecer uma conexão com o banco de dados
    public Connection conectarBD() {
        Connection conn = null;
        try {
        	// Poderia fornecer uma mensagem de erro mais descritiva para a exceção, indicando problemas na conexão.
            // Carrega o driver JDBC do MySQL
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Poderia fornecer uma mensagem mais descritiva para a exceção capturada
            // Deveria inserir exceções necessárias para melhor funcionamento do código
        }
        return conn; // Retorna a função conectarBD() estabelecendo uma conexão com o banco de dados
    }

    public String nome = "";   // Nome do usuário
    public boolean result = false;  // Resultado da verificação

    // Método para verificar as credenciais de login do usuário no banco de dados
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();

        // Construção da instrução SQL para recuperar o nome do usuário com base no login e senha
        // Poderia concatenar as funções SQL para econimizar linhas e melhorar o entendimento do código
        sql += "select nome from usuarios ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";

        try {
            // Poderia incluir mensagens informativas para indicar a execução de etapas importantes
            // Criação de uma declaração SQL
            Statement st = conn.createStatement();
            // Execução da consulta SQL
            ResultSet rs = st.executeQuery(sql);

            // Verifica se foi encontrado algum registro
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
        	// Poderia fornecer uma mensagem de erro mais descritiva para a exceção, indicando problemas na conexão.
            // Deveria incluir exceções necessárias para melhor funcionamento do código 
        }
        return result; // Retorna o valor atual da variável 'result'
    }
} //fim da classe
