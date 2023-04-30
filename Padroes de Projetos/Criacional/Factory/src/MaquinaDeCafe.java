public class MaquinaDeCafe extends MaquinaDeBebidas {
   

    public enum TipoDoCafe {EXPRESSO, CARIOCA}
   
    @Override
    public Bebida entregaBebiba(TipoDoCafe tipoDoCafe) {
        Bebida cafe = null;
        
        switch (tipoDoCafe) {
            case EXPRESSO: cafe = new CafeExpresso("Expresso");
            case CARIOCA: cafe = new CafeCarioca("Carioca");
        }
        
        return cafe;
     
    } 
}
