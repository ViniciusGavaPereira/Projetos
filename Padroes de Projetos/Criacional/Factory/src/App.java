public class App {
    public static void main(String[] args) throws Exception {

        MaquinaRefrigerante maquinaRefrigerante = new MaquinaRefrigerante();

        MaquinaCafe maquinaCafe = new MaquinaCafe();
        
        System.out.println(maquinaRefrigerante.novaBebida().escolha(1));

        System.out.println(maquinaCafe.novaBebida().escolha(4));
    }
}
