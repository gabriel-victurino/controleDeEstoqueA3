package modelo;
import modelo.Categoria;
import modelo.ItemEstoque;
public class Produto extends ItemEstoque{
    public String unidade; // Kg, Litros, etc.
    private int quantidadeEstoque;
    private int quantidadeMinima;
    private int quantidadeMaxima;
    private Categoria categoria; // Se referindo a classe Categoria.

    public Produto() {
    }

    // Construtor sem quantidadeEstoque, para ser iniciado com zero no estoque.
    
    public Produto(String unidade, int quantidadeMinima, int quantidadeMaxima, Categoria categoria) {
        this.unidade = unidade;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeMaxima = quantidadeMaxima;
        this.categoria = categoria;
    }

    public Produto(String unidade, int quantidadeMinima, int quantidadeMaxima, Categoria categoria, String nome, double precoUnitario) {
        super(nome, precoUnitario);
        this.unidade = unidade;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeMaxima = quantidadeMaxima;
        this.categoria = categoria;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
        return quantidadeEstoque < quantidadeMinima;
    }
    
    public boolean acimaDoMaximo(){
        return quantidadeEstoque > quantidadeMaxima;
    }
    
    
    // Valor total do produto no Estoque
    
    public double valorTotalEmEstoque(){
        return super.getPrecoUnitario() * quantidadeEstoque;
    }

    

     
}
