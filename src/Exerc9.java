import java.util.*;
public class Exerc9 {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner (System.in);
		
		double salarioMinimo = 1.212;
		double userSalario;
		
		System.out.println("Digite o seu salario: ");
		userSalario = Entrada.nextDouble();
		
		double calculo = userSalario / salarioMinimo;
		
		System.out.printf("Seu salario é: %.0f", calculo);
	}
}
