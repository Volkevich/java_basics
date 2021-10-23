import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private final static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            String s  = scanner.nextLine();

            final Pattern pattern = Pattern.compile("(LIST|ADD|DELETE|EDIT)\\s(\\d*)\\s?(.*)");
            Matcher matcher = pattern.matcher(s);
            if (!matcher.lookingAt()){
                System.out.println("Введена некорректная команда!");
                break;
            }
            while (matcher.lookingAt()){
                String command = matcher.group(1);
                int index = !matcher.group(2).equals("") ? Integer.parseInt(matcher.group(2)) : -1;
                String text = matcher.group(3);
                if (command.equals("ADD")){
                    if (index > 0){
                        todoList.add(index,text);
                        System.out.println("Дело \"" + matcher.group(3) + "\" добавлено!");
                        break;
                    }else {
                        todoList.add(matcher.group(3));
                        System.out.println("Дело \"" + matcher.group(3) + "\" добавлено!");
                        break;
                    }

                }
                else if (matcher.group(1).equals("EDIT")){
                        todoList.edit(text, (index));
                    break;
                }

                else if (matcher.group(1).equals("DELETE")) {
                        todoList.delete(index);
                        break;
                }
                else if (matcher.group(1).equals("LIST")){
                    todoList.getTodos();
                    break;
                }
            }
        }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}