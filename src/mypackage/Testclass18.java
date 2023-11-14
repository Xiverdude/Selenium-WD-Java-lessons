package mypackage;
//Коллекции List (динамический массив)
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testclass18 {
    public static void main(String[] args) {

        int[] array = new int[3];

            List<Integer> list = new ArrayList<>();     //создаем Лист(список)

            list.add(5);
            list.add(10);
            list.add(9);

            int a = list.get(2);

        System.out.println(list.get(1)); //выводим из списка 2 значение
        System.out.println(list.get(0));  //выводим из списка 1 значение

        list.set(2, 100);       //метод Set присвиваем индекс 2 и значение 100

        System.out.println(list.get(2));
        System.out.println();
        System.out.println(list.get(1));
        list.remove(1);            //метод указываем индекс и удаляем элемент из списка
        System.out.println(list.get(1)); //и список съезжает на индекс 2 и выводит 100

        System.out.println();
        System.out.println(list.size());  //метод size позволяет узнать размер нашего списка
        list.add(9);
        System.out.println(list.size());

//        list.clear();       //метод Clear позволяет очистить список
        System.out.println(list.size());

        List<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(56);

        System.out.println();
        System.out.println(list.size());
        list.addAll(list2);   //метод addAll метод добавить элементы одного списка в другой список
        System.out.println(list.size());

        list.removeAll(list2); //метод removeAll позволяет удалитть елементы конкретного списка
        System.out.println(list.size());

        System.out.println(list.isEmpty()); //метод isEmpty позволяет узнать пустой ли наш список или нет
//        list.clear();                       //метод clear очищает наш список
        System.out.println(list.isEmpty());

        System.out.println();
        System.out.println(list.contains(100));//метод contains мы узнаем находится ли в нашем списке число или объект true/false
        System.out.println(list.contains(987));

        list.addAll(list2);//добавили в лист1 лист 2

        System.out.println();
        System.out.println(list.containsAll(list2));//позволяет узнать существую элементы 2 списка в 1 списке
        list.removeAll(list2);//удаляем все элементы из списка list2
        System.out.println(list.containsAll(list2));//true/false

        Iterator<Integer> iterator = list.iterator();//метод Iterator вернет итератор чтоб указывать на какие-то элементы
//        System.out.println(iterator.next());// метод указывает на след элемент списка
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());//позваляет узнать существует ли след элемент в списке, не сработает на последнем элементе
        System.out.println();
        while (iterator.hasNext()) {
            ; //цикл while будет выполнятся пока hasNext будет возвращать True
            System.out.println(iterator.next());//переходим на след элемент и выводим его на экран
        }


    }



}
