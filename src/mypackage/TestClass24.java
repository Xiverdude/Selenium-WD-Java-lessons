package mypackage;

// ИСКЛЮЧЕНИЯ Exceptions
public class TestClass24 {
    public static void main(String[] args) {


        try {
            devide(10, 2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }   finally {
            System.out.println("What in the box?");
        }
        devide(13,0);


    }
/*
    public static void devide(int a, int b) {   //метод который делит числа а и б
        try {
            System.out.println("Result is: " + a/b);// ctrl+alt+t - реализация метода. Выводит результат деления, если на 0 делить нельзя, то нужно обработать исключения
        } catch (ArithmeticException e) {         //указываем ошибку, которую мы хотим отловить
            System.out.println("Problem!");
        } finally {
            System.out.println("Finish!");  //не является обязательным
        }
}
*/
    public static void devide(int a, int b) throws ArithmeticException{//если метом выбрасывает исключение и мы его не обрабатываем, пишем ArithmeticException
        if (b == 0) {
            throw new ArithmeticException("Cannot devide by zero!");
        }
        System.out.println("Result is: " + a / b);
    }
}

//Обработка исключений в Java основана на использовании в программе следующих ключевых слов:
//try – определяет блок кода, в котором может произойти исключение;
//catch – определяет блок кода, в котором происходит обработка исключения;
//finally – определяет блок кода, который является необязательным, но при его наличии выполняется в любом случае независимо от результатов выполнения блока try.
//Эти ключевые слова используются для создания в программном коде специальных обрабатывающих конструкций: try{}catch, try{}catch{}finally, try{}finally{}.
//throw – используется для возбуждения исключения;
//throws – используется в сигнатуре методов для предупреждения, о том что метод может выбросить исключение.
