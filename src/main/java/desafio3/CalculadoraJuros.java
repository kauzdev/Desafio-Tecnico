package desafio3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculadoraJuros {

    private static final BigDecimal TAXA_DIARIA =
            BigDecimal.valueOf(0.025);

    public BigDecimal calcularJuros(
            BigDecimal valor,
            LocalDate dataVencimento,
            LocalDate dataAtual) {

        long diasAtraso = ChronoUnit.DAYS.between(
                dataVencimento,
                dataAtual
        );

        if (diasAtraso <= 0) {
            return BigDecimal.ZERO;
        }

        return valor
                .multiply(TAXA_DIARIA)
                .multiply(BigDecimal.valueOf(diasAtraso));
    }
}