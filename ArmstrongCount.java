import java.util.Scanner;
class ArmstrongCount {
  public static void main(String[] args) {
    Scanner variable = new Scanner(System.in);
    System.out.print("Enter an Integer input to which you want to print: ");
    int x = variable.nextInt();
    int rem = 0, sum = 0;
    int temp;
    for (int i = 1; i < x; i++){
      int len = Integer.toString(i).length();
      int k = i;
        while (k > 0){
            rem = k % 10;
            int rems = rem;
            for (int j = 1; j < len; j++){
              rem = rem * rems;
            }
            temp = rem;
            sum = sum + temp;
            k = k / 10;
            rem = 0;
            temp = 0;
        }if (sum == i){
          System.out.println(i);
        }sum = 0;
    }
  }
}


// import java.util.Scanner;
// class Array {
//   public static void main(String[] args) {
//     Scanner variable = new Scanner(System.in);
//     String name = variable.nextLine();
//     String mix = "";
//
//     for (int i = 0; i < name.length(); i++){
//       char x = name.charAt(i);
//       String y = Character.toString(x);
//       mix = mix + y;
//       String[] array = {y};
//       System.out.println(x);
//     }System.out.println(mix.length());
//   }
// }
//
// import java.util.Scanner;
// class Length{
//   public static void main(String[] args) {
//     Scanner variable = new Scanner(System.in);
//     String name = variable.nextLine();
// // if you take '.next()' method instead of '.nextLine()', then it'll not count space
//     System.out.println("the length of the name is " +name.length());
//   }
// }
