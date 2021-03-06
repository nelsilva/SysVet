package classes;

public class Estoque {

    private int codEstoque;
    private String numeroNota;
    private String quantidade;
    private float valorUnidade;

    public int getCodEstoque() {
        return codEstoque;
    }

    public void setCodEstoque(int codEstoque) {
        this.codEstoque = codEstoque;
    }

    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(float valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public Estoque() {

    }

    public Estoque(int codEstoque, String numeroNota, String quantidade, float valorUnidade) {
        this.codEstoque = codEstoque;
        this.numeroNota = numeroNota;
        this.quantidade = quantidade;
        this.valorUnidade = valorUnidade;
    }

}
