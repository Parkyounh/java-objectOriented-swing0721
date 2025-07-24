package objectOriented;

public class ArrayTest3 {
	
	static void method1(int a) {
		a +=1;
		
	}
	
	public static void main(String[] args){
		int a =1;
		method1	(a);
		System.out.println(a);
		
//		int[] arr1 = new int[]{100,200,300};
		int[]arr = {100,200,300};
		String names[] = new String[5];
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(names[i]);
			System.out.println(arr[i]);
		}
	}
}
