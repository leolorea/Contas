import java.util.Scanner;

public class Exercicio3 {
	public static void main (String [] args) {
		
		System.out.println("Digite a vari�vel a: ");
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		System.out.println("Digite a vari�vel a: ");
		
		
		int b = scanner.nextInt();
		
		System.out.println((a = a + b));
		
		System.out.println(" Vari�vel b : " + (b = a - b));	
		System.out.println("Vari�vel a : " + (a = a -b));
		
		scanner.close();
	
		
		
		
				
	}

}
