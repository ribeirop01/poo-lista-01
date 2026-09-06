import java.util.Locale;
import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		String aluno = sc.nextLine();		
		
		System.out.println("Informe as tres notas do aluno: ");
		double nota_1 = sc.nextDouble();
		double nota_2 = sc.nextDouble();
		double nota_3 = sc.nextDouble();
		
		double media;
		media = (nota_1  + nota_2 + (nota_3 * 2.0)) / 4.0;
		
		System.out.printf("Aluno: %s%n", aluno);
		System.out.printf("Media ponderada = %.2f%n", media);
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		
		sc.close();
	}

}
