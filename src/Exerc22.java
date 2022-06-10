import java.util.*;

public class Exerc22 {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner (System.in);
		
		int[] num = new int[20];
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Digite os números: ");
			num[i] = Entrada.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] >= 0 && num[i] <= 100) {
				System.out.println(num[i]);
			}else {
				System.out.println("");
			}
		}
	}
}
