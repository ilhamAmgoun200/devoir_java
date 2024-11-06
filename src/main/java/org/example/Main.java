public class Main {
    public static void main(String[] args) {
        try {
            Client client = new Client();
            client.setNumClient("123");
            client.setNom("Doe");
            client.setPrenom("John");
            client.setAdresse("123 Rue Exemple");
            client.setPhone("0101010101");
            client.setEmail("john.doe@example.com");

            String clientJson = ClientConverter.toJson(client);
            System.out.println("Client en JSON: " + clientJson);

            Client newClient = ClientConverter.fromJson(clientJson);
            System.out.println("Client reconstruit: " + newClient.getNom());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
