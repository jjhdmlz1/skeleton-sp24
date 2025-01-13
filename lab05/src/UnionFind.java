import java.util.HashMap;
import java.util.Map;

public class UnionFind {
    // TODO: Instance variables
    Map<Integer,Integer> map;


    /* Creates a UnionFind data structure holding N items. Initially, all
       items are in disjoint sets. */
    public UnionFind(int N) {
        // TODO: YOUR CODE HERE
        map = new HashMap<>();
        try{
            for(int i = 0;i<N;i++)
            {
                map.put(i,-1);

            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }

    }

    /* Returns the size of the set V belongs to. */
    public int sizeOf(int v) {
        // TODO: YOUR CODE HERE

        return Math.abs(map.get(find(v)));
    }

    /* Returns the parent of V. If V is the root of a tree, returns the
       negative size of the tree for which V is the root. */
    public int parent(int v) {
        // TODO: YOUR CODE HERE
        if (map.get(v)<0)
        {
            //V is root
            return Math.abs(map.get(v));
        }
        else
            return map.get(v);
    }

    /* Returns true if nodes/vertices V1 and V2 are connected. */
    public boolean connected(int v1, int v2) {
        // TODO: YOUR CODE HERE
        if (find(v1)==find(v2))
            return true;
        else
            return false;
    }

    /* Returns the root of the set V belongs to. Path-compression is employed
       allowing for fast search-time. If invalid items are passed into this
       function, throw an IllegalArgumentException. */
    public int find(int v) {
        // TODO: YOUR CODE HERE
        try {
            int value = map.get(v);
            if (value>0)
            {
                return find(value);
//                return value;
            }
            else
            {
                return v;
            }

        } catch (Exception e) {
            System.out.println("error");
            throw new IllegalArgumentException(e);
        }
    }

    /* Connects two items V1 and V2 together by connecting their respective
       sets. V1 and V2 can be any element, and a union-by-size heuristic is
       used. If the sizes of the sets are equal, tie break by connecting V1's
       root to V2's root. Union-ing an item with itself or items that are
       already connected should not change the structure. */
    public void union(int v1, int v2) {
        // TODO: YOUR CODE HERE
        if(v1!=v2) {
            if (sizeOf(v1) <= sizeOf(v2)) {
                int size = map.get(find(v2));
                size += map.get(find(v1));
                map.put(find(v1), find(v2));
                map.put(find(v2),size);
            } else {
                int size = map.get(find(v1));
                size += map.get(find(v2));
                map.put(find(v2), find(v1));
                map.put(find(v1),size);

            }
        }
    }

}
