import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import esanto.lucas.continumn.models.Titulo;
import esanto.lucas.continumn.models.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComApis {
    public static void main(String[] args) throws IOException, InterruptedException {

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        List lista = new ArrayList<>();
        FileWriter file = new FileWriter("Filmes.txt");

        while (true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome do filme: (ou diga 0 para sair)");
            String nomeURL = scanner.nextLine();
            if(!nomeURL.equals("0")) {

                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://omdbapi.com/?t=" + nomeURL.replace(" ", "+") + "&apikey=4b7db9dd"))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb tOmdb = gson.fromJson(json, TituloOmdb.class);

                try {
                    Titulo title = new Titulo(tOmdb);

                    System.out.println(tOmdb);
                    lista.add(tOmdb);

                    System.out.println(title.getNome());
                    System.out.println(title.getDuracao());
                    System.out.println(title.getGenero());
                    System.out.println(title.getAnoDeLancamento());

                } catch (NumberFormatException e) {
                    System.out.println("! Erro de organização: ");
                    System.out.println(e.getMessage());
                } catch (IllegalArgumentException ie) {
                    System.out.println("! Erro de caractere: ");
                    System.out.println(ie.getMessage());
                } catch (Exception exp) {
                    System.out.println(exp.getMessage());

                }

            } else {
                System.out.println("Saindo...");
                break;
            }
        }
        file.write(gson.toJson(lista));
        file.close();

    }}//
