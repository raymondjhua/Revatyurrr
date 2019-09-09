package Q1;
//Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4

public class Q1 {
	public static void main(String[] args) {
		int[] array = new int[]{1,0,5,6,3,2,3,7,9,8,4};
		//perform bubble sort with array
		//bubble sort will run through the array and swap adjacent elements
		//until sort is complete
		array = bubbleSort(array);
		for(int x : array)
			System.out.println(x);
	}
	
	public static int[] bubbleSort(int[] array) {
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int i = 0; i < array.length; i++) {
				try {
					if(array[i] > array[i+1]) {
						int temp = array[i+1];
						array[i+1] = array[i];
						array[i] = temp;
						flag = true;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					//System.out.println("Exception");
					//continue;
				}
			}
		}
		return array;
	}
}
