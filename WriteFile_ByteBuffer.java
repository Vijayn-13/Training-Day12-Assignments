import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.nio.*;
public class WriteFile_ByteBuffer {
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter data: ");
            String str=sc.nextLine();
            RandomAccessFile file=new RandomAccessFile("C:\\Users\\vijay.n\\Downloads\\WriteFileByteBuffer.txt","rw");
            FileChannel channel=file.getChannel();
            ByteBuffer buffer=ByteBuffer.wrap(str.getBytes(StandardCharsets.UTF_8));
            channel.write(buffer);
            buffer.clear();
            channel.close();
            file.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
