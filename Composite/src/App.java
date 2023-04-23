import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        
        Projeto estoqueUm = new Projeto(new ArrayList<Item>());

        estoqueUm.addItem(new Produto("TV", 2500));
        estoqueUm.addItem(new Produto("SOFÁ", 3500));
        estoqueUm.addItem(new Produto("CADEIRA", 700));


        Projeto estoqueDois = new Projeto(new ArrayList<Item>());
        estoqueDois.addItem(estoqueUm);

        estoqueDois.addItem(new Produto("CONTROLE", 700));
        estoqueDois.addItem(new Produto("XBOX", 3500));
        estoqueDois.addItem(new Produto("CARREGADOR", 100));    
    
        
        //Traz os itens só do estoque um, que está dentro do estoque dois:
        //System.out.println("\nTotal do projeto: " + estoqueUm.calcularPrecoFInal());


        //Traz todos os itens do estoque dois, que possui os itens do estoque um 
        System.out.println("\nTotal do projeto: " + estoqueDois.calcularPrecoFInal());


    
    }
}
