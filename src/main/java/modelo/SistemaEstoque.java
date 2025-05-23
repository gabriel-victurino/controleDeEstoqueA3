package modelo;
import java.util.Date;

public class SistemaEstoque extends itemEstoque {
    private int id;
    private String operacao; // Entrada ou saida
    private int quantidadeEstoque;
    private int quantidadeMinimo;
    private int quantidadeMaxima;
    private Date data;
    

    public SistemaEstoque() {
    }

    public SistemaEstoque(int id, String operacao, int quantidadeEstoque, int quantidadeMinimo, int quantidadeMaxima, Date data) {
        this.id = id;
        this.operacao = operacao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantidadeMinimo = quantidadeMinimo;
        this.quantidadeMaxima = quantidadeMaxima;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeMinimo() {
        return quantidadeMinimo;
    }

    public void setQuantidadeMinimo(int quantidadeMinimo) {
        this.quantidadeMinimo = quantidadeMinimo;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    // Movimentação dos produtos
    
    public void entrada(int quantidade){
        this.quantidadeEstoque += quantidade;
    }
    
    public void saida(int quantidade){
        this.quantidadeEstoque -= quantidade;
    }
    
    
    // Verificação da quantidade de produtos
    
    public boolean abaixoDoMinimo(){
        return quantidadeEstoque < quantidadeMinimo;
    }
    
    public boolean acimaDoMaximo(){
        return quantidadeEstoque > quantidadeMaxima;
    }
    
    
    // Valor total do produto no Estoque
    
    public double valorTotalEmEstoque(){
        return super.getPrecoUnitario() * quantidadeEstoque;
    }

    
 
    
    
    
}
