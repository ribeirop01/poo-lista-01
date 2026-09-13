import java.util.Scanner;
public class Questao02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, resto1, resto2;
		
		System.out.println("Informe um numero: ");
		num = sc.nextInt();
		
		resto1 = num % 3;
		resto2 = num % 5;
		
		if(resto1 == 0 && resto2 != 0) {
			System.out.println("Multiplo de 3");
		}else if(resto1 != 0 && resto2 == 0){
			System.out.println("Multiplo de 5");
		}else if(resto1 == 0 && resto2 == 0) {
			System.out.println("Multiplo de ambos");
		}else {
			System.out.println("Não é multiplo de 3 nem de 5");
		}
		sc.close();
	}

}
