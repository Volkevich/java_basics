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
            if (!matcher.matches()){
                System.out.println("Введена некорректная команда!");
            }
            while (matcher.matches()){
                String command = matcher.group(1);
                int index = !matcher.group(2).equals("") ? Integer.parseInt(matcher.group(2)) : -1;
                String text = matcher.group(3);
                boolean m = index <= matcher.groupCount();
                if (command.equals("ADD")){
                    if (index > 0){
                        todoList.add(index,text);
                        System.out.println("Дело добавлено по указанному индексу - " + index);
                        break;
                    }else {
                        todoList.add(matcher.group(3));
                        System.out.println("Дело добавлено");
                        break;
                    }

                }
                else if (matcher.group(1).equals("EDIT")){
                    if (m) {
                        todoList.edit(text, (index));
                        System.out.println("Редактирование дела произошло успешно!");
                    }else {
                        System.out.println("Дела " + index + " не существует, его изменить нельзя!");
                        System.out.println(args.length);
                    }
                    break;
                }

                else if (matcher.group(1).equals("DELETE")) {

                    if (m) {
                        todoList.delete(index);
                        System.out.println("Дело " + index + " удалено успешно!");
                    }else {
                        System.out.println("Дела " + index + " не существует!");
                    }
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