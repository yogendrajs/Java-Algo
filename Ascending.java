import java.util.Arrays;
import java.util.Collections;

// class Ascending {
// 	public static void main(String[] args) {
// 		int[] arr = {12,34,56,2,33,76};
// 		Arrays.sort(arr);
// 		System.out.println(Arrays.toString(arr));
// 	}
// }

class Ascending {
	public static void main(String[] args) {
		Integer[] arr = {12,34,56,2,33,76};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}
}
