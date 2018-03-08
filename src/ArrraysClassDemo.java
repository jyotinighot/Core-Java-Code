import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class ArrraysClassDemo {
	public static void main(String[] args) {
		//int[] n={3,56,42,12,78,69,46,22,38,57,4,47,15,74,23,28,16,85};
		/*	System.out.println(Arrays.toString(n));
		double[] d={11.2,61.3,1.85,45.5,78.9};
		System.out.println("Array == "+Arrays.toString(d));*/
		/*		Arrays.sort(d);
		System.out.println("Sorted Array == "+Arrays.toString(d));
//		Arrays.sort(n);
		System.out.println("Sorted Array == "+Arrays.toString(n));
		//Arrays.sort(n,5,10);
		System.out.println("Sorted Array == "+Arrays.toString(n));
		Arrays.sort(n);
		System.out.println("Sorted Array == "+Arrays.toString(n));
		int x=Arrays.binarySearch(n, 74);


		System.out.println("Position=   "+x);
		 */		/*int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};

        // Sort the complete array in ascending order
        // so that Binary Search can be applied
        Arrays.sort(ar);

        // To search for a particular value(for eg 9)
        // use binarysearch method of arrays
        int index = Arrays.binarySearch(ar,9);
        System.out.println("Position of 9 in sorted"+  " arrays is => \n" + index);*/
		//  int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};

		// Copy the whole array
		/*int[] copy = Arrays.copyOf(ar, ar.length);
        System.out.println("Copied array => \n" + 
                           Arrays.toString(copy));

        // Copy a specified range into a new array.
        int[] rcopy = Arrays.copyOfRange(ar, 1, 5);
        System.out.println("Copied subarray => \n" + 
                           Arrays.toString(rcopy));
        Arrays.fill(rcopy,55);
        System.out.println("Copied subarray => \n" + 
                Arrays.toString(rcopy));
		 */       

		Integer[] n={3,56,42,12,78,69,46,22,38,57,4,47,15,74,23,28,16,85};
		List<Integer>l1=Arrays.asList(n);
		System.out.println("Original  "+l1);
		l1.set(5,555);
		System.out.println("Changed  "+l1);
		System.out.println(Arrays.toString(n));
		int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
		int ar1[] = {4, 6, 1, 8, 3, 9, 7, 45, 2};
		System.out.println(Arrays.equals(ar, ar1));
		System.out.println(Arrays.hashCode(ar));
		// Creates a wrapper list over ar[]
		//  List<Integer> l1 = Arrays.asList(ar);

		List<Integer>list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(10);
		list1.add(17);
		list1.add(14);
		list1.add(13);
		System.out.println(list1);
		List<Integer>list2=Collections.unmodifiableList(list1);
		System.out.println("Before Chage  "+list1);
		list1.add(99);
		list1.add(999);
		System.out.println("After Change List1 "+list1);
		Collections.reverse(list1);
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		Collections.swap(list1, 2, 5);
		System.out.println(list1);
		System.out.println(Collections.min(list1));
		System.out.println(Collections.max(list1));
		System.out.println(list1);
		/*list1.set(list1.indexOf(Collections.max(list1)),0);
		System.out.println(list1);
		System.out.println(Collections.max(list1));*/
		Collections.sort(list1);
		System.out.println(list1);
		//System.out.println(list1.indexOf(Collections.max(list1)));
		System.out.println(list1.get(list1.indexOf(Collections.max(list1))-1));
		Collections.replaceAll(list1, 10, 100);
		System.out.println(list1);
		Collections.shuffle(list1);
		System.out.println(list1);
		Random rnd;
		Collections.shuffle(list1, rnd);
		
	}
}

