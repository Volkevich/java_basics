import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь до папки: ");
        String folder = scanner.nextLine();
        try {
            long sizeFolder = FileUtils.calculateFolderSize(folder);
            final double mB = 1024*1024;
            final double gB = 1e+9;
            final double kB = 1024;
            if (sizeFolder > kB && sizeFolder < mB){
                final double sizekB = sizeFolder / kB;
                System.out.printf("Размер папки: " + folder + " %.2f KB %n", sizekB);
            }
            if (sizeFolder > mB && sizeFolder < gB) {
                final double sizeMb = sizeFolder / mB;
                System.out.printf("Размер папки: " + folder + " %.2f MB %n", sizeMb);
            }
            if (sizeFolder > gB && sizeFolder > mB) {
                final double sizeGb = sizeFolder / 1e+9;
                System.out.printf("Размер папки: " + folder + "  %.1f GB %n", sizeGb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
