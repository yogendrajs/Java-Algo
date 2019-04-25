class Swap {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        System.out.println("before swaping, the value of a is " + a + " and b is " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swaping, the value of a is " + a + " and b is " + b);
    }
}

// class Swap {
//     public static void main(String[] args) {
//         int a = 12;
//         int b = 23;
//         int c;
//         System.out.println("before swaping, the value of a is " + a + " and b is " + b);
//         c = a;
//         a = b;
//         b = c;
//         System.out.println("after swaping, the value of a is " + a + " and b is " + b);
//     }
// }
