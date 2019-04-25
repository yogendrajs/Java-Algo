import java.util.Arrays;
import java.util.Scanner;
class Anagram {
    public static void main(String[] args) {
      Scanner variable = new Scanner(System.in);
      System.out.print("Enter first input: ");
      String a = variable.nextLine();
      System.out.print("Enter second input: ");
      String b = variable.nextLine();

      char[] Array1 = a.replaceAll(" ", "").toLowerCase().toCharArray();
      char[] Array2 = b.replaceAll(" ", "").toLowerCase().toCharArray();

      if (a.length() == b.length()){
          Arrays.sort(Array1);
          Arrays.sort(Array2);
          System.out.print(Array1);


          if (Arrays.equals(Array1, Array2)){
            System.out.println("Yes, It is Anagram");
          }else{
            System.out.println("Sorry! It is not Anagram");
          }

      }else{
        System.out.println("Shhh! It is not Anagram, please give the correct input :(");
      }

    }
}
