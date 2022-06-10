import java.util.*;

public class Exerc16 {
	public static void main(String [] args) {
		Scanner Entrada = new Scanner(System.in);
		
		int idade, media = 0, soma = 0;
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Digite as idades: ");
			idade = Entrada.nextInt();
			
			soma += idade;
			media = soma / 20;
		}
		
		System.out.println(media);
		
		Entrada.close();
	}
}
