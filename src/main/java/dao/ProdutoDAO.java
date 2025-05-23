package dao;
import java.sql.*;
import modelo.Produto;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO {
    private Connection conexao;

    public ProdutoDAO(Connection conexao) {
        this.conexao = conexao;
    }
//incompleta só pra começar, falta preço, estoque, quant minima, quant maxima e categoria (fazer Produto.java primeiro)
    public void inserir(Produto produto) { 
        String sql = "INSERT INTO produtos (nome, unidade) VALUES (?,?)";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getUnidade());
            stmt.setDouble(3, produto.getPrecoUnitario());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erro ao inserir produto " + e.getMessage());
        }
    }
    
    public void alterar(Produto produto) {
        String sql = "UPDATE produtos SET nome = ?, unidade = ? WHERE id = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidadeMaxima());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erro ao alterar produto " + e.getMessage());
        }
    }
    
    public void apagar(int id) {
        String sql = "DELETE FROM produtos WHERE id = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erro ao remover produto " + e.getMessage());
        }
    }
}
