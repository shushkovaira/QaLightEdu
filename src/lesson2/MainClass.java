package lesson2;

public class MainClass {
    public static void main(String[] args) {
        //введення данних для ділення//
        int dilene;
        int dilnuk;
        double dDilene;
        double dDilnuk;

        //введення данних для массиву//
        int [] massive={12,5,-3,45,0,10};
        int valueForComparing=2;
        int i=6;

        Calc calcDivInt=new Calc();
        System.out.println("Result of int division = "+calcDivInt.division(50,5));
        System.out.println("Result of double division = "+calcDivInt.division(3.3,1.1));

        WorkWithMassive workWithMassive=new WorkWithMassive();
        workWithMassive.analyzwMassive(massive,valueForComparing);

    }


}

