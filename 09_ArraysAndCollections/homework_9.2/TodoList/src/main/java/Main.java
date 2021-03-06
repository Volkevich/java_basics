import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private final static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            final Pattern pattern = Pattern.compile("(LIST|ADD|DELETE|EDIT)\\s?(\\d*)\\s?(.*)");
            Matcher matcher = pattern.matcher(s);
            boolean isInputValid = matcher.lookingAt();

            if (isInputValid) {
                String command = matcher.group(1);
                int index = !matcher.group(2).equals("") ? Integer.parseInt(matcher.group(2)) : -1;
                String text = matcher.group(3);

                if (command.equals("ADD")) {
                    todoList.add(index, text);
                    System.out.println("Дело \"" + text + "\" добавлено!");
                }
                if (command.equals("EDIT")) {
                    String editIndex = todoList.edit(text, (index));
                    if (Objects.nonNull(editIndex)) {
                        System.out.println("Дело \"" + editIndex + "\" заменено на \"" + text + "\"");
                    } else {
                        System.out.println("Дело с таким номером не существует");
                    }
                }

                if (command.equals("DELETE")) {
                    String deletedIndex = todoList.delete(index);
                    if (Objects.nonNull(deletedIndex)) {
                        System.out.println("Дело \"" + deletedIndex + "\" удалено!");
                    } else {
                        System.out.println("Дело с таким номером не существует");
                    }
                }
                if (command.equals("LIST")) {
                    ArrayList<String> todos = todoList.getTodos();
                    for (int i = 0; i < todos.size(); i++) {
                        String print = todos.get(i);
                        System.out.println(i + " - " + print);
                    }
                }
            } else {
                System.out.println("Введена некорректная команда!");
            }
        }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}
