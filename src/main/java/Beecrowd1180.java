import java.util.Scanner;

public class Beecrowd1180 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int [] X = new int[N];
        int menorValor = 10000, posicaoMV = 0;

        for (int i = 0; i < X.length; i++){
            X[i] = leitor.nextInt();
            if (menorValor > X[i]){
                menorValor = X[i];
                posicaoMV = i;
            }
        }
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicaoMV);
    }
}