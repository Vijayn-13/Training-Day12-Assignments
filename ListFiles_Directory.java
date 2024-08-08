import java.io.RandomAccessFile;
import java.util.*;
import java.nio.file.*;
import java.util.stream.Stream;

public class ListFiles_Directory {
    public static void main(String[] args){
        try {
            Path path = Path.of("C:\\Users\\vijay.n\\Downloads\\Training");
            Stream str=Files.list(path);
            str.forEach(System.out::println);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
