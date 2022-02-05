import java.io.*;
import java.nio.file.*;
import java.util.Objects;


public class FileUtils {
    public static void copyFolder(String sourceDirectory, String destinationDirectory) throws IOException {
        File fileSource = Paths.get(sourceDirectory).toFile();
        File fileDir = Paths.get(destinationDirectory).toFile();

        if (fileSource.isDirectory()) {
            copyDirect(fileSource,fileDir);
        }else {
            Files.copy(Path.of(sourceDirectory),Path.of(destinationDirectory));
        }

    }
    private static void copyDirect(File sourceDir, File targetDir) throws IOException{
        if (!targetDir.exists()){
            Files.createDirectories(targetDir.toPath());
        }

        for (String s : Objects.requireNonNull(sourceDir.list())){
            File file = new File(sourceDir,s);
            File file1 = new File(targetDir,s);
            copyFolder(file.getAbsolutePath(),file1.getAbsolutePath());
        }
    }
}
