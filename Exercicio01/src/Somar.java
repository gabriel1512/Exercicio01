import java.util.Scanner;

class Somar {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		//Declaração de variáveis
		int num1, num2, soma;
		
		//ler primeira variavel
		System.out.println("Digite o primeiro npumero:");
		num1 = sc.nextInt();
		
		//ler segunda variavel
		System.out.println("Digite o segundo npumero:");
		num2 = sc.nextInt();
		
		//Somar
		soma = num1 + num2;
		
		//Mostrar na tela
		System.out.println("Soma: " + soma);
	}
}
