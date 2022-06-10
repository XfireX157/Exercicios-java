import java.util.*;

public class Exerc6 {
	public static void main(String []args) {
		Scanner Entrada = new Scanner(System.in);
		int num, sucessor, antecessor;
		
		System.out.println("Digite um numero: ");
		num = Entrada.nextInt();
		
		sucessor = num + 1;
		antecessor = num - 1;
		
		System.out.println("O sucessor de " + num + " é " + sucessor);
		System.out.println("O antecessor de " + num + " é " + antecessor);
	}
}
