

import java.util.Random;

/**
 * Quicksort implements the quicksort methods and helper methods. All methods are upperbound exclusive
 * @author Jordan Satterfield
 * February 4th, 2021
 * CSCI333: Alogorithms and Data Structures
 * Homework 3: Quicksort
 */
public class Quicksort<T extends Comparable<T>> {
	
	Random ran = new Random();
	public Quicksort() {
		super();
	}

	/**
	 * Recursive method that implements the quicksort algorithm
	 * @param array: the array to be sorted.
	 * @param p: the lower index of the array or subarray to be sorted.
	 * @param r: the upper limit of the array (exclusive).
	 */
	public void quicksort(T array[], int p, int r) {
		if ((r-p) == 1) {
			return;
		}
		if (p < r) {
			int q = partition(array, p, r);
			quicksort(array, p, q);
			quicksort(array, q+1, r);
		}
	}
	
	/**
	 * Partition is a helper method for quicksort. Uses the right most element of the array
	 * to be the pivot, then sorts all values <= the pivot to the left in the array, and all 
	 * values > the pivot to the right of the array, then places the pivot in between those
	 * subarrays. Returns the index of the pivot element.
	 * @param array: the array or subarray to be sorted.
	 * @param p: the lower bound of the array (inclusive).
	 * @param r: the upper bound of the array (exclusive).
	 * @return int: the index value of the pivot element.
	 */
	private int partition(T array[], int p, int r) {
		T x = array[r-1];
		int i = p - 1;
		for (int j = p; j <= (r - 2); j++) {
			if (array[j].compareTo(x) <= 0) {
				i++;
				swap(array,i,j);
			}
		}
		swap(array, i+1,r-1);
		return(i + 1);
	}
	
	/**
	 * Recursive method that implements the randomizedQuicksort algorithm
	 * @param array: the array to be sorted.
	 * @param p: the lower index of the array or subarray to be sorted.
	 * @param r: the upper limit of the array (exclusive).
	 */
	public void randomizedQuicksort(T array[], int p, int r) {
		if ((r-p) == 1) {
			return;
		}
		if (p < r) {
			int q = randomizedPartition(array, p, r);
			quicksort(array, p, q);
			quicksort(array, q+1, r);
		}
	}
	
	/**
	 * randomizedPartition is a helper method for randomizedQuicksort. Uses a random element in the array
	 * to be the pivot, then sorts all values <= the pivot to the left in the array, and all 
	 * values > the pivot to the right of the array, then places the pivot in between those
	 * subarrays. Returns the index of the pivot element.
	 * @param array: the array or subarray to be sorted.
	 * @param p: the lower bound of the array (inclusive).
	 * @param r: the upper bound of the array (exclusive).
	 * @return int: the index value of the pivot element.
	 */
	private int randomizedPartition(T array[], int p, int r) {
		int ranIndex = ran.nextInt(array.length);
		T x = array[ranIndex];
		swap(array, ranIndex, r-1);
		int i = p - 1;
		for (int j = p; j <= (r - 2); j++) {
			if (array[j].compareTo(x) <= 0) {
				i++;
				swap(array,i,j);
			}
		}
		swap(array, i+1,r-1);
		return(i + 1);
	}
	
	/**
	 * Helper method that swaps elements in the array.
	 * @param array: the array from which elements will be swapped.
	 * @param index1: the index of the element to be swapped with index2's element.
	 * @param index2: the index of the element to be swapped with index1's element.
	 */
	private void swap(T array[], int index1, int index2) {
		T temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
