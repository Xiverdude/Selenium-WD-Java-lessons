package mypackage;

public class testclass13 {
    public static void main(String[] args) {
        //Массивы
        String[] names;
        names = new String[3];          //Хранит элементы типа String 4 элемента начиная с 0

        String[] name = new String[3];
        int[] newint = new int[11];     //
        int[] arr1 = {15, 10, 100};    //Сразу описываем по порядку массив в фигурных скобках

        name[0] = "Denis";
        name[1] = "VasyaShpek";
        name[2] = "Said";
        int[] arr2 = new int[15];

        System.out.println();

        for (int j = 0; j < 15; j++){       //заполняем массив автоматически с 0 +10
            arr2[j] = j * 10;
            System.out.println(arr2[j]);
            System.out.println(arr2.length);    //узнать размер массива
            System.out.println(arr2[arr2.length - 1]);  //показывать последний элемент массива, т.к. длина массива 15 и считается с нуля


        System.out.println(name[0]);
        System.out.println(name[2]);

        newint[4] = 15;
        newint[4] = 19;         //Перезапись

        System.out.println(newint[4]);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        for (int i = 0; i < 5; i++){               //цикл
            System.out.println(arr1[i]);
        }
        }
    }
}
