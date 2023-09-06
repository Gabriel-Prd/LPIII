public class q2 {
    public static void main(String[] args){
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        int pontos = dado1 + dado2;
        int contador = 0;


        System.out.printf("Dado 1 = %d, Dado 2 = %d\n", dado1, dado2);
        System.out.printf("Total de pontos = %d\n", pontos);

        if(pontos == 7 || pontos == 11){
            System.out.println("Voce Ganhou!!");
            return;
        }

        if(pontos == 2 || pontos == 3|| pontos == 12){
            System.out.println("Voce Perdeu!!");
            return;
        }

        System.out.println("Segunda fase!");

        while(true){
            contador ++;
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            int pontos2 = dado1 + dado2;

            System.out.printf("Dado 1 = %d, Dado 2 = %d\n", dado1, dado2);
            System.out.printf("Jogada %d: %d\n", contador, pontos2);

            if(pontos2 == 7){
                System.out.println("Voce Perdeu!!");
                return;
            }

            if(pontos2 == pontos){
                System.out.println("Voce Ganhou!!");
                return;
            }
        }

    }
}
