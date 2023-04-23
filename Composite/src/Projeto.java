import java.util.List;

public class Projeto implements Item{

    private List<Item> itens;
    
    

    public Projeto(List<Item> itens) {
        this.itens = itens;
    }

    public void addItem(Item item){

        this.itens.add(item);
    }

    @Override
    public String buscarNome() {
       
        String nomeProduto = "";

        for(Item item: itens){
            nomeProduto = item.buscarNome();

            System.out.println("Nome do produto: "  + nomeProduto);
        }

        return nomeProduto;
    }

    @Override
    public double buscarPreco() {

        double precoProduto = 0;

        for(Item item : itens){
            precoProduto = item.buscarPreco();
            System.out.println("Valor do produto: " + precoProduto);

        }

        return precoProduto;
    }

    @Override
    public double calcularPrecoFInal() {
      
        double precoFinal = 0;

        for(Item item: itens){
            precoFinal += item.calcularPrecoFInal();

            System.out.println("Nome do produto: " + item.buscarNome() + "\nValor do produto: "  + item.buscarPreco() + "\n");
        }
    
        return precoFinal;
    }

   

    

   
}
