import java.util.Scanner;

public class Q2_FernandoGarcia {
	public static int somarNumeros(int... numeros) { 
        	int soma = 0;
        	for (int numero : numeros) {
            soma += numero;
        }
        	return soma;
    }

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você deseja somar? ");
        	int qt = sc.nextInt();

        	int[] numeros = new int[qt];
        	for (int i = 0; i < qt; i++) {
        System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        	int total = somarNumeros(numeros);
        System.out.println("A soma dos " + qt + " números é igual a: " + total);

        sc.close();
    }
}
