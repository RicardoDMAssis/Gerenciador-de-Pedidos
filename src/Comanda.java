import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private List<Pedido> pedidos;
    private int idComanda;

    public Comanda(int idComanda){
        this.idComanda = idComanda;
        this.pedidos = new ArrayList<>();
    }

    public List<Pedido> getPedidos(){
        return this.pedidos;
    }
    public int getId(){
        return this.idComanda;
    }

    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public double fecharComanda(){
        double totalComanda = 0;
        for (Pedido pedido : pedidos) {
            totalComanda += pedido.getTotal();
        }
        return totalComanda;
    }

}
