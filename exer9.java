package praticas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer9 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		// Criando uma Lista
		String[] nums = new String[5];

		// For mais adequado para INSERIR ou ATUALIZAR
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Insirum valor: ");
			nums[i] = leitura.nextLine();
		}

		// Forma mais adequada de EXIBIR elemento: lista
		for (String elemento : nums) {
			System.out.println(elemento);
		}

		System.out.println("Ultimo valor = " + nums[nums.length - 1]);

	}
}