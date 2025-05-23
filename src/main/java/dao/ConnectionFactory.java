package dao;
import java.sql.Connection;
//conecta com o banco
import java.sql.DriverManager;
//abre a conexão
import java.sql.SQLException;
//trata possíveis erros
                        
public class ConnectionFactory {  
    private static final String URL = "jdbc:mysql://localhost:3306/nosso_banco";
    private static final String USUARIO = "usuario";
    private static final String SENHA = "nossa_senha";
    //conexão com as informações do banco de dados, depois tem que substituir quando criado
    
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA); //cria conexão com os dados
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver JDBC não encontrado.", e);
        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar ao banco de dados: " + e.getMessage()); //caso der erro
        }
    } 
}
