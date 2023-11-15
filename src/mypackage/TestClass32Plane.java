package mypackage;

import java.util.SortedMap;

public class TestClass32Plane implements TestClass32Transport{


    @Override
    public void go() {
        System.out.println("We are flying on plane!");
    }

    @Override
    public void stop() {
        System.out.println("We are landing!"
        );
    }

    public void setSpeed(int speed){
        System.out.println("Our speed is: " + speed);

    }
}
