package mypackage;

public class TestClass15 {
    public static void main(String[] args) {

        String a = "Hello world!"; //класс
     //   a == "hall" //сравнить классы нельзя
        a = "Hello world!";
        System.out.println(a.equals("Hello world"));
        System.out.println(a.equals("Hello world!"));

        String a2 = "hello";

        System.out.println(a.equals(a2));
        a = "text";
        a2 = "TEXT";
        System.out.println(a.equals(a2));
        System.out.println(a.equalsIgnoreCase(a2)); //игнорировать регистр

        a = "TeXt";
        System.out.println(a.toLowerCase());//преоброзовывает в нижний регистр
        System.out.println(a.toUpperCase());//преоброзовывает в верхний регистр
        System.out.println(a);

        System.out.println(a.charAt(1));//выведет символ 1 символ, отчет идет с 0
        System.out.println(a.indexOf("Xt"));//ищет в строке заданный символ или строку, и их возвращает индекс (т. е. порядковый номер

        a = "Hello world";
        System.out.println(a.contains("Hello"));//метод чтобы проверить, содержит ли String указанную последовательность символов.


        a = "Hello world";
        System.out.println(a.contains("Hello"));
        System.out.println(a.contains("text"));
        System.out.println();
        System.out.println(a.length()); // показываедлину строки

        System.out.println();
        System.out.println(a.startsWith("He")); //проверям начинается ли строка с этих букв
        System.out.println(a.startsWith("!"));
        System.out.println(a.endsWith("He"));
        System.out.println(a.endsWith("!"));    //проверяем заканчивается ли строка на эти буквы


        a = "hello,world,ass";
        System.out.println();
        String[] array = a.split( ",");     //разделение по зяпятой
        System.out.println(array[0]);              //показываем разделенный текст по зяпятой
        System.out.println(array[1]);
        System.out.println(array[2]);

        String ass = "My name is %s Im %d years old";   //создали шаблон, где в % встанет значение переменной
        int age = 31;                                   //%s строка %d число
        String name = "denis";

        System.out.println(String.format(ass, name, age));  // выведе строку
        System.out.println(String.format(ass, "Vasya", 10));    //класс String

        System.out.println();

        String ass2 = "30";
        int s = Integer.parseInt(ass2);     //преоброзуем строку в число с помощью метода parseInt

        System.out.println(s * 3);      //

        a = "Hello, world!";

        System.out.println(a.substring(1, 5));  //выводим символы с 1 по 5 индекс
        System.out.println(a.substring(1));     //обрезаем индекс и выводим данные после 1 символа

        System.out.println(a.substring(7, a.length() - 1)); //получаем от 7 индекса до предпоследней буквы

        System.out.println();

        String a1 = "Hello";
        a2 = "World";
        String a3 = "!";
        String konkat;

        konkat = a1 + a2 + a3;      //метод для слияния 3 строк в 1
        System.out.println(konkat);

        konkat = a1.concat(a2).concat(a3); //Канакатинация лучше для больших проектов
        System.out.println(konkat);





    }
}
