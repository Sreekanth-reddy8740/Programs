package SortingAlgorithms;

public class BubbolSort {

	public static void main(String[] args) {
		
//	In the Bubble sort we compare first number with second number, if the first number is grater than the second number
//  we swap each other or else keep going until we get first large number at the last position. this process  until we get the  order...
		
		int a[]= {64,58,752,85,21,1,41};
		for(int n:a)
			System.out.print(n +",");
		
		System.out.println();
		sort(a);
		for(int n:a)
			System.out.print(n +",");
		
	}
	
	private static void sort(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j] > a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
	
}

	












