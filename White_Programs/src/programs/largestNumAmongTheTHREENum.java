package programs;

public class largestNumAmongTheTHREENum {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		int result=(a>b)?(a>c ? a:c) : (b>c ? b:c);
		
		System.out.println(result);

	}

}
