package exercicio001;
import java.util.Scanner;

public class ManipulacaoDeNumerosMatriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/**
		 * DECLARANDO A MATRIZ
		 */
		int matriz[][] = new int[3][3];
		
		
		/**
		 * POPULANDO A MATRIZ DE 3 X 3 COM VERIFICAÇÃO (IMPAR E DE 3 A 11)
		 */
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("Valor: ");
				matriz[i][j]=entrada.nextInt();
				
				/**
				 * VALIDAÇÃO
				 */
				
				while (matriz[i][j]%2==0 || matriz[i][j]<3 || matriz[i][j]>11) {
					System.out.print("ERRO!! Digite novamente o valor: ");
					matriz[i][j]=entrada.nextInt();
				}
				
			}
		}
		
		/**
		 * SOMA, MEDIA, MAIOR, MENOR, CONTADOR DE PARES E IMPARES, 
		 * SOMA DA DIAGONAL PRINCIPAL E SECUNDARIA
		 */
		int soma=0, maior=0, menor=0, par=0, impar=0, diagonal1=0, diagonal2=0;
		float media=0;
		System.out.println(" ");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				
				// SOMA
				soma = soma + matriz[i][j];
				
				// MEDIA
				if (i==2) {
					media = soma/9;
				}
				
				// MAIOR
				if (maior==0) {
					maior=matriz[i][j];
				} else if (maior<matriz[i][j]) {
					maior=matriz[i][j];
				}
				
				// MENOR
				if (menor==0) {
					menor=matriz[i][j];
				} else if (menor>matriz[i][j]) {
					menor=matriz[i][j];
				}
				
				//CONTADOR DE PARES E IMPARES
				if (matriz[i][j]%2==0) {
					par++;
				} else
					impar++;
				
				// SOMA DIAGONAL PRINCIPAL ou seja, i==j
				if (i==j) {
					diagonal1=diagonal1+matriz[i][j];
				}
				
				// SOMA DIAGONAL SECUNDARIA ou seja i+j=n-1 sendo n o tamanho da matriz
				if (i+j==2) {
					diagonal2=diagonal1+matriz[i][j];
				}
			}
		}
		
		/**
		 * RELATORIO
		 */
		System.out.println("RELATORIO");
		System.out.println("Soma : "+ soma);
		System.out.printf("Media : %.2f ", media);
		System.out.println("\nMaior : "+ maior);
		System.out.println("Menor : "+ menor);
		System.out.println("Qtdade Par : "+ par);
		System.out.println("Qtdade Impar : "+ impar);
		System.out.println("Soma diagonal principal : "+ diagonal1);
		System.out.println("Soma diagonal secundaria : "+ diagonal2);
		
		
		/**
		 * IMPRESSÁO DA MATRIZ
		 */
		System.out.println(" ");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (j==2) {
					System.out.println (matriz[i][j]+"\t");
				} else
				System.out.print (matriz[i][j]+"\t");
			}
		}
		
		entrada.close();
		
	}

}
