import java.util.Arrays;

public class TwoDimensionalArray {

    public static char symbol = 'X';
    public static char symbol2 = ' ';

    public static char[][] getTwoDimensionalArray(int size) {
        char[][]ris = new char[size][size];
        for (int i = 0; i < size;i++){
            ris[i][i] = symbol;
            for (int j = 0; j < ris.length;j++){
                ris[i][i] = symbol2;
            }
            System.out.println(Arrays.toString(ris[i]));
        }
        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        return ris;
    }
}
