package Lista9;

public class Ponto3D3 extends Ponto2D {
    private double z;

 
    public Ponto3D3() {
        super(); 
        this.z = 0;
    }

    public Ponto3D3(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + z;
    }

    public static void main(String[] args) {
        Ponto3D3 ponto3D = new Ponto3D3(1, 2, 3);
        System.out.println("Ponto3D: " + ponto3D);
    }
}
