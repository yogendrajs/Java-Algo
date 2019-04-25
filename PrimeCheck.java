import java.util.Scanner;
class PrimeCheck {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		int prime = variable.nextInt();

		int temp = 0;
		for (int i = 2; i < prime; i ++){
			if (prime % i == 0){
				temp = temp + 1;
			}
		}if (temp == 0){
			System.out.print("prime hai");
		}else{
			System.out.print("prime nahi hai");
			temp = 0;
		}
	}
}