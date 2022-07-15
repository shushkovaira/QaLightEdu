package Dz4;

import static Dz4.WorkWithMassive.*;

public class MainClassWorkWithMatrix {
    public static void main(String[] args) {
        int[][] massiveMassive = new int[3][3];
        int valueForFilling ;
        int valueForFillingRightD;
        int valueForFillingLeftD;

      WorkWithMassive fillingMassive2Value= new WorkWithMassive();
      createMatrix(4);
      fillingOfRightDiagonal(massiveMassive,5);
      printMassive(massiveMassive);
      fillingOfLeftDiagonal(massiveMassive,1);
      printMassive(massiveMassive);

    }

}

