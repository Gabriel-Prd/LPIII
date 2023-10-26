package Lista5;

public class Circulo{
    private float x, y, raio;
    
    Circulo(float x, float y, float raio){
        this.x = x;
        this.y = y;
        if(validaCirculo(raio))
            this.raio = raio;
        else{ 
            this.raio = 1F;
            System.out.println("Raio invalido, inicializado como 1");
        }
    }

    public void setX(float x) {
         this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setRaio(float raio) {
        if(validaCirculo(raio))
            this.raio = raio;
        else{
            System.out.println("Valor invalido");
        }
    }

    public float getRaio() {
        return raio;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }

    public float area(){
        return raio*raio*3.14F;
    }
    public float perimetro(){
        return 2*raio*3.14F;
    }

    public boolean ehMaiorQue(Circulo rnd){
        return this.area() > rnd.area();
    }
    public boolean ehPontoInterno(Ponto2D ponto){
        Ponto2D aux = new Ponto2D(this.x, this.y);
        return ponto.distancia(aux) < raio;
    }
    private boolean validaCirculo(float raio){
        return (raio > 0);
    }
}
