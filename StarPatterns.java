// class UltaStar {
// 	public static void main(String[] args) {
// 		for (int b = 20; b >=0; b--){
// 			for (int c = 1; c < b; c ++){
// 				System.out.print("*");
// 			}System.out.println();
// 		}
// 	}
// }

// class UltaStar {
// 	public static void main(String[] args) {
// 		for (int i = 1; i < 10; i ++){
// 			for (int j = 1; j <= i; j ++){
// 				System.out.print(j);
// 			}System.out.println();
// 		}
// 	}
// }

// class UltaStar {
// 	public static void main(String[] args) {
// 		for (int i = 10; i > 0; i--){
// 			for (int j = 1; j < i; j ++){
// 				System.out.print(j);
// 			}System.out.println();

// 		}
// 	}
// }

// class UltaStar {
// 	public static void main(String[] args) {
// 		for (int i = 1; i < 10; i=i+1){
// 			for (int j = 10-i; j > 0; j--){
// 				System.out.print(" ");
// 			}
// 			for (int j = 0; j < i; j +=1){
// 				System.out.print(" *");
// 			}
// 			System.out.println();
// 		}
// 		for (int i=1; i<10; i+=1){
// 			for ( int j=0; j<i+1; j+=1){
// 				System.out.print(" ");
// 			}
// 			for (int j=10-(i+1); j>0; j--){
// 				System.out.print(" *");
// 			}
// 			System.out.println();
// 		}
// 	}
// }
import java.util.Scanner;
class Triangle {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		System.out.print("Enter an input: ");
		String news = variable.next();
		System.out.print("Enter the Number of rows: ");
		int rows = variable.nextInt();
		int k = 0;
		for (int i = 1; i <= rows; i ++, k = 0){
			for (int space = 1; space <= rows-i; space++){
				System.out.print(" ");
			}while (k != 2*i-1){
				System.out.print(news);
				k ++;
			}System.out.println();
		}
	}
}
