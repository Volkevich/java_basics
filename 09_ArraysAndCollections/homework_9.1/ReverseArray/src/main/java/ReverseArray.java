import net.sf.saxon.expr.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse(String[] strings) {
        Arrays.sort(strings, Comparator.reverseOrder());
        return strings;
    }

}
