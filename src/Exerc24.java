import java.util.*;

public class Exerc24 {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner (System.in);
		
		int valor = 0, soma = 0;
		
		for( ; valor >= 0;) {
			System.out.println("Digite o valor: ");
			valor = Entrada.nextInt();
		
			soma += valor;
		}
		System.out.println(soma);
	}
}
