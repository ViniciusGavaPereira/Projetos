public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        MaquinaRefrigerante maquinaRefrigerante = new MaquinaRefrigerante();

        
        System.out.println(maquinaRefrigerante.novaBebida().escolha(1));
    }
}
