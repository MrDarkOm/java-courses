package fun.darkom;

public class Main {// ������ ���������� ������ Main

    /*
    ������������� �����������
    ���������� ������ ������,
    ������� �������� ��� ���������
    */

    protected static final double LIMIT = 3.14;
    public int x = 5;

    // ����������� ������ main
    public static void main(String[] args) {// ���������� ������ ������

        int x, y;
        x = 10;
        y = 25;
        System.out.println("x = " + x);  // 10
        System.out.println("y = " + y);  // 25
        x = 52;
        System.out.println("x = " + x);
        // LIMIT=57; // ��� �� ��� �� ����� ��������, ��� ��� LIMIT - ���������
        System.out.println("LIMIT = " + LIMIT);
        System.out.println("Hello World");// ����� ������ �� �������
        new Variables();
    }// ����� ���������� ������ ������

} // ����� ���������� ������ Main
