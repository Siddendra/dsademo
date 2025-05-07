package hashtable;

import java.util.HashMap;

/**
 * Find out the Common items is there in the two arrays
 */
public class ItemInCommon {

    public static boolean iteminCommon(int[] arry1, int[] arry2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i: arry1) {
            myHashMap.put(i, true);
        }
        for (int i: arry2) {
            if(myHashMap.get(i) != null ) return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int[] array1 = {1,3, 5};
        int[] array2 =  {2,4,5};
        System.out.println(iteminCommon(array1, array2));

    }

}
