import java.util.*;

public class Exerc15 {
	public static void main(String []args) {
		Scanner Entrada = new Scanner(System.in);
		int idade, soma = 0;
		
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Digite as idades: ");
			idade = Entrada.nextInt();
			
			soma += idade;
		}
		System.out.println(soma);
	}
}
