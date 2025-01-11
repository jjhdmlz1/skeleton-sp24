import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum = 0;
        for(int i:L)
        {
            sum += i;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> Leven = new ArrayList<>();
        for(int i:L)
        {
            if (i%2 ==0)
                Leven.add(i);
        }
        return Leven;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> Lcommon = new ArrayList<>();

        for(int i:L1)
        {
            for(int j:L2)
            {
                if(i == j)
                {
                    Lcommon.add(i);
                }
            }
        }
        return Lcommon;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int number = 0;
        for(String elem:words)
        {
            if (elem.indexOf(c)!=-1)
            {
                number++;
            }
        }
        return number;
    }
}
