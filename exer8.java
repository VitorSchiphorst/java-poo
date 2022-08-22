package praticas;

import java.util.Scanner;

import com.sun.glass.ui.Size;

class exer8 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		String[] vetor = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Inserir valor: ");
			vetor[i] = leitura.nextLine();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("Ultimo Elemento = ");
		System.out.println(vetor[4]);

	}

}
