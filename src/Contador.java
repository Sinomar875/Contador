import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws Exception {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		System.out.println("A diferença dos Parametros é de: " + (parametroDois - parametroUm));
		
		try {
			contar(parametroUm, parametroDois);
		} catch (InputMismatchException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois) throws Exception {
		if (parametroUm > parametroDois) {
			System.out.println("O primeiro par\u00E2metro deve ser menor que o segundo");
		}
		int contagem = parametroDois - parametroUm;
		for (int i = 0; i <= contagem; i++) {
			System.out.println(parametroUm + i);
		}

	}
	
}