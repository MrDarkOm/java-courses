package fun.darkom;

public class Main {// начало объявления класса Main

    /*
    многострочный комментарий
    Объявление нового класса,
    который содержит код программы
    */
    public static final int LIMIT = 3;

    // определение метода main
    public static void main(String[] args) {// объявление нового метода
        metod2();//вызов второго метода metod2();
        int x = 10, y = 25;
        System.out.println("x = " + x);  // 10
        System.out.println("y = " + y);  // 25
        x = 42;
        System.out.println("x = " + x);
        // LIMIT=57; // так мы уже не можем написать, так как LIMIT - константа
        System.out.println("LIMIT = " + LIMIT);
        System.out.println("Hello World");// вывод строки на консоль
//        new Variables();
        new Outs();

    }// конец объявления нового метода

    public static void metod2(){
        System.out.println(LIMIT + 10);
    }

} // конец объявления класса Main
