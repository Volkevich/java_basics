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
            list.set(index,todo);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index < list.size()&&index >= 0){
            list.remove(index);
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел

            return new ArrayList<>(list);
        }
    }
