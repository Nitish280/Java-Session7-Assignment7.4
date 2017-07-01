//here we are creating the array sort class
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we are taking integer array
		int[] abc = { 12, 85, 2, 6, 94, 78, 3 };

		printArray(abc, abc.length);
		//here we are using recursive call method 
		//here we are using the .length method for finding the length of the array 
		abc = recursiveCall(abc, abc.length, 0);
		System.out.println();
		printArray(abc, abc.length);
	}
//here we are creating the recursive call method 
//and it of return type integer
	//because we are passing the the integer type thats why
	//it returns the integer type value
	public static int[] recursiveCall(int[] abc, int n, int index) {
		int temp;
//here we are applying the if condition for finding the index
		if (n == index) {
			return abc;
		} else {
			for (int i = index + 1; i < n; i++) {
				if (abc[index] > abc[i]) {
					temp = abc[index];
					abc[index] = abc[i];
					abc[i] = temp;
				}
			}
			index++;
			recursiveCall(abc, n, index);
		}

		return abc;

	}
//here we are creating the printarray method
	public static void printArray(int[] arr, int len) {
		for (int i = 0; i < len; i++) {
			if (i == len - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}

		}
	}
}
