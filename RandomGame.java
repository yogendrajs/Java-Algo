import java.util.Scanner;
import java.util.Random;
class Randoms{
	public static void main(String[] args) {
		Random obj = new Random();
		obj.method1();
	}
	void method1(){
		Scanner variable = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Welcome to the game of addition");
		System.out.println("For each correct answer, you'll be score 2 \nFor each wrong answer, you'll lose score 1\n");
		System.out.println("Your score is 0\n");
		int j = 5; int score = 0;
		for (int i = 0; i < 5;){
			int a = random.nextInt(50);
			int b = random.nextInt(50);
			System.out.print("Enter the sum of " + a + " and "+ b +": ");
			int inputs = variable.nextInt();
			int result = a+b;

			if (inputs == result){
				System.out.println("your answer is correct");
				score =score +2;
				System.out.println("your score is: " + score);
				System.out.println();
			}else{
				j--;
				if (j == 0){
					System.out.println("you lost the game");
					System.out.println("your final score is: " + score);
					break;
				}else{
					System.out.println("please try again");
					System.out.println("you've only " + j + " chances left");
					score --;
					System.out.println("your score is: " + score);
					System.out.println();
				}
			}
		}
	}
}