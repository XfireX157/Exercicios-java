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
			System.out.println("O maior valor é: " + A + " O segundo valor é: " + B + " O terceiro Valor é: " + C);
		}else if(A > C && C > B){
			System.out.println("O Maior valor é: " + A + " O segundo valor é: " + C + " O Terceiro Valor é: " + B);
		}else if(B > A && A > C){
			System.out.println("O Maior valor é: " + B + " O segundo valor é: " + A + " O Terceiro Valor é: " + C);
		}else if(B > C && C > A){
			System.out.println("O Maior valor é: " + B + " O segundo valor é: " + C + " O Terceiro Valor é: " + A);
		}else if(C > A && A > B){
			System.out.println("O Maior valor é: " + C + " O segundo valor é: " + A + " O Terceiro Valor é: " + B);
		}else {
			System.out.println("O Maior valor é: " + C + " O segundo valor é: " + B + " O Terceiro Valor é: " + A);
		}
	}
}
