import java.util.Scanner;
class Square {
//the program is to check if the given number is a perfect square or not
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter a number to check if it is a perfect square or not: ");
      int a = obj.nextInt();
        int b, count = 0;
        for (int i = a; i > 0; i--){
            b = i*i;
            if (b == a){
                count++;
                System.out.println("Yes, it is a perfect Square and the Square-root of the number is " + i);
                break;
            }
        }if (count == 0){
            System.out.println("the number is not perfect Square");
        }
    }
}
