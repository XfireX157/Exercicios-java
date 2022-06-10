import java.util.*;

public class Exerc20 {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner (System.in);
		
		int[] num = new int[4];
		
		for(int i = 0; i < num.length; i++) {
			
			System.out.println("Digite os numeros: ");
			num[i] = Entrada.nextInt();
			
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] >= 8) {
				System.out.println("Esses numeros são maiores que oito " + num[i]);
			}else {
				System.out.println("");
			}
		}
	}
}