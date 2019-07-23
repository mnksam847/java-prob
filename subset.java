import java.lang.reflect.Array;

public class subset {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30,40,50,60,70,80,90 };
		subset(array);
	}

	public static void subset(int[] array) {

		int limit = (int) Math.pow(2, array.length);
		for (int n = 0; n < limit; n++) {
			int temp = n;
			int idx = 0;
			while (temp != 0) {
				int rem = temp % 2;

				if (rem == 1) {
					System.out.print(array[idx ]);
				}
				temp = temp / 2;
				idx++;
			}

			System.out.println();
		}

	}
}
