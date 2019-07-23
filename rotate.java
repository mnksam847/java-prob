import java.util.Scanner;

public class rotate {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		int[] arr = rev(array);
		

		display(arr);

	}

	public static int[] rev(int[] array) {

		int n = scn.nextInt();

		n = n % array.length;
		if (n <= 0) {
			n = n + array.length;
		} 
		
		int temp = 0;
		while (n > 0) {
			temp = array[array.length - 1];
			for (int i = array.length - 1; i >= 1; i--) {
				array[i] = array[i - 1];
			}
			array[0] = temp;

			n--;
		}

		return array;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}
}
