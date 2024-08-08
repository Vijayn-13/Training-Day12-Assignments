import java.sql.SQLOutput;
import java.util.*;
import java.nio.file.*;
public class DeleteFile {
    public static void main(String[] args){
        try{
            Path path=Path.of("C:\\Users\\vijay.n\\Downloads\\CopyOfCollectionOfLines.txt");
            Files.delete(path);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
