import java.util.ArrayList;

public class TodoList {
    private final ArrayList<String>list = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        list.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index < list.size()&&index >= 0){
            list.add(index,todo);

        }else {
            list.add(todo);
        }
    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index < list.size()&&index >= 0){
            System.out.println("Дело \""+ list.get(index)+"\" заменено на \""+ todo + "\"");
            list.set(index,todo);
        }else {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public void delete(int index) {
        if (index < list.size()&&index >= 0){
            System.out.println("Дело \""+ list.get(index)+"\" удалено!");
            list.remove(index);
        }else {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
            for (int i = 0; i < list.size();i++){
                String text = list.get(i);
                System.out.println(i + " - " + text);
            }
            return list;
        }
    }
