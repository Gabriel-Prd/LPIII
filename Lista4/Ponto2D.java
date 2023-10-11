package Lista4;

import java.lang.Math;

public class Ponto2D {
    private double x, y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void imprimirPonto() {
        System.out.println("Coordenadas: (" + x + ", " + y + ")");
    }

    public boolean isEixoX() {
        return y == 0;
    }

    public boolean isEixoY() {
        return x == 0;
    }

    public boolean isEixos() {
        return isEixoX() || isEixoY();
    }

    public int quadrante() {
        if (isEixos()) {
            return 0; // Está sobre um dos eixos
        } else if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public float distancia(Ponto2D outroPonto) {
        double dx = this.x - outroPonto.getX();
        double dy = this.y - outroPonto.getY();
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}
