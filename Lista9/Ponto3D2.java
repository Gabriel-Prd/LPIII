package Lista9;

public class Ponto3D2 {
    private Ponto2D ponto2D; 
    private double z;

    public Ponto3D2() {
        this.ponto2D = new Ponto2D();
        this.z = 0;
    }

    public Ponto3D2(double x, double y, double z) {
        this.ponto2D = new Ponto2D(x, y);
        this.z = z;
    }

    public Ponto3D2(Ponto2D ponto2D, double z) {
        this.ponto2D = ponto2D;
        this.z = z;
    }

    @Override
    public String toString() {
        return ponto2D.toString() + ", " + z;
    }

    public static void main(String[] args) {
        Ponto2D ponto2D = new Ponto2D(1, 2);
        Ponto3D2 ponto3D = new Ponto3D2(ponto2D, 3);
        System.out.println("Ponto3D: " + ponto3D);
    }
}
