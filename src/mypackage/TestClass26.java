package mypackage;

//КОНСТРУКТОР КЛАССА

public class TestClass26 {

    public static void main(String[] args) {

        TestClass25Cars car = new TestClass25Cars();//создали объект нашего класса
        car.color = "Black";
        car.lenght = 5000;
        car.height = 2500;
        car.wight = 2000;

        car.addWeight(60);//обавляем авто вес
        car.drive(180);

        car.addWeight(700);
        car.drive(100);

        TestClass25Cars car2 = new TestClass25Cars();
        car2.color = "white";
        TestClass25Cars car3 = new TestClass25Cars();
        car3.color = "green";

        System.out.println();

        car2.drive(100);
        car3.acceleration(150);

        TestClass25Cars car4 = new TestClass25Cars("black");

        System.out.println("Car color is: " + car4.color);//выведем значение перенменной цвета, которая находится в объекте car4

        TestClass25Cars car5 = new TestClass25Cars("red", 2100, 2000, 5100);
        System.out.println(car5.color + " " + car5.height + " " + car5.weight + " " + car5.lenght);//выводим на экран все наши значения переменных



    }
}
