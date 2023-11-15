package mypackage;

//НАСЛЕДОВАНИЕ  В ООП


public class TestClass28 {
    public static void main(String[] args) {
        TestClass28Cat cat = new TestClass28Cat();
        TestClass28Dog dog = new TestClass28Dog();

        cat.name = "Barsik";
        dog.name = "Sharik";

        cat.color = "white";
        dog.color = "black";

        cat.walk("Backyard");
        dog.walk("Park");

        cat.feed("Milk");
        dog.sit();

        System.out.println("Cat name is: "+ cat.name);
        System.out.println("Dog name is: " + dog.name);



    }

}
