package desafio1;

import java.util.List;

public class DadosVenda {
    private List<Venda> vendas;

    public DadosVenda(){}

    public List<Venda> getVendas(){
        return vendas;
    }

    public void setVendas(List<Venda> vendas){
        this.vendas = vendas;
    }
}
