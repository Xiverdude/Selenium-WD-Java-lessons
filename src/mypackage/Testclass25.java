package mypackage;

public class Testclass25 {

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
        car3.acceleration(1000);



    }
}
