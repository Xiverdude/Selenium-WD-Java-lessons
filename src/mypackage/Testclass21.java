package mypackage;
//КОЛЛЕКЦИЯ MAP
//Map — это структура данных, которая содержит набор пар “ключ-значение”. По своей структуре данных напоминает словарь, поэтому ее часто так и называют. В то же время,
//Map является интерфейсом, и в стандартном jdk содержит основные реализации: Hashmap, LinkedHashMap, Hashtable, TreeMap. Самая используемая реализация — Hashmap, поэтому и будем ее использовать в наших примерах.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Testclass21 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>(); //создаем мапу ( ключ, значение)
        map.put(1, "black"); //ключ уникален и не может повторяться
        map.put(2, "white");//ключем может быть любой тип
        map.put(3, "yellow");
        map.put(10, "green");

        System.out.println(map.get(1));
        System.out.println(map.get(10));

        System.out.println(map.size());
//      map.clear();
        System.out.println(map.size());

        System.out.println(map.containsKey(90));    //true/false
        System.out.println(map.containsKey(10));    //сморим если в нашей Мапе ключ c 90 и 10
        System.out.println(map.containsValue("white")); //смотрим если в нашей мапе значение белый и серый
        System.out.println(map.containsValue("gray"));

        Set<Integer> keys = map.keySet();//создаем СЕТ
        Iterator<Integer> iterator = keys.iterator();//создаем итератор
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));//пробежимся по всем ключам которое хранится в мапе по всем значениям
        }


        System.out.println(map.get(2));
        map.put(2, "pink");             //PUT изменили значение в мапе у ключа
        System.out.println(map.get(2));

        Map<String, String> map2 = new HashMap<>();
        map2.put("pussy", "pussy");
        System.out.println(map2.get("pussy"));


    }






}
