import java.util.Scanner;

public class TabelaVerdade {
	static String expr="";
	public static void main(String[] args) {
		boolean a, b;
		System.out.println("Bem vindo à calculadora Lógica ");
		menu();

	}

//UI	
	public static void menu() {
		String op;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Opções:");
		System.out.println("1: A   1ºVariável");
		System.out.println("2: B   2ºVariável");
		System.out.println("3: (   Abrir parênteses");
		System.out.println("4: )   Fechar parênteses");
		System.out.println("5: ~   Negação");
		System.out.println("6: ^   Conjunção");
		System.out.println("7: v   Disjunção");
		System.out.println("8: ->  Implicação");
		System.out.println("9: <-> Equivalência");
		System.out.println("0: Calcular");
		System.out.println("q: Sair");
		System.out.println("Qual opção pretende: \n");
		do {
			op = scanner.nextLine().toLowerCase();
			escreverExpressao(op);
		} while (op != "0");
		scanner.close();

	}

	public static void escreverExpressao(String op) {
	
		switch (op) {
		case ("1"): {
			expr=expr+"A";
			System.out.println(expr);
			break;
		}
		case ("2"): {
			expr=expr+"B";
			System.out.println(expr);
			break;
		}
		case ("3"): {
			expr=expr+"(";
			System.out.println(expr);
			break;
		}
		case ("4"): {
			expr=expr+")";
			System.out.println(expr);
			break;
		}
		case ("5"): {
			expr=expr+"~";
			System.out.println(expr);
			break;
		}
		case ("6"): {
			expr=expr+"^";
			System.out.println(expr);
			break;
		}
		case ("7"): {
			expr=expr+"v";
			System.out.println(expr);
			break;
		}
		case ("8"): {
			expr=expr+"->";
			System.out.println(expr);
			break;
		}
		case ("9"): {
			expr=expr+"<->";
			System.out.println(expr);
			break;
		}
		case ("0"): {
			calcular();
			System.out.println("Calculando...");
			break;
		}
		case ("q"): {
			System.out.println("Adeus ;)");
			break;
		}
		default: {
			System.out.println("Opção incorreta");
			break;
		}
		}

	}

	public static boolean[][] calcular() {
		boolean result[][] = { {true, true}, {false, false} , {true, false}, {false, true}};
		return  result;
	}
	
//Operações
	public boolean negacao(boolean a) {
		if (a == false) {
			a = true;
		} else {
			a = false;
		}

		return a;
	}
}
