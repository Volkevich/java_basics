import net.sf.saxon.expr.Component;

import java.util.Arrays;
import java.util.Collection;

public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse (String[] strings){
        String[] copy = Arrays.copyOf(strings,strings.length);
        int index = 0;
        for (int i = copy.length -1; i >=0; i--){
            strings[index] = copy[i];
            index++;
        }


        return strings;
    }

}
