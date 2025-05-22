package dao;
import java.sql.*;
import modelo.Categoria;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    private Connection conexao;

    public CategoriaDAO(Connection conexao) {
        this.conexao = conexao;
    }
    public void inserir(Categoria categoria) {
        //Requer SQL (Ahron)
    }
    public void atualizar(Categoria categoria) {
        //Requer SQL (Ahron)
    }
    public void deletar(int id) {
        //Requer SQL (Ahron)
    }
}
