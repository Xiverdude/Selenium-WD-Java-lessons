package mypackage;

public class testclass16 {
    public static void main(String[] args) {

        int i = 10;
        System.out.println("Start of program");

        if (i > 10) {
            System.out.println("i > 10");
            i++;
            System.out.println(i);
        }
        else if (i < 10 && i > 5) {          // если i < чем 10 и i > 5
            System.out.println("i < 10 and i > 5");
            i--;
            System.out.println(i);
        }
        else {
            System.out.println("Nothing");
        }



        System.out.println("End of program");

        System.out.println();

        i = 95;

        if (i > 50) {
            System.out.println("i > 50");
            if  (i > 90) {
                System.out.println("i > 90");
            }
            else {
                System.out.println("i <= 90");
            }
        }
            else {
                System.out.println("i <= 50");
            }

            i = 3;

            switch (i) {      //условный оператор, который дает возможность сравнивать переменную со списком значений.
                case 1:
                    System.out.println("The number is 1");
                    break;      //если команда выполнится, то остановится
                case 2:
                    System.out.println("The number is 2");
                    break;
                case 3:
                    System.out.println("The number is 3");
                    break;
                default:
                    System.out.println("I dot know the number");    //аналог if else
            }
        }

    }
