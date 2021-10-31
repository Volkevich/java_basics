import java.util.*;

public class PhoneBook {

    private final String REGEX_NAME = "[а-яА-ЯеЁ]+";
    private final String REGEX_PHONE = "[\\d]{11}";
    private final String ERROR = "Неверный формат";
    Scanner scanner = new Scanner(System.in);

    Map<String, String> mapPhoneBook = new TreeMap<>();
    Set<String> setPhoneBook = new TreeSet<>();


    public void addContact(String phone, String name) {
        if (phone.matches(REGEX_PHONE) && name.matches(REGEX_NAME)) {
            if (mapPhoneBook.containsKey(phone)) {
                System.out.println("Такой номер уже есть в списке");
                System.out.println("Укажите новое имя для абонента " + phone);
                String newName = scanner.nextLine();
                mapPhoneBook.replace(phone, mapPhoneBook.get(phone), newName);
                System.out.println("Номер перезаписан");
            } else {
                mapPhoneBook.put(phone, name);
            }
        }else {
            System.out.println(ERROR);
            return;
        }
    }

    // проверьте корректность формата имени и телефона (отдельные методы для проверки)
    // если такой номер уже есть в списке, то перезаписать имя абонента


    public String getContactByPhone(String phone) {
        if (mapPhoneBook.containsKey(phone)) {
            return mapPhoneBook.get(phone) + " - " + phone;
        } else {
            return "";
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
    }


    public Set<String> getContactByName(String name) {
        String namePhone = "";
        if (mapPhoneBook.containsValue(name)) {
            namePhone = namePhone.concat(name) + " - ";
            for (String tel : mapPhoneBook.keySet()) {
                if (mapPhoneBook.get(tel).equals(name)) {
                    namePhone = namePhone.concat(tel) + ", ";
                }
            }

            setPhoneBook.add(namePhone.substring(0, namePhone.length() - 2));
            return setPhoneBook;
        }else {
            return new TreeSet<>();
        }
    }

    public Set<String> getAllContacts() {
        for (String key : mapPhoneBook.keySet()){
            setPhoneBook.add(mapPhoneBook.get(key) + " - " + key);
        }
        if (!setPhoneBook.isEmpty()){
            return setPhoneBook;
        }else {
            return new TreeSet<>();
        }
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