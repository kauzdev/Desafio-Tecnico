package desafio1;

public class Venda {
    private String vendedor;
    private double valor;

    public Venda(){}

    public Venda(String vendedor, double valor){
        this.vendedor = vendedor;
        this.valor = valor;
    }

    public String getVendedor(){
        return vendedor;
    }

    public double getValor(){
        return valor;
    }

    public void setVendedor(String vendedor){
        this.vendedor = vendedor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
}
