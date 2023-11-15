package mypackage;

public class TestClass28Cat extends TestClass28Animal {

    public void feed(String feed){
        System.out.println("I like :" + feed);
    }

    @Override                   //Аннотация чтоб переопределить метод sound для кошки
    public void sound(){
        System.out.println("Meow meow");
    }
}
