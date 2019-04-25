import java.util.Scanner;

class PalindromeNumber {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		int number = variable.nextInt();

		int rem, reverse = 0;
		while (number > 0){
			rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number / 10;
		}System.out.println(reverse);
	}
}