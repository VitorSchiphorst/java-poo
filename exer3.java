package praticas;

public class exer3 {

	public static void main(String[] args) {
	}
	
	public Double calculaAbastecimento(Double qtdLitros, Double preLitros) {
		if (qtdLitros == null) {
			System.out.println("Error");
		}
		return qtdLitros * preLitros;
		
	}
}