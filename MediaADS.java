package CalculaMediaArquivo2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Rafael on 27-Jul-17!
 */
public class AdsMedia {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Rafael\\IdeaProjects\\FirstSample\\" +
                "src\\CalculaMediaArquivo2\\input2.txt";

        // try with resources do java 7. Arquivo é fechado automaticamente.
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            double somaTotal = 0;
            int count = 0;

            while ((currentLine = br.readLine()) != null) {
                // convertendo de String para double
                double idadeDoTexto = Double.parseDouble(currentLine.substring(34, 38));
                somaTotal += idadeDoTexto;
                count ++;
            }

            //System.out.println(count);
            System.out.println("A média é: " + somaTotal/count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
