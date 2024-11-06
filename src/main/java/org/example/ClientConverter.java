import com.fasterxml.jackson.databind.ObjectMapper;

public class ClientConverter {
    public static String toJson(Client client) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(client);
    }

    public static Client fromJson(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Client.class);
    }
}