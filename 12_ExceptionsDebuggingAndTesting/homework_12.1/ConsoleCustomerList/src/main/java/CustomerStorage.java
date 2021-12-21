import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws CustomerAddException {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;
        String regexMail = "[A-Za-z]+@[a-z]+.[a-z]+";
        String regexPhone = "[\\+][0-9]{11}";

        String[] components = data.split("\\s+");

        if (components.length != 4) {
            throw new CustomerAddException("Wrong Format length!!!");
        }
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];

        if (!components[INDEX_PHONE].matches(regexPhone)) {
            throw new CustomerAddException("WRONG format PHONE!!!!");
        }
        if (!components[INDEX_EMAIL].matches(regexMail)) {
            throw new CustomerAddException("WRONG format EMAIL!!!");
        }
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) throws RemoveCustomerException {
        try {
            if (storage.get(name).getName().equals(name)) {
                storage.remove(name);
            }
        }
        catch (NullPointerException exception){
            throw new RemoveCustomerException("Пользователя с таким именем не найдено!");
        }

    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}