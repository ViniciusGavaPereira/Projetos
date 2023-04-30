public class TipoBebida {

    public enum EscolhaRefrigerante{
        
        PEPSI("Pepsi"),
        COCA_COLA("Coca - cola");

        private String nome;

        EscolhaRefrigerante(String nome){
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

    }

    public enum EscolhaCafe {

        MOCACCINO("Mocaccino"),
        CARIOCA("Carioca"),
        CAFEPRETO("Café preto");
    
        private String nome;
    
        EscolhaCafe(String nome) {
            this.nome = nome;
        }
    
        public String getNome() {
            return nome;
        }
    }


}

