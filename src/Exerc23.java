import java.util.*;

public class Exerc23 {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner (System.in);
		
		int[] num = new int[3];
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Digite os n�meros: ");
			num[i] = Entrada.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			
			if(num[i] < 100) {
				System.out.println("Esse numero est� entre zero e cem " + num[i]);
			}
			if(num[i] > 100 && num[i] < 200) {
				System.out.println("Esse n�mero est� entre cem e duzentos " + num[i]);
			}
			if(num[i] >= 200) {
				System.out.println("Esse n�mero � maior que duzentos " + num[i]);
			}
		}
	}
}
