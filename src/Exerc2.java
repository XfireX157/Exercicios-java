import java.util.*;

public class Exerc2 {
	public static void main (String []args) {
		Scanner Entrada = new Scanner (System.in);
		int num;
		
		System.out.println("Digite o valor: ");
		num = Entrada.nextInt();
		
		if(num % 10 == 0 || num % 5 == 0 || num % 2 == 0) {
			System.out.println("Esse número é divisivel por 10, 5 e 2");
		}else {
			System.out.println("Esse não número não é divisivel");
		}
	}
}
