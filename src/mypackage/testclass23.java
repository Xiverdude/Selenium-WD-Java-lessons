package mypackage;

public class testclass23 {
    public static void main(String[] args) {

        int result;
        result = getSum(1,10);
        System.out.println(result);

        result = getSum(5,10,56);
        System.out.println(result);

        sayHello("ass");
        sayHello("vasya", "venya");
        sayHello();

        int[] array = {1, 22, 34, 123, 314};

        int sum = getSum(array, "Oleg"); // передаем массив чисел и Имя
        System.out.println(sum + 1000);

    }

    static int getSum(int x, int y){//метод которые считает сумму 2 параметров
        int sum;
        sum = x + y;
        return sum;     //Оператор return применяется для возвращаения значения из метода, но и для выхода из метода.

    }

    static int getSum(int x, int y, int z){//метод которые считает сумму 3 параметров
        int sum;
        sum = x + y + z;
        return sum;     //Оператор return применяется для возвращаения значения из метода, но и для выхода из метода.

    }


    static int getSum(int[] array, String name){//метод которые считает сумму 3 параметров
        int sum = 0;
        for (int i = 0; i  < array.length; i++){
            sum += array[i];

        }
        System.out.println("Hi " + name + "!");
        System.out.println("your sum is: " + sum);
        return sum; //вернем сумму чтоб в дальнейшем могли где либо ее использовать
    }
    static void sayHello(String name){
        System.out.println();
        System.out.println("hello " + name + "!");
        System.out.println("im your program");
        System.out.println("nice to meet you");


    }
    static void sayHello(String name1, String name2){
        System.out.println();
        System.out.println("hello " + name1 + "!");
        System.out.println("hello " + name2 + "!");
        System.out.println("im your program");
        System.out.println("nice to meet you");


    }
    static void sayHello(){
        System.out.println();
        System.out.println("hello ");
        System.out.println("im your program");
        System.out.println("nice to meet you");


    }
}
