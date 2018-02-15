public class VariableArgument {
    static void Show(String...values) {
        System.out.println ("Variable Arguments");
    }

    public static void main (String[] args)
    {
        Show("shashank", "manoj", "nithin");
    }
}