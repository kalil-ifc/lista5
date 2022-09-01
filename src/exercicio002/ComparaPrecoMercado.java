package exercicio002;
import java.util.Random;
//import java.util.Scanner;

public class ComparaPrecoMercado {

	public static void main(String[] args) {
		
		/**
		 * DECLARAÇÃO DA MATRIZ
		 */
		float mercado[][] = new float[5][5];
		
		/**
		 * POPULANDO A MATRIZ COM PREÇOS ALEATÓRIOS
		 */
		
		Random aleatorio = new Random();
		//Scanner entrada = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				mercado[i][j] = aleatorio.nextFloat()*10;
				//mercado[i][j] = entrada.nextFloat();
			}
		}
		
		/**
		 * PREÇO EM CADA MERCADO, MEDIA DE PREÇO POR PRODUTO, 
		 * SOMA POR MERCADO E VALOR MERCADO MAIS BARATO E MAIS CARO
		 */
		System.out.println("----- Preços dos Mercados ----- ");
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				
				// PREÇO EM CADA MERCADO
				if (i==0) {
					if (j==0) {
						System.out.println("\nMercado "+(i+1));
					}
					System.out.println("Produto "+(j+1)+" :"+ mercado[i][j]);
				}
				if (i==1) {
					if (j==0) {
						System.out.println("\nMercado "+(i+1));
					}
					System.out.println("Produto "+(j+1)+" :"+ mercado[i][j]);
				}
				if (i==2) {
					if (j==0) {
						System.out.println("\nMercado "+(i+1));
					}
					System.out.println("Produto "+(j+1)+" :"+ mercado[i][j]);
				}
				if (i==3) {
					if (j==0) {
						System.out.println("\nMercado "+(i+1));
					}
					System.out.println("Produto "+(j+1)+" :"+ mercado[i][j]);
				}
				if (i==4) {
					if (j==0) {
						System.out.println("\nMercado "+(i+1));
					}
					System.out.println("Produto "+(j+1)+" :"+ mercado[i][j]);
				}
				
			}
		}
		// MEDIA POR PRODUTO
		System.out.println("\n----- Media por produto ----- ");
		float media [] = new float[5];
		
		// CALCULANDO
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (j==0) {
					media[j] = media[j]+ mercado[i][j];
				}
				if (j==1) {
					media[j] = media[j]+ mercado[i][j];
				}
				if (j==2) {
					media[j] = media[j]+ mercado[i][j];
				}
				if (j==3) {
					media[j] = media[j]+ mercado[i][j];
				}
				if (j==4) {
					media[j] = media[j]+ mercado[i][j];
				}
			}
		}
		
		// IMPRIMINDO
		for (int i=0; i<5; i++) {
			System.out.println("Media produto "+(i+1)+" = " + (media[i])/5);
		}
		
		// SOMA DE PREÇO POR MERCADO
		System.out.println("\n----- Media por mercaado ----- ");
		
		// CALCULANDO
		float media2[] = new float[5];
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i==0) {
					media2[i] = media2[i]+ mercado[i][j];
				}
				if (i==1) {
					media2[i] = media2[i]+ mercado[i][j];
				}
				if (i==2) {
					media2[i] = media2[i]+ mercado[i][j];
				}
				if (i==3) {
					media2[i] = media2[i]+ mercado[i][j];
				}
				if (i==4) {
					media2[i] = media2[i]+ mercado[i][j];
				}
			}
		}
		
		// IMPRIMINDO
		for (int i=0; i<5; i++) {
			System.out.println("Media mercado "+(i+1)+" = " + (media2[i])/5);
		}
		
		/**
		 * MERCAADO MAIS BARATO E O MAIS CARO
		 */
		float maisBarato=0, maisCaro=0;
		int linha=0, coluna=0;
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (maisBarato==0) {
					maisBarato=mercado[i][j];
					linha=i; coluna=j;
				} else if (maisBarato>mercado[i][j]) {
					maisBarato=mercado[i][j];
					linha=i; coluna=j;
				}
			}
		}
		System.out.println("\n---- Mais Barato ----");
		System.out.println("Mercado "+linha+" com o produto "+coluna);
		System.out.println("-->" +maisBarato);
		
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (maisCaro==0) {
					maisCaro=mercado[i][j];
					linha=i; coluna=j;
				} else if (maisCaro<mercado[i][j]) {
					maisCaro=mercado[i][j];
					linha=i; coluna=j;
				}
			}
		}
		System.out.println("\n---- Mais Caro ----");
		System.out.println("Mercado "+linha+" com o produto "+coluna);
		System.out.println("-->" + maisCaro);
		
		
		
	}

}
