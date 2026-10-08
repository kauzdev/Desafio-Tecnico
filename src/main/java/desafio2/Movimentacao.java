package desafio2;

public class Movimentacao {

    private static int proximoId = 1;

    private int id;
    private Produto produto;
    private int quantidade;
    private TipoMovimentacao tipo;
    private String descricao;

    public Movimentacao() {
    }

    public Movimentacao(Produto produto, int quantidade,
                        TipoMovimentacao tipo, String descricao) {

        this.id = proximoId++;
        this.produto = produto;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public TipoMovimentacao getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }
}