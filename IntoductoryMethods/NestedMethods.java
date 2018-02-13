public class NestedMethods
{
    public static void main (String[] args)
    {
        Area obj = new Area();
        obj.FindArea();
    }
}

class Area {
    int height;
    int breadth;

    int calPerimeter (int h, int w) {
        height = h;
        breadth = w;
        return 2*(height+breadth);
    }

    void FindArea () {
        int perimeter = calPerimeter (10,20);
        int area = perimeter * 100; //Some dummy logic just for tutorials

        System.out.println ("Area = " + area);
        System.out.println ("Perimeter = " + perimeter);
    }
}