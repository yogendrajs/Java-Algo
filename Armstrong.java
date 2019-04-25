import java.util.Scanner;
class Armstrong {
  public static void main(String[] args) {
    Scanner variable = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int x = variable.nextInt();
    int len = Integer.toString(x).length();
    int y = x;
    int rem,sum = 0;
    int temp;
    while (x > 0){
      rem = x%10;
      int rems = rem;
      for (int i = 1; i < len; i++){
        rem = rem * rems;
      }
      temp = rem;
      sum = sum + temp;
      x = x/10;
      rem = 0;
      temp = 0;
    }if (sum == y){
      System.out.println("it is Armstrong");
    }else{
      System.out.println("it is not Armstrong");
    }
  }
}
