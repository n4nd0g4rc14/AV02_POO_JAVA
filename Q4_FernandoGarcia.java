import java.util.Scanner;

public class Q4_FernandoGarcia {
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        	String str = sc.nextLine();
        
        	String[] tokens = str.split(" ");
        
        System.out.println("Tokens que começam com 's':");
        	for (String token : tokens) {
            if (token.startsWith("s") || token.startsWith("S")) {
                System.out.println(token);
            }
        }
        
        sc.close();
    }
}
