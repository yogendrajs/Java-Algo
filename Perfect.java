import java.util.Scanner;
class Perfect {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		int x = variable.nextInt();

		
		for (int i = 1; i < x; i++){
			int counter = 0;
			for (int j = 1; j < i; j++){
				if (i % j == 0){
					counter += j;
				}
			}if (counter == i){
				System.out.println(i);
			}else{
				// counter = 0;
			}
		}
	}
}