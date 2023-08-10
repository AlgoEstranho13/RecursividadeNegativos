package controller;

public class NegativosControle {

	public static int Cont(int[] vetor, int N) {
		
		/*Condi��o de parada-> Quando N � menor que 1, pois se N representa o tamanho do vetor e ele � 0,
		temos certeza de que h� 0 n�meros negativos*/
		if (N<1)
		{
			return 0;
		}
		else
		{
			int ultimo = vetor[N-1], cont;
			//A fun��o � chamada pela vari�vel cont, contador que armazena quantidade de valores negativos no vetor, com o tamanho do vetor N subtraindo 1 a cada chamada
			cont = Cont(vetor, (N-1));
			if (ultimo<0)
			{
				cont++;
			}
			return cont;
		}
	}
	
}
