import java.util.*;

public class Exerc14 {
	public static void main(String []args) {
		Scanner Entrada = new Scanner(System.in);
	
		int valor, soma = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " Digite os números: ");
			valor = Entrada.nextInt();
			
			soma += valor;
		}	
		
		System.out.println(soma);
	}
}
