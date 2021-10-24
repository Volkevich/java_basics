import java.util.*;
import java.util.stream.Collectors;

public class EmailList {
    private final TreeSet<String> list = new TreeSet<>();
    public static final String regex = "[a-zA-Z]+@[a-zA-Z.]+\\.[a-z]{2,3}";


    public boolean add(String email) {
        if (email.matches(regex)) {
            list.add(email.toLowerCase(Locale.ROOT));
            return true;
        }else {
            return false;
        }
        // TODO: валидный формат email добавляется
    }



    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке

        return new ArrayList<>(list);
    }

}