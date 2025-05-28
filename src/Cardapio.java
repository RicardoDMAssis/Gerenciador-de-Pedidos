import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Prato>  pratos;

    public Cardapio(){
        pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato){
        pratos.add(prato);
    }

    public void removerPrato(String nome){
        Prato pratoEncontrado = buscarPratoPorNome(nome);

        if (pratoEncontrado == null) {
            System.out.println("Prato não encontrado.");
        } else{
            pratos.remove(pratoEncontrado);
            System.out.println("Prato removido!!!");
        }
    }

    public void editarPrato(String nome, String novoNome, double novoPreco, String novaDesc){
        Prato pratoEncontrado = buscarPratoPorNome(nome);

        if (pratoEncontrado == null) {
            System.out.println("Prato não encontrado.");
        } else{
            pratoEncontrado.setNome(novoNome);
            pratoEncontrado.setPreco(novoPreco);
            pratoEncontrado.setDesc(novaDesc);
            System.out.println("Prato Modificado!!!");
        }
    }

    public void listarPratos(){
        if (pratos.isEmpty()) {
            System.out.println("Lista de Pratos vazia.");
        } else{
            for(Prato prato : pratos){
                System.out.println(prato);
                System.out.println("----------");
            }
        }
    }

    public Prato buscarPratoPorNome(String nome){
        for(Prato prato: pratos){
            if (prato.getNome().equalsIgnoreCase(nome)) {
                return prato;
            }
        }
        return null;
    }

    public List<Prato> getPratos(){
        return pratos
    }
}
