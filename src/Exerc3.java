import java.util.*;

public class Exerc3 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int media = 0;
		
		for (int i = 0; i < 12; i++) {
			System.out.println("Digite o valor do m�s: " + i);
			media = sc.nextInt();
		}
		
		if(media < 500) {
			System.out.println("Nenhum cr�dito. Saldo m�dio: " + media);
		} else if(media >= 501 && media < 1000) {
			System.out.println("30% do valor do saldo m�dio.Saldo m�dio: " + media );
		} else if(media >= 1001 && media < 3000) {
			System.out.println("40% do valor do saldo m�dio. Saldo m�dio: " + media );
		} else {
			System.out.println("50% do valor do saldo m�dio. Saldo m�dio: " + media );
		}
		
		sc.close();
	}
}
