import java.util.*;
class PalindromeString {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		System.out.println("enter a name");
		String name = variable.next();
		System.out.println();

		String k = "";
		for (int j = name.length()- 1; j >= 0; j --){
			char y = name.charAt(j);
			String l = Character.toString(y);
			k = k + l;
		}System.out.println(k);
// printing the condition if z and k are palindrome to each other

		if (name.equals(k)){
			System.out.println("palindrome hai");
		}else{
			System.out.println("palindrome nahi hai");
		}

	}
}