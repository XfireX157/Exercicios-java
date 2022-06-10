import java.util.*;

public class Exerc21 {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner (System.in);
		
		double valor, prestacoes;
		
		System.out.println("Digite o valor: ");
		valor = Entrada.nextDouble();
		
		prestacoes = valor / 5;
		
		System.out.printf("O valor das prestações são: " + prestacoes);
	}

}
