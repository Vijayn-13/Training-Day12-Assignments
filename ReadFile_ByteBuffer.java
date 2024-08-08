import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.StandardCharsets;
public class ReadFile_ByteBuffer{
    public static void main(String[] args){
        try {
            RandomAccessFile file = new RandomAccessFile("C:\\Users\\vijay.n\\Downloads\\input.txt", "r");
            FileChannel channel = file.getChannel();
            ByteBuffer buffer=ByteBuffer.allocate((int)channel.size());
            channel.read(buffer);
            String str=new String(buffer.array(), StandardCharsets.UTF_8);
            System.out.println(str);
            buffer.clear();
            channel.close();
            file.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}