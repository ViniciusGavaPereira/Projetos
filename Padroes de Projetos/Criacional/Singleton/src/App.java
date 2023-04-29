public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Singleton World!");

        Singleton pessoa1 = Singleton.getInstance();
        Singleton pessoa2 = Singleton.getInstance();

        //Pode perceber que o hashcode das duas pessoas é o mesmo
        System.out.println(pessoa1);
        System.out.println(pessoa2);

    }
}
