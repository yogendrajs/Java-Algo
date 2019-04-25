import java.util.Scanner;
class Factorial {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		System.out.print("enter the number for Factorial =>  ");
		int fac = variable.nextInt();

		int a = 1;
		for (int i = 1; i <= fac; i ++){
			a = a * i;
		}System.out.println("the Factorial of " + fac + " is " + a);
	}
}