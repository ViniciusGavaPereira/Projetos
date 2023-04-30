public class Refrigerante implements Bebida {

    private  TipoBebida.EscolhaRefrigerante refrigerante;

    @Override
    public String nome(String nome) {
       return nome;
    }

    @Override
    public String escolha(Integer escolha) {
            
        String refrigeranteEscolhido = null;
        
        switch (escolha) {
            case 1:
            refrigeranteEscolhido = refrigerante.PEPSI.getNome();
            break;
            case 2: 
            refrigeranteEscolhido = refrigerante.COCA_COLA.getNome();
            break;
            
        }
        
        return refrigeranteEscolhido;
    }
    
}
