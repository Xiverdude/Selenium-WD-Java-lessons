package mypackage;

//АБСТРАКТНЫЕ КЛАССЫ


public class TestClass31 {
    public static void main(String[] args) {

        TestClass31Dog dog = new TestClass31Dog();
        TestClass31Cat cat = new TestClass31Cat();

        dog.walk("Park");
        dog.saySmth();

        cat.walk("Backyard");
        cat.saySmth();

    }

}
