public class Prato {
    private String nome;
    private double preco;
    private String desc;

    public Prato(String nome, double preco, String desc){
        this.nome = nome;
        this.preco = preco;
        this.desc = desc;
    }

    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public String getDesc(){
        return this.desc;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }

    @Override
    public String toString(){
        return nome + " - R$" + String.format("%.2f", preco) + "\n-" + desc;
    }
}
