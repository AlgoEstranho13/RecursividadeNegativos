package view;
import controller.NegativosControle;

public class Principal {

	public static void main(String arqs[]) {
		NegativosControle NC = new NegativosControle();
		int[] vetor = {2, 3, -4, 5, -1};
		int N = vetor.length;
		
		System.out.println("O n�mero de valores negativos no vetor �: "+NC.Cont(vetor, N));
	}
}
