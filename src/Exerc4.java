import java.util.*;

public class Exerc4 {
	public static void main(String []args) {
		
		int A = 0, B = 0, C = 0;
		Scanner Entrada = new Scanner (System.in);
		
		System.out.println("Informe o valor de A: ");
		A = Entrada.nextInt();
		
		System.out.println("Informe o valor de B: ");
		B = Entrada.nextInt();
		
		System.out.println("Informe o valor de C: ");
		C = Entrada.nextInt();
		
		if(A > B && B > C) {
			System.out.println("O maior valor �: " + A + " O segundo valor �: " + B + " O terceiro Valor �: " + C);
		}else if(A > C && C > B){
			System.out.println("O Maior valor �: " + A + " O segundo valor �: " + C + " O Terceiro Valor �: " + B);
		}else if(B > A && A > C){
			System.out.println("O Maior valor �: " + B + " O segundo valor �: " + A + " O Terceiro Valor �: " + C);
		}else if(B > C && C > A){
			System.out.println("O Maior valor �: " + B + " O segundo valor �: " + C + " O Terceiro Valor �: " + A);
		}else if(C > A && A > B){
			System.out.println("O Maior valor �: " + C + " O segundo valor �: " + A + " O Terceiro Valor �: " + B);
		}else {
			System.out.println("O Maior valor �: " + C + " O segundo valor �: " + B + " O Terceiro Valor �: " + A);
		}
	}
}
