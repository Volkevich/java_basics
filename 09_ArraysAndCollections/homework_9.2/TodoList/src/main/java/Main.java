import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            String s  = scanner.nextLine();

            final Pattern pattern = Pattern.compile("(LIST|ADD|DELETE|EDIT)\\s?(\\d*)\\s?(.*)");
            Matcher matcher = pattern.matcher(s);
            while (matcher.matches()){
                if (matcher.group(1).equals("ADD")){
                    if (!matcher.group(2).equals("")&&Character.isDigit(Integer.parseInt(matcher.group(2)))){
                        todoList.add(Integer.parseInt(matcher.group(2)),matcher.group(3));
                        break;
                    }else {
                        todoList.add(matcher.group(3));
                        break;
                    }

                }
                else if (matcher.group(1).equals("EDIT")){
                    todoList.edit(matcher.group(3),(Integer.parseInt(matcher.group(2))));
                    break;
                }
                else if (matcher.group(1).equals("DELETE")){
                    todoList.delete((Integer.parseInt(matcher.group(2))));
                    break;
                }
                else if (matcher.group(1).equals("LIST")){
                    System.out.println(todoList.getTodos());
                    break;
                }
            }
        }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}