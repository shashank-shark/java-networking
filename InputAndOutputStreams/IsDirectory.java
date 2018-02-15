import java.io.*;
public class IsDirectory {
    public static void main (String[] args) throws IOException {
        String name = "~/final-term";

        /* Creating a file instance */
        File f1 = new File (name);

        System.out.println ("Is it a Directory : " + f1.isDirectory());
        System.out.println ("Isa it a file : " + f1.isFile());
        System.out.println ("Direcotry name : " + f1.getParent());
    }
}