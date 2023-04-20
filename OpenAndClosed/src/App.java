import Formas.Circulo;
import Formas.FormaGeometrica;
import Formas.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        FormaGeometrica quadrado = new Retangulo(50, 50);
        System.out.println("Área do quadrado: " + quadrado.CalcularArea());

     
        FormaGeometrica circulo = new Circulo(30);
        System.out.println("Área do circulo: " + circulo.CalcularArea());


    }
}
