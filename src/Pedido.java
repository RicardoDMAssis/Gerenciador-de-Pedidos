import java.util.List;

public class Pedido {
    private Prato prato;
    private int quantidade;

    public Pedido(Prato prato, int quantidade){
        this.prato = prato;
        this.quantidade = quantidade;
    }

    public Prato getPrato(){
        return this.prato;
    }
    public int getQuantidade(){
        return this.quantidade;
    }

    public void setPrato(Prato prato){
        this.prato = prato;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getTotal(){
        return prato.getPreco() * quantidade;
    }

    @Override 
    public String toString(){
        return quantidade + "x " + prato.getNome() + ". Total R$" + String.format("%.2f", getTotal());
    }
}
