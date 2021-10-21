import org.apache.commons.collections.list.TreeList;

import java.util.*;

public class EmailList {
    public final TreeSet<String>list = new TreeSet<>();
    public static final String addEmail = "[A-Za-z]+[@][A-Za-z]+\\.[a-z]+";


    public void add(String email) {
        if (email.matches(addEmail)){
            list.add(email.toLowerCase(Locale.ROOT));
        };

        // TODO: валидный формат email добавляется
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке

        return new ArrayList<>(list);
    }

}
