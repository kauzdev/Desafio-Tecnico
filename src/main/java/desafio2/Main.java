package desafio2;

public class Main {

    public static void main(String[] args) {

        Produto caneta = new Produto(
                101,
                "Caneta Azul",
                150
        );

        Produto caderno = new Produto(
                102,
                "Caderno Universitário",
                75
        );

        Produto borracha = new Produto(
                103,
                "Borracha Branca",
                200
        );

        Produto lapis = new Produto(
                104,
                "Lápis Preto HB",
                320
        );

        Produto marcador = new Produto(
                105,
                "Marcador de Texto Amarelo",
                90
        );

        EstoqueService estoqueService = new EstoqueService();

        Movimentacao entradaCaneta = new Movimentacao(
                caneta,
                50,
                TipoMovimentacao.ENTRADA,
                "Entrada de mercadoria"
        );

        estoqueService.movimentar(entradaCaneta);

        Movimentacao saidaCaneta = new Movimentacao(
                caneta,
                30,
                TipoMovimentacao.SAIDA,
                "Saída de mercadoria"
        );

        estoqueService.movimentar(saidaCaneta);

        System.out.println(
                "Movimentação #" + entradaCaneta.getId()
                        + " - " + entradaCaneta.getDescricao()
        );

        System.out.println(
                "Movimentação #" + saidaCaneta.getId()
                        + " - " + saidaCaneta.getDescricao()
        );

        System.out.println(
                "Produto: " + caneta.getDescricaoProduto()
                        + " | Estoque final: " + caneta.getEstoque()
        );
    }
}