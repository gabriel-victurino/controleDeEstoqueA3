package dao;
import modelo.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO {
    private Connection conexao;

    public ProdutoDAO(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void inserir(Produto produto) {
      // Requer SQL (Ahron)
    }
    
    public void atualizar(Produto produto) {
        // Requer SQL (Ahron)
    }
    
    public void deletar(int id) {
        // Requer SQL (Ahron)
    }
}
