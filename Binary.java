import java.util.Scanner;
class Binary {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your input to convert it into binary: ");
        int b = obj.nextInt(), rem;
        String sum = "", newsum="", y = "";
        if (b > 0){
            while (b > 0){
              rem = b%2;
              sum = rem +"";
              newsum = newsum+sum;
              b = b/2;
            }for (int i = newsum.length()-1; i >= 0; i--){
              char x = newsum.charAt(i);
              y = y + Character.toString(x);
            }System.out.print(y);
            System.out.println();
        }else {
            System.out.println("the program has not made for numbers less than \"zero\"");
        }
    }
}
