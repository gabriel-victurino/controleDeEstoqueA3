package modelo;
import java.util.Date;

public class SistemaEstoque {
    private int id;
    private int idProduto;
    private Date data;
    private String operacao; // Entrada ou saida
    private int quantidade;

    public SistemaEstoque() {
    }

    public SistemaEstoque(int id, int idProduto, Date data, String operacao, int quantidade) {
        this.id = id;
        this.idProduto = id;
        this.data = data;
        this.operacao = operacao;
        this.quantidade = quantidade;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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
}
