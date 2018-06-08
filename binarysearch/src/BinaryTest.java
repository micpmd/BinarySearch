import java.util.*;
import java.util.Arrays;
import java.lang.reflect.Array;
@SuppressWarnings("unused")

public class BinaryTest{
	public static void main(String[] args) {		
		Integer [] list1 = {1,2,3,4};//test for ints
        int res1 = BinarySearch.binarySrch(list1, 4);
		System.out.println("The target's index is " + res1);

		Double [ ] list2 = {1.2,2.3,3.4,4.0};//test for doubles
        int res2 = BinarySearch.binarySrch(list2, 4.0);
		System.out.println("The target's index is " + res2);
        
		String [] list3 = {"a", "b", "c", "d"};//test for strings
		int res3 = BinarySearch.binarySrch(list3,"a");
		System.out.println("The target's index is " + res3);
		//test for out of array
		String [] list4 = {"a", "d", "t", "z"};
		int res4 = BinarySearch.binarySrch(list4,"x");
		System.out.println("The target's index is " + res4);
		//end
		Integer [] list5 = {1,2,3,4};
        int res5 = BinarySearch.binarySrch(list5, 5);
		System.out.println("The target's index is " + res5);
		//beginning
		Double [ ] list6 = {1.2,2.3,3.4,4.0};
        int res6 = BinarySearch.binarySrch(list6, 0.5);
		System.out.println("The target's index is " + res6);
		
		String [] list7 = {};
		System.out.println("Empty array:" + BinarySearch.binarySrch(list7,"x"));
	}
}
