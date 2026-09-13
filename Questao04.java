import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um numero inteiro (entre 1 e 30): ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}