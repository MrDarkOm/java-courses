package fun.darkom;

import java.util.Scanner;

public class Outs {

    public Outs(){
        System.out.println("Hello world!");
        System.out.println("Bye world...");
        System.out.print("Hello \n");
        System.out.print("world!");
        System.out.print("Bye world...");

        int x=5;
        int y=6;
        System.out.println("x=" + x + "; y=" + y);
            /*
            %d обозначают спецификатор, вместо которого подставляет один из аргументов
            Сама буква d означает, что данный спецификатор будет использоваться для вывода целочисленных значений.
            */
        System.out.printf("x=%d; y=%d \n", x, y);
            /*
            %x: шестнадцатеричных чисел
            %f: чисел с плавающей точкой
            %e: чисел в экспоненциальной форме, например, 1.3e+01
            %c: одиночного символа
            %s: строковых значений
            */
        String name = "Tom";
        int age = 30;
        float height = 1.7f;
        //Сколько спецификаторов, столько и запятых
        //%.2f - вывод float или double с 2 знакми после запятой
        System.out.printf("Name: %s Age: %d  Height: %.2fm \n", name, age, height);

    }

    public void Inners(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.printf("Ваше число: %d \n", num);
        in.close();
    }
        /*
        next(): считывает введенную строку до первого пробела
        nextLine(): считывает всю введенную строку
        nextInt(): считывает введенное число int
        nextDouble(): считывает введенное число double
        nextBoolean(): считывает значение boolean
        nextByte(): считывает введенное число byte
        nextFloat(): считывает введенное число float
        nextShort(): считывает введенное число short
         */


    public void InnerTest(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
        in.close();
    }
}
