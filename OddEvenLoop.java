import java.util.Scanner;
class OddEven {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		System.out.println("enter an input");
		int x = variable.nextInt();

		int original = x;
		int y = x*2;
		for (int i = 0; i < y; i ++) {
			x ++;
			if (x % 2 == 0){
				System.out.print(x + " ");
				try {Thread.sleep(700);} catch (Exception e) {}
			}
		}System.out.print(" are the following even Numbers");
		System.out.println();
		x = original - 1;
		for (int j = 0; j < y; j ++) {
			if (x % 2 != 0){
				System.out.print(x + " ");
				try {Thread.sleep(700);} catch (Exception e) {}
			}x --;
		}System.out.println(" are the following odd Numbers");
	}
}
