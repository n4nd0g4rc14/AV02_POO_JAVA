import java.util.Scanner;

public class Q1_FernandoGarcia {
	  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	        
	  System.out.print("Digite um número: ");
	        int n1 = sc.nextInt();
	        
	  System.out.print("Digite um número: ");
	        int n2 = sc.nextInt();
	        
	        int total = n1 + n2;
	        
	  System.out.println("A soma entre " + n1 + " e " + n2 + " é " + total + ".");
	        
	  sc.close();
	  }
}