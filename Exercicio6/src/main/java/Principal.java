import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Principal {

	public static void main(String[] args) throws Exception {
		
        String xml = "<exemplo><nome>Henrique Nicolli</nome><idade>20</idade></exemplo>";

        
        XmlMapper xmlMapper = new XmlMapper();
        objetoExemplo objetoExemplo = xmlMapper.readValue(xml, objetoExemplo.class);

        
        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        String json = objectMapper.writeValueAsString(objetoExemplo);

        
        System.out.println(json);
    }
    public static class objetoExemplo {
        public String nome;
        public int idade;
    }
}


