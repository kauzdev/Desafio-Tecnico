package desafio2;

public class Produto {

    private int codigoProduto;
    private String descricaoProduto;
    private int estoque;

    public Produto() {
    }

    public Produto(int codigoProduto, String descricaoProduto, int estoque) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.estoque = estoque;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}