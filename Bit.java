package bit;


//public class Bit {
//    public static void main(String[] args) {
//        {
//            int x = 10;
//            System.out.println("x1=" + x);
//        }
//        int x = 100;
//        System.out.println("x1=" + x);
//    }
//}

//public class Bit{
//    public static void main(String[] args) {
//        int x=10;
//        System.out.println("x1="+x);
//        {
//             x=100;
//            System.out.println("x2="+x);
//        }
//    }
//}

class Lesson {
    int age; // 1
    String name; // 2
    static String country; // 3
    final static int TEST = 0; // 4

    public void show() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(country);
        System.out.println(TEST);
    }

    public Lesson() {
        age = 10;
        name = "zs";
        country = "中国";
        System.out.println(TEST);
    }


    public static void fun() {
        System.out.println(country);
        System.out.println(TEST);
    }
}


public class Bit {
    public static void main(String[] args) {
        Lesson lesson1 = new Lesson();
        lesson1.show();
    }
}
