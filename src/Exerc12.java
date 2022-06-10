import java.util.*;

public class Exerc12 {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner (System.in);
		
		int soma = 0;
		
		for(int i = 0; i < 15; i++) {
			System.out.println("Digite os números: " + soma);
			soma = Entrada.nextInt();
			
			soma = soma + i;
		}
		
		System.out.println(soma);
	}
}
