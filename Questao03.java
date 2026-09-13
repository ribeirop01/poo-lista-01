import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo N: ");
        int n = scanner.nextInt();

        System.out.println("Números primos entre 2 e " + n + ":");

        for (int i = 2; i <= n; i++) {
            int cont = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }

            
            if (cont == 2) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}