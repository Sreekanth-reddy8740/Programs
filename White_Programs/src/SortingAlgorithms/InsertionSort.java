package SortingAlgorithms;

public class InsertionSort {

	public static void main(String[] args) {
		
		int a[]= {1,4,78,7,8,79,12};
		
		sort(a);
		for(int n:a)
			System.out.println(n);
	}

	
//		SIMPLE WE CAN SAY, TAKE ONE ELEMENT AND CHOSE WHICH PLACE IS SUTABLE FOR THAT ACCORDING TO OUR ORDER (ASC/DSC)
//	    AND INSERT THE ELEMENT.
	
//	In this Sort We can Divide the array in to two parts one is sorted(a[0]) and other is un-sorted array(remaining array).
//	than we can take one element from the un-sorted array and to compare each element in the sorted array list.if it is 
//  ZERO index && grater than the that element at the time we can swap those elements. 
	
	private static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int temp=a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		
	}

	

}
