package Lista9;

public class Ponto3D1{
    private Ponto2D ponto2D;
    private double z;

    public Ponto3D1() {
        this.ponto2D = new Ponto2D();
        this.z = 0;
    }

    public Ponto3D1(double x, double y, double z) {
        this.ponto2D = new Ponto2D(x, y);
        this.z = z;
    }

    public Ponto3D1(Ponto2D ponto2D, double z) {
        this.ponto2D = ponto2D;
        this.z = z;
    }

    @Override
    public String toString() {
        return ponto2D.toString() + ", " + z;
    }

    public static void main(String[] args) {
        Ponto3D1 ponto3D = new Ponto3D1(1, 2, 3);
        System.out.println("Ponto3D: " + ponto3D);
    }
}
