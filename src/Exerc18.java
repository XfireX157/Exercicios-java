import java.util.*;

public class Exerc18 {
	public static void main(String []args) {
		Scanner Entrada = new Scanner (System.in);
		
		int[] idade = new int[10];
		String[] nome = new String[10]; 
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe o nome: ");
			nome[i] = Entrada.next();			
			System.out.println("Informe as idades: ");
			idade[i] = Entrada.nextInt();
			
		}
		
		for(int i = 0; i < 10; i++) {
			
			if(idade[i] >= 18) {
				System.out.println(nome[i] + " tem " + idade[i] + ", "
						+ "então é maior de idade");
			}else {
				System.out.println(nome[i] + " tem " + idade[i] + ", "
						+ "então é menor de idade");
			}
		}
	}
}
