public class Main {
    public static void main(String[] args) {
        int i = 0;
        //This is a single line comment
        while (i<10)
        {
            System.out.println(i);
            i++;
        }

        for(int j=0;j<10;j++)
        {
            System.out.println(j);
        }


        while (i>0)
        {
            System.out.println(i--);
        }

        for (i = 9;i>=0;i--)
        {
            System.out.println(i);
        }

        i = 12;

        if(i % 3 == 0 && i % 5 == 0)
        {
            System.out.println("FizzBuzz");
        }
        else if (i % 3 == 0)
        {
            System.out.println("Fizz");
        }
        else if (i%5 == 0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(i);
        }

        double x =Math.pow(2,10);
        System.out.println(x);
        System.out.println(greet("hero"));

        String s = "hello";
        s+= "world";
        s+=5;

        System.out.println(s);
        int strlength = s.length();
        String substr = s.substring(1,5);
        System.out.println(strlength);

        System.out.println(substr);
        char c = s.charAt(2);
        System.out.println(c);

        if(s.indexOf("hello") != -1)
        {
            System.out.println("\"hello\" in s");
        }

        for(i = 0;i<s.length();i++)
        {
            char letter = s.charAt(i);
            System.out.println(letter);
        }

        for(i = 0;i<5;i++)
        {
            String line = "";
            for (int j = 0;j<i+1;j++)
            {
                line += "*";
            }
            System.out.println(line);
        }

        printIndexed("hello world");
        stutter("hello world");
        System.out.println( quadrant(2,6));

    }

    public static String greet(String name)
    {
        return "Hello, "+name;
    }

    public static void printIndexed(String s)
    {
        String output = "";
        for(int i=0;i<s.length();i++)
        {
            output += s.charAt(i);
            output += s.length()-1-i;
        }
        System.out.println(output);
    }

    public static void stutter(String s)
    {
        String output = "";
        for(int i=0;i<s.length();i++)
        {
            output += s.charAt(i);
            output += s.charAt(i);
        }
        System.out.println(output);
    }

    public static int quadrant(int x,int y)
    {
        if (x==0&&y==0)
            return 0;
        else if (y>0 && x >0)
            return 1;
        else if (y>0 && x<0)
            return 3;
        else
            return 4;
    }


}