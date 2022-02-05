import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите абсолютный путь к папке которую хотите скопировать: ");
        String sourceDir = scanner.nextLine();
        System.out.println("Введите абсолютный путь куда хотите скопировать папку: ");
        String sourceDirOut = scanner.nextLine();
        FileUtils.copyFolder(sourceDir,sourceDirOut);
    }
}
