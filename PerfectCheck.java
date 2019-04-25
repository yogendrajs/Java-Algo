import java.util.Scanner;
class PerfectCheck {
  public static void main(String[] args) {
    Scanner variable = new Scanner(System.in);
    System.out.print("Enter a number that you want to check is perfect or not: ");
    int a = variable.nextInt();
    int temp = 0;
    for (int i = 1; i < a; i++){
      if (a % i == 0){
        temp = temp + i;
      }
    }if (temp == a){
      System.out.println("it is a perfect number");
    }else {
      System.out.println("not PerfectCheck");
    }
  }
}
