

/**
 * Quicksort_Main demonstrates that the quicksort and randomizedQuicksort algorithms
 * are working properly.
 * @author Jordan Satterfield
 */
public class Quicksort_Main {
	
	public static void main(String[] args) {
		
		Quicksort<Integer> qs1 = new Quicksort<Integer>();
		Quicksort<String> qs2 = new Quicksort<String>();
		
		Integer[] array = {1,  2,  3,  8,  5,  7,  4,  6,  9,  10};
		qs1.quicksort(array, 3, 8);
		System.out.println(java.util.Arrays.toString(array));
		
		Integer[] array1 = {6,5,7,4,8,3,9,2,0,1};
		System.out.println("Array 1:");
		System.out.println(java.util.Arrays.toString(array1));
		qs1.quicksort(array1, 0, array1.length);
		System.out.println(java.util.Arrays.toString(array1));
		
		System.out.println("\nArray2:");
		Integer[] array2 = {7,89,-5,3,-4,77,-3,-2,0,-1,200};
		System.out.println(java.util.Arrays.toString(array2));
		qs1.quicksort(array2, 0, array2.length);
		System.out.println(java.util.Arrays.toString(array2));
		
		System.out.println("\nArray3:");
		Integer[] array3 = {300,899,100000,601,5,23,8593,435,1234,999,100001};
		System.out.println(java.util.Arrays.toString(array3));
		qs1.quicksort(array3, 0, array3.length);
		System.out.println(java.util.Arrays.toString(array3));
		
		System.out.println("\nArray4:");
		String[] array4 = {"Hello,", "this", "is", "CSCI333:", "Algorithms", "and", "Data", "Structures."};
		System.out.println(java.util.Arrays.toString(array4));
		qs2.quicksort(array4, 0, array4.length);
		System.out.println(java.util.Arrays.toString(array4));
		
		System.out.println("\nArray5:");
		String[] array5 = {"This", "is", "a", "test", "of", "quicksort", "class", "and", "methods"};
		System.out.println(java.util.Arrays.toString(array5));
		qs2.quicksort(array5, 0, array5.length);
		System.out.println(java.util.Arrays.toString(array5));
		
		System.out.println("\nArray6:");
		Integer[] array6 = {6,5,7,4,8,3,9,2,0,1};
		System.out.println(java.util.Arrays.toString(array6));
		qs1.randomizedQuicksort(array6, 0, array6.length);
		System.out.println(java.util.Arrays.toString(array6));
		
		System.out.println("\nArray7:");
		Integer[] array7 = {7,89,-5,3,-4,77,-3,-2,0,-1,200};
		System.out.println(java.util.Arrays.toString(array7));
		qs1.randomizedQuicksort(array7, 0, array7.length);
		System.out.println(java.util.Arrays.toString(array7));
		
		System.out.println("\nArray8:");
		Integer[] array8 = {300,899,100000,601,5,23,8593,435,1234,999,100001};
		System.out.println(java.util.Arrays.toString(array8));
		qs1.randomizedQuicksort(array8, 0, array8.length);
		System.out.println(java.util.Arrays.toString(array8));
		
		System.out.println("\nArray9:");
		String[] array9 = {"Hello,", "this", "is", "CSCI333:", "Algorithms", "and", "Data", "Structures."};
		System.out.println(java.util.Arrays.toString(array9));
		qs2.randomizedQuicksort(array9, 0, array9.length);
		System.out.println(java.util.Arrays.toString(array9));
		
		System.out.println("\nArray10:");
		String[] array10 = {"This", "is", "a", "test", "of", "quicksort", "class", "and", "methods"};
		System.out.println(java.util.Arrays.toString(array10));
		qs2.randomizedQuicksort(array10, 0, array10.length);
		System.out.println(java.util.Arrays.toString(array10));

	}

}
