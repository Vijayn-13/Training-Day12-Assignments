import java.nio.file.*;
import java.util.*;
public class WriteFile {
    public static void main(String[] args){
        List<String> ls=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of list: ");
        int n=sc.nextInt();
        String str;
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Enter lines: ");
            str=sc.nextLine();
            ls.add(str);
        }
        try{
            Path path=Path.of("C:\\Users\\vijay.n\\Downloads\\CollectionOfLines.txt");
            Files.write(path,ls,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
