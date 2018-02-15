import java.io.*;

public class ByteArrayInputStream1
{
    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        String str = "Shashank J CSE SVIT";

        /* Converting the string to byte Array */
        byte[] bArray = str.getBytes();

        ByteArrayInputStream bin = new ByteArrayInputStream(bArray);

        for (int k = 0; k < bArray.length; k++)
        {
            int data;
            data = bin.read();
            System.out.print((char) data);

        }
        System.err.println();

    }
}