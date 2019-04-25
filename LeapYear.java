// class Name {
// 	public static void main(String[] args) {
// 		String name = "yogendra";
// 		String principal = "******";

// 		for (int i = 0; i < name.length(); i++){
// 			char x = name.charAt(i);
// 			System.out.println(principal + x + principal);
// 		}
// 	}
// }

// class Name {
// 	public static void main(String[] args) {
// 		for (int i = 0; i < 10; i++){
// 			for (int j = 0; j<10-i; j++){
// 				System.out.print("*");
// 			}System.out.println();
// 		}
// 	}
// }

// class Name {
// 	public static void main(String[] args) {
// 		for (int i = 0; i < 10; i++){
// 			for (int j = 0; j < 10-i; j++){
// 				System.out.print(" ");
// 			}for (int k = 0; k < i+1; k++){
// 				System.out.print("*");
// 			}System.out.println();
// 		}
// 	}
// }

// class Name {
// 	public static void main(String[] args) {
// 		for (int i = 0; i < 10; i++){
// 			for (int j = 0; j < i+1; j++){
// 				System.out.print(" ");
// 			}for (int k = 0; k < 10-i; k++){
// 				System.out.print("*");
// 			}System.out.println();
// 		}
// 	}
// }

import java.util.Scanner;
class LeapYear {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = variable.nextInt();
		System.out.print("Enter the number of forward and backward years: ");
		int number = variable.nextInt();
		int x = year;

		for (int i = 0; i <= number; i++){
			if (year % 100 == 0){
				if (year % 400 == 0){
					i = 1;
					year += 4;
					System.out.println(year);
            }else {
               year ++;
            }
				}else if (year % 4 == 0){
					System.out.println(year);
					year += 4;
      	}else {
          year++;
          i = 0;
         }
    	}
			System.out.println();
			year = x;
			for (int i = 0; i <= number; i++){
				if (year % 100 == 0){
					if (year % 400 == 0){
						i = 1;
						year-= 4;
						System.out.println(year);
					}else {
						year --;
					}
				}else if (year % 4 == 0){
					System.out.println(year);
					year -= 4;
				}else{
					year--;
					i = 0;
				}
			}
		}
	}
