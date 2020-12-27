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
            %d ���������� ������������, ������ �������� ����������� ���� �� ����������
            ���� ����� d ��������, ��� ������ ������������ ����� �������������� ��� ������ ������������� ��������.
            */
        System.out.printf("x=%d; y=%d \n", x, y);
            /*
            %x: ����������������� �����
            %f: ����� � ��������� ������
            %e: ����� � ���������������� �����, ��������, 1.3e+01
            %c: ���������� �������
            %s: ��������� ��������
            */
        String name = "Tom";
        int age = 30;
        float height = 1.7f;
        //������� ��������������, ������� � �������
        //%.2f - ����� float ��� double � 2 ������ ����� �������
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);

    }

    public void Inners(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        in.close();
        /*
        next(): ��������� ��������� ������ �� ������� �������
        nextLine(): ��������� ��� ��������� ������
        nextInt(): ��������� ��������� ����� int
        nextDouble(): ��������� ��������� ����� double
        nextBoolean(): ��������� �������� boolean
        nextByte(): ��������� ��������� ����� byte
        nextFloat(): ��������� ��������� ����� float
        nextShort(): ��������� ��������� ����� short
         */

    }
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
