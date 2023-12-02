package Lista9;
import java.lang.Math;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D ponto) {
        this.x = ponto.getX();
        this.y = ponto.getY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean inAxisX() {
        return y == 0;
    }

    public boolean inAxisY() {
        return x == 0;
    }

    public boolean inAxis() {
        return inAxisX() || inAxisY();
    }

    public boolean isOrigin() {
        return x == 0 && y == 0;
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Ponto2D ponto) {
        return distance(ponto.getX(), ponto.getY());
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }

    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D(3, 4); 
        Ponto2D ponto3 = new Ponto2D(ponto2); 

        System.out.println("Ponto1: " + ponto1);
        System.out.println("Ponto2: " + ponto2);
        System.out.println("Ponto3: " + ponto3);

        System.out.println("Ponto2 está no eixo X? " + ponto2.inAxisX());
        System.out.println("Ponto2 está no eixo Y? " + ponto2.inAxisY());
        System.out.println("Ponto2 está sobre os eixos? " + ponto2.inAxis());
        System.out.println("Ponto2 está na origem? " + ponto2.isOrigin());

        System.out.println("Distância entre Ponto1 e Ponto2: " + ponto1.distance(ponto2));
        System.out.println("Distância entre Ponto2 e Ponto3: " + ponto2.distance(ponto3));
    }
}
