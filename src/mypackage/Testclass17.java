package mypackage;
// Java - Циклы For, ForEach, While, Do While
public class Testclass17 {

    public static void main(String[] args) {
        System.out.println("Start program");

        for (int i = 0; i < 5; i++) {   //счетчик приравняем к 0. условие пока I < 5 потом завершится; i++ увеличиваем счетчик на 1
            System.out.println(i * 10);
        }

        System.out.println("End program");
        System.out.println();

        for (int i = 10; i > 0; i--) {   //счетчик приравняем к 0. условие пока I = 10 потом завершится; i-- уменьшаем счетчик на 1
            System.out.println(i);

        }
        int[] array = new int[10];  //создадим массив из 10 элементов
        System.out.println();
        for (int i = 0; i < 10; i++) {
            array[i] = i * 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Element with index " + i + " is: " + array[i]);
        }
        for (int element : array) {
            System.out.println(element);    //создали перебор без счетчика пока не переберем все итерации
        }
        System.out.println();
        int i = 0;
        boolean bool = true;
        while (bool) {  // сначала мы выполняем проверку, а потому совершаем действие
            System.out.println("While " + i);
            i++;        // когда i станет равен 5 цикл прервется и bool станет false
            if (i == 5) bool = false;
        }
        System.out.println();

        i = 5;
        do {        // сначала мы выполняем действие, а потому совершаем проверку
            System.out.println("Do: " + i);
            i++;
        } while (i < 5);    //мы по любому выполним операцию хотя бы 1 раз

    }
}
