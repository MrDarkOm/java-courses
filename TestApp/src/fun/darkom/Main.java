package fun.darkom;

public class Main {

    public static final int LIMIT = 3;

    public static void main(String[] args) {
//        metod2();//вызов второго метода metod2();
        Outs out = new Outs();
//        Arithmetic arf = new Arithmetic();
//        out.Inners();
//        out.InnerTest();
//        arf.Icrement();
    }

    public static void metod2(){
//      new Variables();
        int x = 10, y = 25;
        System.out.println("x = " + x);  // 10
        System.out.println("y = " + y);  // 25
        x = 42;
        System.out.println("x = " + x);
        // LIMIT=57; // так мы уже не можем написать, так как LIMIT - константа
        System.out.println("LIMIT = " + LIMIT);
        System.out.println("Hello World");// вывод строки на консоль
        System.out.println(LIMIT + 10);
    }

}
