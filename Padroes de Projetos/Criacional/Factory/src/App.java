public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        MaquinaRefrigerante maquinaRefrigerante = new MaquinaRefrigerante();

        MaquinaCafe maquinaCafe = new MaquinaCafe();
        
        System.out.println(maquinaRefrigerante.novaBebida().escolha(1));

        System.out.println(maquinaCafe.novaBebida().escolha(2));
    }
}
