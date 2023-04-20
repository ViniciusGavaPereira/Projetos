
package Formas;
public class Retangulo extends FormaGeometrica {

    public double Largura;
    public double Altura;

  

    public Retangulo(double largura, double altura) {
        Largura = largura;
        Altura = altura;
    }


    public double getAltura() {
        return Altura;
    }


    public void setAltura(double altura) {
        Altura = altura;
    }


    @Override
    public double CalcularArea() {
        return Altura * Largura;
    }
    

}

    

   
