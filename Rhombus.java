import java.util.Scanner;
class Info {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		System.out.print("enter the number of rows: ");
		int rows = variable.nextInt();
// 		System.out.print("type a number: ");
// 		int number = variable.nextInt();
// 		int a = 1;
// 		for (int i = 0; i < rows; i++){
// 			for (int j = 0; j < i+1 && a <= number; j++){
// 				System.out.print(a+" ");
// 				a = a+1;
// 			}System.out.println();
// 		}
// 	}
// }

// class Info {
// 	public static void main(String[] args) {
// 		for (int i = 1; i <= rows; i++){
// 			for (int j = 1; j < i+1; j++){
// 				System.out.print(i);
// 			}System.out.println();
// 		}
// 	}
// }

// class Info {
// 	public static void main(String[] args) {
// 		for (int i = 1; i <= rows; i++){
// 			for (int j = 1; j < i+1; j++){
// 				System.out.print(j);
// 			}System.out.println();
// 		}
// 	}
// }

// class Info {
// 	public static void main(String[] args) {
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < rows-i; j++){
				System.out.print(" ");
			}for (int k = 0; k < 2*i+1; k++){
				System.out.print("*");
			}System.out.println();
		}for (int i = 0; i < rows; i++){
			for (int j = 0; j < i+1; j++){
				System.out.print(" ");
			}for (int k = (rows-i)*2; k > 1; k--){
				System.out.print("*");
			}System.out.println();
		}
	}
}
