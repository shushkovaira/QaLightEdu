package Dz4;

public class MainClassWorkWithMatrix {
    public static void main(String[] args) {
        int[][] massiveMassive = new int[10][10];
        int valueForFilling ;
        int valueForReplacing ;

      WorkWithMassive fillingMassive2Value= new WorkWithMassive();
      fillingMassive2Value.fillingMassive(massiveMassive,7);
      WorkWithMassive printMassive1=new WorkWithMassive();
      printMassive1.printMassive(massiveMassive);



      WorkWithMassive fillingOfRDiagonal= new WorkWithMassive();
      fillingOfRDiagonal.fillingOfRightDiagonal(massiveMassive,3);
        WorkWithMassive printMassive2=new WorkWithMassive();
        printMassive2.printMassive(massiveMassive);

        WorkWithMassive fillingOfLDiagonal=new WorkWithMassive();
        fillingOfLDiagonal.fillingOfLeftDiagonal(massiveMassive,1);

        WorkWithMassive printMassive3=new WorkWithMassive();
        printMassive3.printMassive(massiveMassive);

    }

}

