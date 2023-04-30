public class Refrigerante implements Bebida {



    @Override
    public String nome(String nome) {
       return nome;
    }

    @Override
    public String escolha(Integer escolha) {
            
        String refrigeranteEscolhido = null;
        
        switch (escolha) {
            case 1:
            refrigeranteEscolhido = TipoBebida.EscolhaRefrigerante.PEPSI.getNome();
            break;
            case 2: 
            refrigeranteEscolhido = TipoBebida.EscolhaRefrigerante.COCA_COLA.getNome();
            break;
            default:
            refrigeranteEscolhido = "Escolha inválida";
            
        }
        
        return refrigeranteEscolhido;
    }
    
}
