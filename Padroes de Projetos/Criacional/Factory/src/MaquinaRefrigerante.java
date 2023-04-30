public class MaquinaRefrigerante extends MaquinaBebida {
    
    public Bebida novaBebida(){
        return new Refrigerante();
    }
}
