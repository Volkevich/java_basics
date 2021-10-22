import java.util.*;
import java.util.stream.Collectors;

public class EmailList {
    public final TreeSet<String> list = new TreeSet<>();
    public static final String addEmail = "[a-zA-Z]+@[a-zA-Z.]+\\.[a-z]{2,3}";


    public void add(String email) {
        if (email.matches(addEmail)) {
            list.add(email.toLowerCase(Locale.ROOT));
            return;
        }
        // TODO: валидный формат email добавляется
    }



    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        List<String> strings = new ArrayList<>(list);
        Collections.sort(strings);
        for (String s: list){
            System.out.println(s);
        }
        return strings;
    }

}