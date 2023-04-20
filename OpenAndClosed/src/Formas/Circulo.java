package Formas;
public class Circulo extends FormaGeometrica {

    private double Raio;


    public Circulo(double raio) {
        this.Raio = raio;
    }

    public double getRaio() {
        return Raio;
    }

    public void setRaio(double raio) {
        this.Raio = raio;
    }

    @Override
    public double CalcularArea(){
        return Raio * Raio  * Math.PI;
    }
    
    
}
