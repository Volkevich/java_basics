import java.util.*;

public class PhoneBook {

    private final String REGEX_NAME = "[а-яА-ЯеЁ]+";
    private final String REGEX_PHONE = "[\\d]{11}";
    private final String ERROR = "Неверный формат ввода";
    private Map<String, TreeSet<String>> mapPhoneBook = new TreeMap<>();
    private Scanner scanner = new Scanner(System.in);


    public void addContact(String phone, String name) {
        if (phone.equals("") || name.equals("") || !phone.matches(REGEX_PHONE) || !name.matches(REGEX_NAME)) {
            System.out.println("");
        } else {
            TreeSet<String> temp = new TreeSet<>();
            if (mapPhoneBook.get(name) != null)
                temp.addAll(mapPhoneBook.get(name));
            temp.add(phone);
            mapPhoneBook.put(name, temp);

        }
    }


    // проверьте корректность формата имени и телефона (отдельные методы для проверки)
    // если такой номер уже есть в списке, то перезаписать имя абонента

    //По номеру
    public void inputName(String number) {
        String name = "";
        while (!name.matches(REGEX_NAME))
            name = scanner.nextLine();
        addContact(number, name);
    }


    //По имени
    public void inputNumber(String name) {
        String phone = scanner.nextLine();
        if (phone.matches(REGEX_PHONE)) {
            for (Map.Entry<String, TreeSet<String>> entry : mapPhoneBook.entrySet()) {
                if (entry.getValue().contains(phone)) {
                    mapPhoneBook.remove(entry.getKey());
                }
            }
            addContact(phone, name);
        } else {
            System.out.println(ERROR);
        }
    }

    //Поиск по всем критериям
    public boolean search(String searchValue) {
        boolean result = false;
        for (Map.Entry<String, TreeSet<String>> entry : mapPhoneBook.entrySet()) {
            if (entry.getValue().contains(searchValue) || entry.getKey().equals(searchValue)) {
                result = true;
            }
        }
        return result;
    }


    // формат одного контакта "Имя - Телефон"
    // если контакт не найдены - вернуть пустую строку
    public String getContactByPhone(String phone) {
        String result = "";
        for (Map.Entry<String, TreeSet<String>> entry : mapPhoneBook.entrySet()) {
            if (entry.getValue().contains(phone)) {
                String key = entry.getKey();
                String value = String.join(",", entry.getValue());
                result = key + " - " + value;
                break;
            }
        }
        return result;
    }


    public void renameNumber(String number) {
        String newName = "";
        while (!newName.matches(REGEX_NAME))
            newName = scanner.nextLine();
        for (Map.Entry<String, TreeSet<String>> entry : mapPhoneBook.entrySet()) {
            if (entry.getValue().contains(number)) {
                mapPhoneBook.remove(entry.getKey());
                break;
            }
        }
        addContact(number, newName);
    }


    // формат одного контакта "Имя - Телефон"
    // если контакт не найдены - вернуть пустую строку
    public Set<String> getContactByName(String name) {
        Set<String> strings = new TreeSet<>();
        for (Map.Entry<String, TreeSet<String>> entry : mapPhoneBook.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println("Такое имя найдено:");
                String key = entry.getKey();
                String value = String.join(",", entry.getValue());
                strings.add(String.join(",", key + " - " + value));
                break;
            }
        }

        return strings;
    }


    public Set<String> getAllContacts() {
        Set<String> setPhoneBook = new TreeSet<>();
        for (Map.Entry<String, TreeSet<String>> entry : mapPhoneBook.entrySet())
            setPhoneBook.add(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        return setPhoneBook;
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */

}