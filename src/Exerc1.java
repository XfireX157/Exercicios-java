import java.util.*;

public class Exerc1 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int prato = 0, bebida = 0, sobremesa = 0, caloria = 0;
		 
		System.out.println("1. vegetariano");
		System.out.println("2. peixe");
		System.out.println("3. frango");
		System.out.println("4. carne");
		int caloriaPrato = sc.nextInt();
		
		System.out.println("1. abacaxi");
		System.out.println("2. sorvete");
		System.out.println("3. mouse");
		System.out.println("4. mouse chocolate");
		int caloriaSobremesa = sc.nextInt();
		
		System.out.println("1. cha");
		System.out.println("2. suco de laranja");
		System.out.println("3. suco de melao");
		System.out.println("4. refrigerante");
		int caloriaBebida = sc.nextInt();
		
		switch (caloriaPrato) {
			case 1 -> prato = 180;
			case 2 -> prato = 230;
			case 3 -> prato = 250;
			case 4 -> prato = 350;
		}
		switch (caloriaSobremesa) {
			case 1 -> sobremesa = 75;
			case 2 -> sobremesa = 110;
			case 3 -> sobremesa = 170;
			case 4 -> sobremesa = 200;
		}
		switch (caloriaBebida) {
			case 1 -> bebida = 20;
			case 2 -> bebida = 70;
			case 3 -> bebida = 100;
			case 4 -> bebida = 65;
		}
		
		caloria = prato + sobremesa + bebida; 
		System.out.println("A caloria foi: " + caloria);
		
		sc.close();
	}

}
