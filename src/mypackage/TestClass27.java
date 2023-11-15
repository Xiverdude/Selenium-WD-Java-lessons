package mypackage;

//ММОДИФИКАТОРЫ

public class TestClass27 {

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

        TestClass25Cars car1 = new TestClass25Cars();
        car1.color = "purple";
        TestClass25Cars car2 = new TestClass25Cars();
        car2.color = "white";
        TestClass25Cars car3 = new TestClass25Cars();
        car3.color = "green";

        System.out.println();

        car2.drive(100);
        car3.acceleration(150);
        System.out.println();

        System.out.println(TestClass25Cars.var);
        TestClass25Cars.var = 100;

        System.out.println(car1.var);
        System.out.println(car2.var);
        System.out.println(car3.var);

        TestClass25Cars.method();

        String.format("New os String", "string");


    }

}