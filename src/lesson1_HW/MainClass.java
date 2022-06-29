package lesson1_HW;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Enter first number:");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Enter first number:");
        int b = new Scanner(System.in).nextInt();

        Calc calc=new Calc();
        System.out.println("substractionDouble = "+calc.substractionDouble(a,b));
        EnterNumbersAndCalculateMultiplay multiplay=new EnterNumbersAndCalculateMultiplay();
        System.out.println("multiplay = "+multiplay.multiPlay(a,b));

    }


}
