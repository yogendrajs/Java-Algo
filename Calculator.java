import java.util.Scanner;
class Mistake{
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		System.out.print("Name the operation(add, sub, mul, div, mod)that you want to execute: ");
		String x = variable.nextLine();
		Operations obj = new Operations();
		System.out.print("enter first input: ");
		int game = variable.nextInt();
		System.out.print("enter second input: ");
		int games = variable.nextInt();

		if (x.equals("add") || x.equals("addition")){
			int t = obj.add(game, games);
			System.out.println("the sum of " + game + " and " + games + " is " + t);
		}else if (x.equals("sub") || x.equals("subtract")){
			int t = obj.sub(game, games);
			System.out.println("the difference of " + game + " and " + games + " is " + t);
		}else if (x.equals("mul") || x.equals("multiply")){
			int t = obj.mul(game, games);
			System.out.println("the product of " + game + " and " + games + " is " + t);
		}else if (x.equals("div") || x.equals("divide")){
			float t = obj.div(game, games);
			System.out.println("the division of " + game + " by " + games + " gives " + t);
		}else if (x.equals("mod") || x.equals("modulus")){
			int t = obj.mod(game, games);
			System.out.println("the modulus of " + game + " and " + games + " is " + t);
		}
	}
}
