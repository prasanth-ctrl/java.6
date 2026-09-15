
package example;

import java.util.*;

public class FreqencyCount {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

    
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

     
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
