import java.util.Arrays;

public class TwoDimensionalArray {

    public static char symbol = 'X';


    public static char[][] getTwoDimensionalArray(int size) {
        char[][]ris = new char[size][size];
        for (int i = 0; i < size;i++){
            for (int j = 0; j < size;j++){
                if ((i == 0 && j == 0) || (i == 0 && j == (size-1))||(i == size-1 && j == 0)||((i == (size-1)) && j == (size-1)) ||
                        ((i==((size-1)/2) && j == ((size-1)/2)))) {
                    ris[i][j] = symbol;
                }
                else
                    ris[i][j] = ' ';
                System.out.print(ris[i][j]);

            }
            System.out.println();

        }
        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        return ris;
    }
}
