import java.util.*;
import java.nio.file.*;
public class CopyFile {
    public static void main(String[] args){
        try{
            Path source_path=Path.of("C:\\Users\\vijay.n\\Downloads\\CollectionOfLines.txt");
            Path target_path=Path.of("C:\\Users\\vijay.n\\Downloads\\Training\\Day12\\CopyOfCollectionOfLines.txt");
            Files.copy(source_path,target_path,StandardCopyOption.REPLACE_EXISTING);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
