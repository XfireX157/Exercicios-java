import java.util.*;

public class Exerc17 {
	public static void main (String[] args) {
		Scanner Entrada = new Scanner(System.in);
		
		int idade = 0, contador = 0;
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Digite as idades: ");
			idade = Entrada.nextInt();
			
			if(idade >= 18) {
				System.out.println("Maior de idade");
				
				contador++;
			}else {
				System.out.println("Menor de idade");
			}
				
		}
		
		System.out.println("São maiores de idade: " + contador);
	}
}
