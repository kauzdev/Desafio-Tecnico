package desafio3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BigDecimal valor = BigDecimal.valueOf(1000);

        LocalDate dataVencimento =
                LocalDate.of(2026, 10, 1);

        LocalDate dataAtual =
                LocalDate.now();

        CalculadoraJuros calculadora =
                new CalculadoraJuros();

        BigDecimal juros = calculadora.calcularJuros(
                valor,
                dataVencimento,
                dataAtual
        );

        BigDecimal valorTotal = valor.add(juros);

        System.out.println("=== CÁLCULO DE JUROS ===");

        System.out.println(
                "Valor original: R$ "
                        + valor.setScale(2, RoundingMode.HALF_UP)
        );

        System.out.println(
                "Data de vencimento: "
                        + dataVencimento
        );

        System.out.println(
                "Data atual: "
                        + dataAtual
        );

        System.out.println(
                "Juros: R$ "
                        + juros.setScale(2, RoundingMode.HALF_UP)
        );

        System.out.println(
                "Valor total: R$ "
                        + valorTotal.setScale(2, RoundingMode.HALF_UP)
        );
    }
}