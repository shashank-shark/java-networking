import java.io.*;

public class FileOutputStream1
{
    public static void main (String[] args) throws IOException, FileNotFoundException
    {
        String str = "Java is the most secure programming language";

        /* Converting string to bytes pattern */
        byte[] bArray = str.getBytes();

        /* First connecting the file to the program through FileOutputStream */
        OutputStream output = new FileOutputStream("myfile");

        for (int k = 0; k < bArray.length; k++)
        {
            output.write (bArray[k]);
        }

        /* Closing the stream after the operation to release the locked resources */
        output.close();

        /* reading the data from the file and printing it on the screen */
        InputStream input = new FileInputStream ("myfile");
        for (int k = 0; k <= bArray.length; k++)
        {
            System.out.print ((char) input.read());
        }

        System.out.println();
    }
}