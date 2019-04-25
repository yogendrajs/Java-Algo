import java.util.Scanner;
class Palindrome {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		System.out.println("Enter an input");
		int a = variable.nextInt();

		int originalValue = a;
		int rem, rev = 0;
		while (a > 0){
		rem = a % 10;
		rev = rev * 10 + rem;
		a = a / 10;
		}System.out.println();

		if (originalValue == rev){
			System.out.println(originalValue + " is Palindrome");
		}else {
			System.out.println(originalValue + " is not Palindrome");
		}
	}
}