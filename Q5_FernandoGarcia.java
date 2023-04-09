import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q5_FernandoGarcia {
    public static void main(String[] args) {
        String arq = "C:\\Users\\Misael\\Documents\\ESTUDOS\\java test.txt";
        List<String> palavrasComLink = buscarPalavrasComLink(arq);
        System.out.println("Palavras com a subsequencia 'link':");
        for (String palavra : palavrasComLink) {
            System.out.println(palavra);
        }
    }

    public static List<String> buscarPalavrasComLink(String arq) {
        List<String> palavrasComLink = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] palavras = linha.split("\\s+");
                for (String palavra : palavras) {
                    if (palavra.contains("link")) {
                        palavrasComLink.add(palavra);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return palavrasComLink;
    }
}
