// class Animal {
//     void eat(){
//       System.out.println("Animal is eating");
//     }
// }
//
// class Dog extends Animal{
//     void eat(){
//       System.out.println("Dog is eating");
//     }
// }
//
// class BabyDog extends Dog {
//     public static void main(String[] args) {
//       Animal obj = new BabyDog();
//       obj.eat();
//     }
// }

class Animal {
    int a = 12;
}
class Dog extends Animal{
    int a = 13;
}
class Meal {
    public static void main(String[] args) {
      Animal obj = new Dog();
      System.out.println(obj.a);
    }
}
