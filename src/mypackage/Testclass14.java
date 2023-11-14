package mypackage;

public class testclass14 {
    public static void main(String[] args) {

        int a;
        a = 10;
        a = 15;
        System.out.println(a);

        int b;
        b = 11;

        int c, d;
        c = d = b;
        System.out.println(c + " " + d);

        a = 13;     //выполняется присвоение
        b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        double f = 15;
        double e = 10;
        System.out.println(f / e);
        System.out.println(f % e);
        System.out.println();
        System.out.println(f == e);     //сравнение на равенство
        System.out.println(f *= e);     //сравнение на неравенство
        System.out.println(f + 10 <= e + 10);   //арифметические операции в приоритете
        System.out.println(!(a + b <= b + 15));
        System.out.println(!(false));

        int i = 0;
        i++; // i = i + 1;  инкремент
        System.out.println(i);
        i--; // i = i -1;   декремент   префикс и постфикстная форма
        System.out.println(i);

        i = 5;
        System.out.println(i++);    //постфикс
        System.out.println(i);

        i = 3;
        a = i++;
        System.out.println(a);
        i = 3;
        a = ++i;
        System.out.println(a);      //инкремент

        a = 10;
        b = 20;

        System.out.println(a > b || a < b); // операция сравнения либо (если 1 из условий возвращает true, то вернет true
        System.out.println(a > b || b > 30); // false+false = true

        System.out.println(a > b && a < b);  //амперсант операция и вернут true если 2 true
        System.out.println(a > 9 && b == 20);

        System.out.println((a + 10 > 15 || b - 5 > 10) && a < b);

        a = 9;
        System.out.println(Math.sqrt(a));   // Math.sqrt корень
        System.out.println(Math.pow(a, 3));

        a = 10;
        a = a + 5;
        System.out.println(a);

        a = 10;
        a += 5; // a = a + 5 сокращенный вариант
        System.out.println(a);
        a -= 5; // a = a - 5;
        System.out.println(a);
        a *= 2; // a = a * 2;
        System.out.println(a);
        a /= 2; // a = a / 2;
        System.out.println(a);
        a %= 3; // a = a % 3;
        System.out.println(a);

    }
}