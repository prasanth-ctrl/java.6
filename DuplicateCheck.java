package example;
import java.util.*;

public class DuplicateCheck {
	static boolean containDuplicate(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr) {
			if(set.contains(num)) {
				return true;
			}
			set.add(num);
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30,10};
		System.out.println(containDuplicate(arr));
	}

}
