package desafio1;

import java.math.BigDecimal;

public class CalculadoraComissao {

    public BigDecimal calcular(double valor) {

        BigDecimal valorVenda = BigDecimal.valueOf(valor);

        if (valor < 100) {
            return BigDecimal.ZERO;
        } else if (valor < 500) {
            return valorVenda.multiply(BigDecimal.valueOf(0.01));
        } else {
            return valorVenda.multiply(BigDecimal.valueOf(0.05));
        }
    }
}