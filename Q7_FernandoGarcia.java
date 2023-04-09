import java.io.BufferedReader;
import java.io.FileReader;

public class Q7_FernandoGarcia {
    public static void main(String[] args) throws Exception {
        String arq = "C:\\Users\\Misael\\Documents\\ESTUDOS\\num.txt";
        int soma = calcularSomaNumerosArquivo(arq);
        System.out.println("total: " + soma);
    }

    public static int calcularSomaNumerosArquivo(String arq) throws Exception {
        int soma = 0;
        BufferedReader br = new BufferedReader(new FileReader(arq));
        String linha;
        while ((linha = br.readLine()) != null) {
            int numero = Integer.parseInt(linha);
            soma += numero;
        }
        br.close();
        return soma;
    }
}
