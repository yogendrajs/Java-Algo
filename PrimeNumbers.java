import java.util.Scanner;

class PrimeNumbers {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		System.out.print("Enter an input number: ");
		int prime = variable.nextInt();

		int temp = 0;
		int count = 0;
		for (int i = 2; i < prime; i ++){
			for (int j = 2; j < i; j ++){
				if (i % j == 0){
					temp = temp + 1;
				}
			}
			if (temp == 0){
				System.out.println(i);
				count ++;
			}else{
				temp = 0;
			}
		}System.out.println("the total number of prime numbers between " + 2 + " and " + prime + " are " + count);
	}
}