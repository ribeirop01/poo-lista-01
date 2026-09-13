# poo-lista-01

## QUESTÃO 05 - Scanner e printf

O Scanner é usado para ler dados digitados pelo usuário. Primeiro importamos (java.util.Scanner), criamos um objeto associado ao System.in e usamos métodos como nextInt(), nextLine() ou nextDouble() para ler cada tipo de dado.

Exemplo lendo um double:
Scanner sc = new Scanner(System.in);
double valor = sc.nextDouble();

Já o System.out.printf serve para formatar a saída, controlando casas decimais, espaçamento, etc. Exemplo para exibir 2 casas decimais, considerando valor = 100:
System.out.printf("Valor: %.2f%n", valor);
O resultado mostrado será:
Valor: 100,00 (ou 100.00, dependendo do idioma configurado no sistema)

## QUESTÃO 06 - Erros no código

O código tinha três problemas. Falta os colchetes em String[] args, faltava um ponto e vírgula no println, e o contador nunca era incrementado, causando loop infinito.

O código corrigido:
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
