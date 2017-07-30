package ObjectToFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by rafael on 29/07/17!
 */
public class TestMain {
    public static void main(String[] args) {

        String filePath = "/home/rafael/IdeaProjects/FirstSample/src/ObjectToFile/input.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            boolean desejaContinuar = true;
            ArrayList<Padaria> listaProdutos = new ArrayList<>();
            Scanner in = new Scanner(System.in);

            //int contador = 0;

            while (desejaContinuar) {
                System.out.print("Nome produto: ");
                //String nomeProduto = in.next();
                String nomeProduto = in.nextLine(); // erro nesse nextLine()

                System.out.print("Preço produto: ");
                int precoProduto = in.nextInt();

                Padaria produtoCadastrado = new Padaria(nomeProduto, precoProduto);

                // adiciona o produto ao arraylist
                listaProdutos.add(produtoCadastrado);

                System.out.print("Deseja continuar?(S/N) > ");
                String resposta = in.next();
                // necessário porque in.next() só lê o número e não o fim da linha
                in.nextLine();

                if (resposta.equalsIgnoreCase("n")) {
                    desejaContinuar = false;
                }
            }

            for (Padaria s : listaProdutos) {
                bw.write(s.toString());
                bw.write("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
