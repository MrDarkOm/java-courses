package fun.darkom;

public class TrueFalse {

    public TrueFalse() {
//      == ���������� ��� �������� �� ��������� � ���������� true (���� �������� �����) � false (���� �������� �� �����)
//      != ���������� ��� �������� �� ��������� � ���������� true (���� �������� �� �����) � false (���� �������� �����)
        int a = 10;
        int b = 4;
        boolean c = a == b;         // false
        boolean d = a == 10;       // true
        boolean c1 = a != b;         // true
        boolean d1 = a != 10;       // false
//      < (������ ���)
//      > (������ ���)
        boolean c2 = a < b;   // false
        boolean d2 = a > b;   // true
//      >= (������ ��� �����)
//      <= (������ ��� �����)
        boolean c3 = 10 <= 10;    // true
        boolean b3 = 10 >= 4;     // true
        boolean d3 = 10 <= 4;    // false
/*
        |  c=a|b; (c ����� true, ���� ���� a, ���� b (���� � a, � b) ����� true, ����� c ����� ����� false)
        &  c=a&b; (c ����� true, ���� � a, � b ����� true, ����� c ����� ����� false)
        !  c=!b; (c ����� true, ���� b ����� false, ����� c ����� ����� false)
        ^  c=a^b; (c ����� true, ���� ���� a, ���� b (�� �� ������������) ����� true, ����� c ����� ����� false)
        || c=a||b; (c ����� true, ���� ���� a, ���� b (���� � a, � b) ����� true, ����� c ����� ����� false)
        && c=a&&b; (c ����� true, ���� � a, � b ����� true, ����� c ����� ����� false)
*/
        boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, ������� ������������ true
        boolean a2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, ������� ������������ false
        boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false, ������� ������������ false (4 < 6 - true, �� �� �����������)
        boolean a4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, ������� ������������ true
        boolean a5 = (5 > 6) ^ (4 < 6); // 5 > 6 - true, ������� ������������ true (4 < 6 - false)
        boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, ������� ������������ false
    }
}
