import java.util.Scanner;

public class Exercicio7 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado A do triangulo");
		int ladoA = scanner.nextInt();
		System.out.println("Digite o valor do lado B do triangulo");
		int ladoB = scanner.nextInt();
		System.out.println("Digite o valor do lado C do triangulo");
		int ladoC = scanner.nextInt();
		boolean triangulo = (ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoA + ladoC > ladoB);
		
		

		if ((ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoA + ladoC > ladoB))
		{System.out.println("Voc� criou o triangulo");} else {
	
			System.out.println("O triangulo n�o pode ser criado");	
			System.exit(0);
			
		}
		if (ladoA == ladoB && ladoA == ladoC) {
			System.out.println("Voc� criou um triangulo equil�tero");
		}else if (ladoA == ladoB ^ ladoA == ladoC){System.out.println("Voc� criou um triangulo is�celes");
			
		}else if (ladoA != ladoB && ladoB != ladoC){
			System.out.println("Voc� criou um triangulo Escaleno");
				
		}else {}
		
		
}
}




