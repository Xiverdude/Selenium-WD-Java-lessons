package mypackage;

//КОЛЛЕКЦИЯ Множества: Set, HashSet

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Название Hash... происходит от понятия хэш-функция. Хэш-функция — это функция, сужающая множество значений объекта до некоторого подмножества целых чисел. Класс Object имеет метод hashCode(),
// который используется классом HashSet для эффективного размещения объектов, заносимых в коллекцию. В классах объектов, заносимых в HashSet, этот метод должен быть переопределен (override).



public class TestClass20 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(); // создаем Хэшсет
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(10);

        System.out.println();

        set.remove(11);                 //удаляем из листа значение 11

        System.out.println(set.size());     //set - это коллекция , которая хранит уникальные объекты

        Iterator<Integer> iterator = set.iterator();    //Вывели значение всего сета с помощью итератора
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        for (int i : set){                  //Вывели значение всего сета с помощью Цикла
            System.out.println(i);

        }

//       set.clear();
        System.out.println(set.size());

        System.out.println(set.contains(10));       //true
        System.out.println(set.contains(11));       //false потому что удалили в remove

    }


}
