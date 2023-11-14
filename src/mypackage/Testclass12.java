package mypackage;

public class Testclass12 {
    public static void main(String[] args) {
        byte bt = 5;                // -128 - 127       1 байт
        short st = -100;            // -32768 - 32677   2 байт
        int in;                     //хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        char chr = 'q';             //хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535
        in = 1000000;               //
        long lg = -1234567789;      //хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
        System.out.println(bt);     //
        double d = 13.123;          //хранит число с плавающей точкой от ±4.9*10-324 до ±1.7976931348623157*10308 и занимает 8 байт
        System.out.println(d);      //
        float ft = 150.32f;         //хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
        System.out.println(ft );    //
        String str = "asswecan";    //любой текст(всегда с большой буквы)
        boolean tr = true;
        boolean fl = false;
        boolean b3 = bt > st;
        System.out.println(b3);
        System.out.println(str);
        System.out.println(chr);

    }
}
