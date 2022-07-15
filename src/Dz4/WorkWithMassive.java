package Dz4;

public class WorkWithMassive {
    public static boolean isMatrixSquard(int[][] massiveMassive) {
        for (int i = 0; i < massiveMassive.length; i++) {
            if (massiveMassive.length != massiveMassive[i].length) {
                System.out.println("Matrix is not squard");
                return false;
            }

        }
        System.out.println("Matrix is squard");
        return true;
    }
    public static int[][] createMatrix(int valueForFilling){
        int[][] massiveMassive = new int[3][3];
        for (int i = 0; i < massiveMassive.length; i++) {
            for (int j = 0; j < massiveMassive.length; j++) {
                if (massiveMassive[i][j] != valueForFilling) {
                    massiveMassive[i][j] = valueForFilling;
                }
            }
        }
        printMassive(massiveMassive);
        return massiveMassive;
    }


    public static int[][] fillingOfRightDiagonal(int[][] massiveMassive, int valueForFillingRight) {
        if(isMatrixSquard(massiveMassive)==true) {
            for (int i = 0; i < massiveMassive.length; i++) {
                for (int j = 0; j < massiveMassive.length; j++) {
                    if (i == j) {
                        massiveMassive[i][j] =  valueForFillingRight;
                    }
                }
                System.out.println();
                System.out.println();
                {
                }
            }
        }
        return massiveMassive;
    }

    public static void printMassive(int[][] massiveMassive) {
        for (int[] ints : massiveMassive) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] fillingOfLeftDiagonal(int[][] massiveMassive, int valueForFillingLeftD) {
        for (int i = 0; i < massiveMassive.length; i++) {
            for (int j = 0; j < massiveMassive.length; j++) {
                massiveMassive[i][massiveMassive.length - 1 - i] = valueForFillingLeftD;
            }
        }

        return massiveMassive;
    }
}

