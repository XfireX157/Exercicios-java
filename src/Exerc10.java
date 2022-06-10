import java.util.*;

public class Exerc10 {
	public static void main(String []args) {
		Scanner Entrada = new Scanner(System.in);
		
		double saldo; 
		System.out.println("Digite o saldo: ");
		saldo = Entrada.nextDouble();

		System.out.printf("O seu saldo foi para:  " +  saldo * 1.5);
		
		Entrada.close();
	}
}
