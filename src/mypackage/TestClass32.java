package mypackage;

//Интерфейсы. Все методы в нем оказываются в нем без тела методов с помощью имплементирования.

public class TestClass32 {
    public static void main(String[] args) {
     TestClass32Car car = new TestClass32Car();
    TestClass32Plane plane = new TestClass32Plane();

    car.go();
    car.stop();
    car.method1();
    car.method2();

    plane.go();
    plane.setSpeed(200);
    plane.stop();
    }
}
