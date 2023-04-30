public class Cafe implements Bebida {


    @Override
    public String nome(String nome) {
       return nome;
    }

    @Override
    public String escolha(Integer escolha) {
       
        String cafeEscolhido = null;

        switch(escolha){
            case 1: 
            cafeEscolhido = TipoBebida.EscolhaCafe.MOCACCINO.getNome();
            break;
            case 2: 
            cafeEscolhido = TipoBebida.EscolhaCafe.CARIOCA.getNome();
            break;
            case 3: 
            cafeEscolhido = TipoBebida.EscolhaCafe.CAFEPRETO.getNome();
            break;

        }        

        return cafeEscolhido;
    }
    
}
