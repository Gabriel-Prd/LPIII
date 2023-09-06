import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        double sum = 0, variacao = 0;
        final double [] medicao = new double[10];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < medicao.length; i++){
            
            System.out.printf("Medicao %d: ", i);
            double medido = scanner.nextDouble();

            medicao[i] = medido;
            sum += medido;
        }

        double media = sum/medicao.length;

        for(int i = 0; i < medicao.length; i++){
            variacao += Math.pow(medicao[i] - media, 2);
            variacao /= medicao.length; 
        }

        double desvio = Math.sqrt(variacao);

        System.out.println("Variacao: " + variacao);
        System.out.println("Desvio padrao: " + desvio);

        if(media * 0.1 < desvio){
            System.out.println("O multimetro esta com problemas.");
        }else{
            System.out.println("O multimetro esta funcionando.");
        }
        

    }
}