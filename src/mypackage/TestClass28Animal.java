package mypackage;

//ИНКАПСУЛЯЦИЯ - скрывать реализацию от пользователя (модификкаторы доступа)
public class TestClass28Animal {
    String name;
    String color;
    public int var; //public модификатор доступа во всей программе
//    private int var;//приватный модификатор только внутри класса
//    protected int var;//защищенный модификатор для использования во внутреннем пакете, во внекшних запрещено(в других папках). можно предоставить доступ
//        int var;//package по дефолту видимость определяется границами пакета


    public void walk(String place){
        System.out.println("We are walking here :" + place);
    }
    public void sleep(){
        System.out.println("Zzzz");}
    public void sound(){
        System.out.println("Hello!");}
}
