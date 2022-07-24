package Dz4;

import static Dz4.WorkWithMassive.*;

public class MainClassWorkWithMatrix {
    public static void main(String[] args) {
        int[][] massiveMassive = new int [0][0];
        int valueForFilling ;
        int valueForFillingRightD;
        int valueForFillingLeftD;

      WorkWithMassive fillingMassive2Value= new WorkWithMassive();
      fillingMassive2Value.createMatrix(4,5,5);

      int[][] newMassive=createMatrix(4,5,5);

      fillingOfRightDiagonal(newMassive,1);
      printMassive(newMassive);

      fillingOfLeftDiagonal(newMassive,6);
      printMassive(newMassive);

    }

}

