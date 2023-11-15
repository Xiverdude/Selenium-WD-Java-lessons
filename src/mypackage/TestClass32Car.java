package mypackage;

public class TestClass32Car implements TestClass32Transport, TestClass32Intarface{


    @Override
    public void go() {
        System.out.println("We are driving!");
    }

    @Override
    public void stop() {
        System.out.println("We are slowing");
    }

    @Override
    public void method1() {
        System.out.println("test1");
    }

    @Override
    public void method2() {
        System.out.println("test2");
    }
}
