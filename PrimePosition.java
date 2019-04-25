import java.util.Scanner;
class PrimePosition {
		public static void main(String[] args) {
			int temp = 0, count = 0;
				Scanner obj = new Scanner(System.in);
				System.out.print("Enter the position of the prime number: ");
				int number = obj.nextInt();

				for (int i = 2;; i++){
					temp = 0;
						for (int j = 2; j < i; j++){
								if (i % j == 0){
										temp++;
										if (temp > 0){break;}
								}
						}if (temp == 0){
								count++;
						}if (count == number){
								System.out.println(i);
								break;
						}
				}
		}
}
