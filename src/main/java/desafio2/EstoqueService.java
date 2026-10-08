package desafio2;

public class EstoqueService {

    public void movimentar(Movimentacao movimentacao) {

        Produto produto = movimentacao.getProduto();

        if (movimentacao.getTipo() == TipoMovimentacao.ENTRADA) {

            produto.setEstoque(
                    produto.getEstoque() + movimentacao.getQuantidade()
            );

        } else if (movimentacao.getTipo() == TipoMovimentacao.SAIDA) {

            int novoEstoque =
                    produto.getEstoque() - movimentacao.getQuantidade();

            if (novoEstoque < 0) {
                throw new IllegalArgumentException(
                        "Estoque insuficiente para o produto: "
                                + produto.getDescricaoProduto()
                );
            }

            produto.setEstoque(novoEstoque);
        }
    }
}