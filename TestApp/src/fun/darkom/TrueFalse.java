package fun.darkom;

public class TrueFalse {

    public TrueFalse() {
//      == сравнивает два операнда на равенство и возвращает true (если операнды равны) и false (если операнды не равны)
//      != сравнивает два операнда на равенство и возвращает true (если операнды не равны) и false (если операнды равны)
        int a = 10;
        int b = 4;
        boolean c = a == b;         // false
        boolean d = a == 10;       // true
        boolean c1 = a != b;         // true
        boolean d1 = a != 10;       // false
//      < (меньше чем)
//      > (больше чем)
        boolean c2 = a < b;   // false
        boolean d2 = a > b;   // true
//      >= (больше или равно)
//      <= (меньше или равно)
        boolean c3 = 10 <= 10;    // true
        boolean b3 = 10 >= 4;     // true
        boolean d3 = 10 <= 4;    // false
/*
        |  c=a|b; (c равно true, если либо a, либо b (либо и a, и b) равны true, иначе c будет равно false)
        &  c=a&b; (c равно true, если и a, и b равны true, иначе c будет равно false)
        !  c=!b; (c равно true, если b равно false, иначе c будет равно false)
        ^  c=a^b; (c равно true, если либо a, либо b (но не одновременно) равны true, иначе c будет равно false)
        || c=a||b; (c равно true, если либо a, либо b (либо и a, и b) равны true, иначе c будет равно false)
        && c=a&&b; (c равно true, если и a, и b равны true, иначе c будет равно false)
*/
        boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
        boolean a2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
        boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false, поэтому возвращается false (4 < 6 - true, но не вычисляется)
        boolean a4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
        boolean a5 = (5 > 6) ^ (4 < 6); // 5 > 6 - true, поэтому возвращается true (4 < 6 - false)
        boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false
    }
}
