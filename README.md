# poo-lista-01

## QUESTÃO 05 - Scanner e printf

O Scanner é usado para ler dados digitados pelo usuário. Primeiro importamos java.util.Scanner, criamos um objeto associado ao System.in e usamos métodos como nextInt(), nextLine() ou nextDouble() para ler cada tipo de dado, dependendo do que se espera receber.

Por exemplo, para ler um double:

    Scanner sc = new Scanner(System.in);
    double valor = sc.nextDouble();

Já o System.out.printf serve pra formatar a saída, controlando coisas como número de casas decimais e espaçamento. Se eu quiser exibir um valor com 2 casas decimais, considerando valor = 100, ficaria assim:

    System.out.printf("Valor: %.2f%n", valor);

E o resultado seria: Valor: 100,00 (ou 100.00, dependendo do idioma configurado no sistema).

## QUESTÃO 06 - Erros no código

O código original tinha três erros: faltavam os colchetes em String[] args, faltava um ponto e vírgula no final do println, e o contador nunca era incrementado dentro do while, o que causava um loop infinito.

Corrigindo esses três pontos, o código fica assim:

    import java.util.Scanner;

    public class Contador {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int contador = 0;
            while (contador <= 5) {
                System.out.println("Contador: " + contador);
                contador++;
            }
        }
    }
