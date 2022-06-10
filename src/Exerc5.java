import java.util.*;

public class Exerc5 {
	public static void main(String []args) {
		Scanner Entrada = new Scanner (System.in);
		int Idade;
		
		System.out.println("Digite sua idade para ver se voc  tem direito a voto: ");
		Idade = Entrada.nextInt();
		
		if(Idade < 16) {
			System.out.println("N„o eleitor");
		}else if(Idade >= 18 && Idade <= 65) {
			System.out.println("Eleitor obrigatÛrio");
		}else{
			System.out.println("Eleitor facultativo");
		}
	}
}
