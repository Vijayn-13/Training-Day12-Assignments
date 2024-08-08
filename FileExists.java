import java.util.*;
import java.nio.file.*;
public class FileExists {
    public static void main(String[] args){
        try{
            Path path=Path.of("C:\\Users\\vijay.n\\Downloads\\CopyCollectionOfLines.txt");
            if(Files.exists(path)){
                System.out.println("File exists");
            }
            else{
                System.out.println("File not exists");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
