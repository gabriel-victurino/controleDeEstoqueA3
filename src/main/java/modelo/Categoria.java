package modelo;

public class Categoria {
    private String tipo; // Exemplo limpeza, enlatados, vegetais, óleos, etc...
    private String tamanho; // Pequeno, Medio e Grande;
    private String embalagem; // Lata, Vidro e Plastico;

    public Categoria() {
    }

    public Categoria(String tipo, String tamanho, String embalagem) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }
    
    
    
            
    
}
