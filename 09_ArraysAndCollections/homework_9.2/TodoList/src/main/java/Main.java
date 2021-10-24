import java.util.ArrayList;
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
            boolean isInputValid = matcher.lookingAt();
            if (!isInputValid){
                System.out.println("Введена некорректная команда!");
                break;
            }
            while (isInputValid){
                String command = matcher.group(1);
                int index = !matcher.group(2).equals("") ? Integer.parseInt(matcher.group(2)) : -1;
                String text = matcher.group(3);

                if (command.equals("ADD")){
                        todoList.add(index,text);
                        System.out.println("Дело \"" + text + "\" добавлено!");
                        break;
                    }
                if (command.equals("EDIT")){
                    todoList.edit(text, (index));
                    break;
                }

                if (command.equals("DELETE")) {
                    todoList.delete(index);
                    break;
                }
                if (command.equals("LIST")){
                    ArrayList<String> todos = todoList.getTodos();
                    for (int i = 0; i < todos.size();i++){
                        String print = todos.get(i);
                        System.out.println(i + " - " + print);
                    }
                    break;
                }
            }
        }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}
