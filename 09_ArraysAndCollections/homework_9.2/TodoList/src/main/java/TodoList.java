import java.util.ArrayList;

public class TodoList {
    private final ArrayList<String> list = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        list.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index < list.size() && index >= 0) {
            list.add(index, todo);

        } else {
            list.add(todo);
        }
    }

    public String edit(String todo, int index) {
        String editIndex = null;
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index < list.size() && index >= 0) {
            editIndex = list.set(index, todo);
        }
        return editIndex;
    }

    public String delete(int index) {
        String deletedIndex = null;
        if (index < list.size() && index >= 0) {
            deletedIndex = list.remove(index);
        }
        return deletedIndex;
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел

        return new ArrayList<>(list);
    }
}
