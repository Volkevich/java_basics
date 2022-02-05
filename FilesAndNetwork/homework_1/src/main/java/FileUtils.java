import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;

public class FileUtils extends SimpleFileVisitor<Path> {
    public static long calculateFolderSize(String path) throws IOException {
        Path folder = Paths.get(path);
        final long allSize = Files.walk(folder).map(Path::toFile).filter(File::isFile).mapToLong(File::length).sum();
        return allSize;
    }
}
