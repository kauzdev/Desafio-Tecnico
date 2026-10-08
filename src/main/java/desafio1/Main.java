package desafio1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        InputStream arquivo = Main.class
                .getClassLoader()
                .getResourceAsStream("vendas.json");

        DadosVenda dados = mapper.readValue(arquivo, DadosVenda.class);

        CalculadoraComissao calculadora = new CalculadoraComissao();

        Map<String, BigDecimal> comissoes = new HashMap<>();

        for (Venda venda : dados.getVendas()) {

            String vendedor = venda.getVendedor();

            BigDecimal comissao = calculadora.calcular(venda.getValor());

            if (comissoes.containsKey(vendedor)) {

                BigDecimal totalAtual = comissoes.get(vendedor);

                comissoes.put(vendedor, totalAtual.add(comissao));

            } else {

                comissoes.put(vendedor, comissao);
            }
        }

        System.out.println("=== RELATÓRIO DE COMISSÕES ===");

        for (Map.Entry<String, BigDecimal> entrada : comissoes.entrySet()) {

            System.out.println(
                    entrada.getKey()
                            + " - Comissão total: R$ "
                            + entrada.getValue().setScale(2, java.math.RoundingMode.HALF_UP)
            );
        }
    }
}