import java.util.*;

public class Exerc13 {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner (System.in);
		
		double temp, far;
		
		System.out.println("Digite a temperatura: ");
		temp = Entrada.nextDouble();
		
		far = (9 * temp + 160) / 6;
		
		System.out.println("A conversão foi: " + far);
		
		Entrada.close();
	}
}
