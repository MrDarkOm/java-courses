package fun.darkom;

public class Main {// начало объ€влени€ класса Main

    /*
    многострочный комментарий
    ќбъ€вление нового класса,
    который содержит код программы
    */

    protected static final double LIMIT = 3.14;
    public int x = 5;

    // определение метода main
    public static void main(String[] args) {// объ€вление нового метода

        int x, y;
        x = 10;
        y = 25;
        System.out.println("x = " + x);  // 10
        System.out.println("y = " + y);  // 25
        x = 52;
        System.out.println("x = " + x);
        // LIMIT=57; // так мы уже не можем написать, так как LIMIT - константа
        System.out.println("LIMIT = " + LIMIT);
        System.out.println("Hello World");// вывод строки на консоль
        new Variables();
    }// конец объ€влени€ нового метода

} // конец объ€влени€ класса Main
