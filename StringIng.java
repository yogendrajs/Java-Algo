import java.util.Scanner;
class Mahe {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = obj.nextLine();
        String a = "";
        String b = "";

            for (int j = name.length()-1; j >= 0; j--){
                char x = name.charAt(j);
                a = Character.toString(x) + a;
                if (a.equals("ing")){
                  System.out.println(name + "ly");
                  break;
                }
                else if (a.equals("ly")){break;}
                else if (a.equals("e")){}

                else {
                    b = Character.toString(x) + b;
                }
          }
          if (a.equals("ing") || a.equals("ly")){}
            else {
                System.out.println(b + "ing");
            }
    }
}
