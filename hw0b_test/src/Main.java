import java.util.*;

import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] zeroArray = new int[3];
        int[] array = {4,7,10};
        array[0] = 5;
        System.out.println(array[0]);
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        for(int i:array)
        {
            System.out.println(i);
        }

        List<String> lst = new ArrayList<>();
        lst.add("zero");
        lst.add("one");
        lst.set(0,"zed");
        System.out.println(lst.get(0));
        System.out.println(lst.size());

        if (lst.contains("one"))
        {
            out.println("one in lst");
        }
        for (String elem: lst)
        {
            out.println(elem);
        }

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.remove(2);
        out.println(set.size());

        if (set.contains(1))
        {
            out.println("1 in lst");
        }
        for (int elem: set)
        {
            out.println(elem);
        }

        Map<String,String> map = new HashMap<>();
        map.put("hello","hi");
        map.put("hello","goodbye");
        out.println(map.get("hello"));
        out.println(map.size());

        if (map.containsKey("hello"))
        {
            out.println("\"hello\" is in map");
        }
        for(String key : map.keySet())
        {
            out.println(key);
        }

        Point p1 = new Point(5,9);
        Point p2 = new Point(-3,3);

        out.println("Point p1:("+p1.x+","+p1.y+ ")");
        out.println("Distance :"+p1.distanceTo(p2));
        p1.translate(2,2);
        out.println("Point p1:("+p1.x+","+p1.y+ ")");

    }
}
class Point{
    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point()
    {
        this(0,0);
    }
    public double distanceTo(Point other)
    {
        return Math.sqrt(Math.pow(this.x- other.x,2)+Math.pow(this.y-other.y,2));
    }
    public void translate (int dx, int dy)
    {
        this.x+=dx;
        this.y+=dy;
    }
}