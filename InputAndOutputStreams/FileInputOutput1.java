import java.io.*;

public class FileInputOutput1
{
    public static void main (String[] args) throws IOException , FileNotFoundException {
        InputStream instream = new FileInputStream ("FileInputOutput1.java");

        int size = instream.available ();
        System.out.println ("Size = " + size);
        System.out.println ("Skip 15 characters and then read ");
        instream.skip (30);

        for (int i = 0; i <= 25; i++) {
            System.out.print ((char) instream.read());
        }       

        System.out.println ();
        /* Finally closing the stream */
        instream.close();
    }
}