import java.util.Scanner;
class twoString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = obj.nextLine();
        String a;

        for (int i = 0; i < name.length(); i++){
            if (name.length() == 2){
              System.out.println(name + name);
              break;
            }else if (name.length() < 2){
                System.out.println("Empty");
                break;
            }else if (name.length() == 3 && i == 2){
                i = 1;
               char u = name.charAt(i);
               char v = name.charAt(i+1);
               System.out.println(u + "" + v);
               break;
            }else if (i < 2 || i > name.length()-3){
                char x = name.charAt(i);
                System.out.print(x);
            }
        }
    }
}
