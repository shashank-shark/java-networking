import java.io.File;
import java.util.Date;

class ClassMethods {
    public static void main (String[] args) {
        File file = new File ("shashank.txt");

        System.out.println ("The File name is " + file.getName());
        System.out.println ("The path is " + file.getPath());
        System.out.println ("Is it a directory " + file.isDirectory());
        System.out.println ("The file lenght is "+ file.length());
        System.out.println ("Is it a file :" + file.isFile());
        System.out.println ("Is it readable : " + file.canRead());
        System.out.println ("Is it writable : " + file.canWrite());
        System.out.println ("The time it is last modified : " + new Date (file.lastModified()));
    }
}