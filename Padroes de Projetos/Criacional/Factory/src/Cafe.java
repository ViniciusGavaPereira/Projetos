public class Cafe implements Bebida {

    private TipoBebida.EscolhaCafe cafe;

    @Override
    public String nome(String nome) {
       return nome;
    }

    @Override
    public String escolha(Integer escolha) {
       
        String cafeEscolhido = null;

        switch(escolha){
            case 1: 
            cafeEscolhido = cafe.MOCACCINO.getNome();
            break;
            case 2: 
            cafeEscolhido = cafe.CARIOCA.getNome();
            break;
            case 3: 
            cafeEscolhido = cafe.CAFEPRETO.getNome();
            break;

        }        

        return cafeEscolhido;
    }
    
}
