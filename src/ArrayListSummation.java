
public class ArrayListSummation {

	public static void main(String[] args) {
		
		int x [] = {1, 4, 7, 9, 11};
		
		int sum = 0;
		
		for (int i = 0; i<x.length; i++) {
			
			sum = sum +  x[i];
		}
		
		System.out.println(sum);

	}
	
}
