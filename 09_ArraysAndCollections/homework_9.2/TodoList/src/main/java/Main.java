import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            String s  = scanner.nextLine();

            Pattern pattern = Pattern.compile("([A-Z]+)\\s?(\\d*)\\s?(.*)");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()){
                if (matcher.group(1).equals("ADD")){
                    if (!matcher.group(2).equals("")&&Character.isDigit(Integer.parseInt(matcher.group(2)))){
                        todoList.list.add(Integer.parseInt(matcher.group(2)),matcher.group(3));
                    }else {
                        todoList.list.add(matcher.group(3));
                    }

                }
                else if (matcher.group(1).equals("EDIT")){
                    todoList.list.set(Integer.parseInt(matcher.group(3)),matcher.group(2));
                }
                else if (matcher.group(1).equals("DELETE")){
                    todoList.list.remove(Integer.parseInt(matcher.group(2)));
                }
                else if (matcher.group(1).equals("LIST")){
                    System.out.println(todoList.getTodos());
                }
            }
        }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}
