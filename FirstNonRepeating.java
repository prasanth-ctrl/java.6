
package example;

import java.util.*;

public class FirstNonRepeating {

    static char findFirst(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

  
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';  
    }

    public static void main(String[] args) {

        String s = "swiss";

        System.out.println(findFirst(s));
    }
}

