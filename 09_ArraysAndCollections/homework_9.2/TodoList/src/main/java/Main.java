import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private final static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            String s  = scanner.nextLine();
            final Pattern pattern = Pattern.compile("(LIST|ADD|DELETE|EDIT)\\s?(\\d*)\\s?(.*)");
            Matcher matcher = pattern.matcher(s);

            if (!matcher.lookingAt()){
                System.out.println("Введена некорректная команда!");
                break;
            }
            while (matcher.lookingAt()){
                String command = matcher.group(1);
                int index = !matcher.group(2).equals("") ? Integer.parseInt(matcher.group(2)) : -1;
                String text = matcher.group(3);

                if (command.startsWith("ADD")){
                        todoList.add(index,text);
                        System.out.println("Дело \"" + matcher.group(3) + "\" добавлено!");
                        break;
                    }
                if (command.startsWith("EDIT")){
                    todoList.edit(text, (index));
                    break;
                }

                if (command.startsWith("DELETE")) {
                    todoList.delete(index);
                    break;
                }
                if (command.startsWith("LIST")){
                    todoList.getTodos();
                    break;
                }
            }
        }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}
