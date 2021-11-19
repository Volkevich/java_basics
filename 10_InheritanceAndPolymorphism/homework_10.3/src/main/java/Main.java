public class Main {
    public static void main(String[] args) {
        Client client = new LegalPerson();
        Client client2 = new PhysicalPerson();
        Client client3 = new IndividualBusinessman();
        client.put(1000);
        client2.put(10002);
        client3.put(1011);
        client3.take(122);
        System.out.println(client.getAmount());
        System.out.println(client2.getAmount());
        System.out.println(client3.getAmount());
    }
}
