package lesson1_HW;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        int videmnik1 = 10;
        int videmnik2 = 1;
        int mnognik1 = 5;
        int mnognik2 = 8;


        Calc calc = new Calc();
        System.out.println("substractionDouble = " + calc.substraction(videmnik1, videmnik2));

        System.out.println("multiplay = " + calc.multiPlay(mnognik1, mnognik2));

    }


}
