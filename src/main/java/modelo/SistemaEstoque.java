package modelo;
import java.util.Date;

public class SistemaEstoque {
    private int id;
    private int idProduto;
    private String operacao; // Entrada ou saida
    private int quantidade;
    private Date data;

    public SistemaEstoque() {
    }

    public SistemaEstoque(int id, int idProduto, String operacao, int quantidade, Date data) {
        this.id = id;
        this.idProduto = idProduto;
        this.operacao = operacao;
        this.quantidade = quantidade;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
