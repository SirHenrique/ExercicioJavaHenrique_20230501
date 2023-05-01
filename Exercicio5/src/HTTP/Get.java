package HTTP;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Get {
	public static void main(String[] args) {
		  HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create("http://mockbin.org/bin/14df27ac-12bc-45b9-bd0c-93cb3b81fdfd"))
	                .GET()
	                .build();

	        try {
	            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
	            System.out.println(response.body());
	        } catch (Exception e) {
	            System.out.println("Erro ao realizar requisição: " + e.getMessage());
	        }
	}
	
}
