package modelo;

public abstract class itemEstoque {
    
    // Classe superior, contendo somente preço e nome.
    
    private String nome;
    private double precoUnitario;

    public itemEstoque() {
    }

    public itemEstoque(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}