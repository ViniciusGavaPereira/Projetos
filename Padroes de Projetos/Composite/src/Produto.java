public class Produto implements Item {

    private String nome;
    private double preco;


    


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFInal() {

        return preco;
    }

    @Override
    public String buscarNome() {
        
        return nome;
    }

    @Override
    public double buscarPreco() {
        
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    



}
