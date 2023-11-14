package mypackage;

//ПЕРЕМЕННЫЕ

public class TestClass25Cars {
    int height;
    int wight;
    int lenght;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;

    public void addWeight(int weight) {
        this.weight += weight;
        System.out.println("New weight: " + this.weight);
    }

    public void drive(int speed){
        if (weight <= maxWeight) {
            this.speed = speed;
            System.out.println("Running!");
        } else {
            System.out.println("Cannot drive, its too heavy!");
        }

    }
    public void acceleration(int maxSpeed){
        if (speed >= maxSpeed) {
            this.speed = maxSpeed;
            System.out.println("Overspeed");
        }
        else {
            this.speed = maxSpeed;
        }
    }
}
