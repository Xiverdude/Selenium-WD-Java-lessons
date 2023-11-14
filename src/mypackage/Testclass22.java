package mypackage;
//СТРУКТУРА МЕТОДОВ


public class Testclass22 {
    public static void main(String[] args) {

        int a = 13;
        int b = 3;
        int sum;

        sum = getSum(a, b);     //из метода Main мы запускаем метод getSum
        System.out.println(sum);
        sum = getSum(10, 150);
        System.out.println(sum);
        System.out.println(getSum(2, 11));//вызываем метод и передаем значение, которые мы хотим обработать

        showSum(10, 51, 77);

        saySmth();

        sayHello("Patya");
        String name = "Vasya";  //создаем переменную Name
        sayHello(name);

        sayShowSumToPerson("Edick", 15, 11,33);

        boolean result = shoYorAss(1,2,3);
        System.out.println(result);

    }

    static int getSum(int x, int y){
        int sum;
        sum = x + y;
        return sum;     //Оператор return применяется для возвращаения значения из метода, но и для выхода из метода.

    }

    static void showSum(int x, int y, int z){
        int sum = x + y + z;
        System.out.println("Sum is: " + sum) ;


    }

    static void saySmth(){
        System.out.println("Hello!");
        System.out.println("I'm a Termonator.");
        System.out.println("nice to meet you!");

    }

    static void sayHello(String name){      //Метод который здоровается с человеком
        System.out.println("Hello " + name + "!");
        System.out.println("Im robot");

    }

    static void sayShowSumToPerson(String name, int a, int b, int c){
        System.out.println("Start of program!");
        sayHello(name);
        showSum(a, b, c);
        System.out.println("End of program!");


    }

    static boolean shoYorAss (int x, int y, int z){
       int sum2 = x + y + z;
        System.out.println("Boolean is" + sum2);
        return true;

    }

}
