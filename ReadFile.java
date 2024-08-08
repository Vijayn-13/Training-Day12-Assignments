import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
public class ReadFile{
    public static void main(String[] args){
        try {
            Path path = Path.of("C:\\Users\\vijay.n\\Downloads\\input.txt");
            Stream<String> str=Files.lines(path);
            List<String> ls=str.flatMap(l->Arrays.stream(l.split("\n"))).collect(Collectors.toList());
            ls.forEach(System.out::println);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}