import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] input = line.split(" ");
        ReverseArray.reverse(input);
        System.out.print(Arrays.toString(input));


    }
    }
