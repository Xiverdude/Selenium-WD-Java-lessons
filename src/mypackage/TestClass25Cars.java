package mypackage;

//ПЕРЕМЕННЫЕ
//КОНСТРУКТОР КЛАССА
public class TestClass25Cars {

    public TestClass25Cars(){
        System.out.println("New car created!");
    }

    public TestClass25Cars(String color){
        this.color = color; //this.color данная переменная = примет значание этой переменной color
    }

    public TestClass25Cars(String color, int height, int weight, int lenght){
        this.color = color; //this.color данная переменная = примет значание этой переменной color
        this.height = height;
        this.weight = weight;
        this.lenght = lenght;

    }

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
