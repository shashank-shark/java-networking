import java.io.*;

public class ByteArrayInputStream2 
{
    public static void main(String[] args) 
    {
        String str = "Hello I am Shashank J";
        
        /* Converting String to bytes */
        byte[] bArray = str.getBytes();

        ByteArrayInputStream bin = new ByteArrayInputStream(bArray,0,20);

        for (int k = 0; k < 20; k++)
        {
            int data;
            data = bin.read();
            System.out.print((char) data);
        }
        System.out.println();
    }
}