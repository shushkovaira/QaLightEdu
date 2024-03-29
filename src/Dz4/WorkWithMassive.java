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

    public static int[][] createMatrix(int valueForFilling, int lenght, int wight) {

        int[][] massiveMassive = new int[lenght][wight];
        if (massiveMassive == null) {
            try {
            } catch (Exception e) {
                System.out.println("Cannot process the array because size is null");
                e.printStackTrace();
            }
        }
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


    public static int[][] fillingOfRightDiagonal(int[][] newMassive, int valueForFillingRight) {
        if (isMatrixSquard(newMassive) == true) {
            for (int i = 0; i < newMassive.length; i++) {
                for (int j = 0; j < newMassive.length; j++) {
                    if (i == j) {
                        newMassive[i][j] = valueForFillingRight;
                    }
                    System.out.println();
                }

            }
        }
        printMassive(newMassive);
        return newMassive;
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

    public static int[][] fillingOfLeftDiagonal(int[][] newMassive, int valueForFillingLeftD) {
        if (isMatrixSquard(newMassive) == true) {
            for (int i = 0; i < newMassive.length; i++) {
                for (int j = 0; j < newMassive.length; j++) {
                    newMassive[i][newMassive.length - 1 - i] = valueForFillingLeftD;
                }
                System.out.println();
            }

        }
        printMassive(newMassive);
        return newMassive;
    }
    public static int[][] fillingBothdiagonal(int[][] newMassive,int valueForFillingRD,int valueForFillingLD){
        if (isMatrixSquard(newMassive) == true) {
            for (int i = 0; i < newMassive.length; i++) {
                for (int j = 0; j < newMassive.length; j++) {
                    if (i == j) {
                        newMassive[i][j] = valueForFillingRD;
                        newMassive[i][newMassive.length - 1 - i] = valueForFillingLD;
                    }
                    System.out.println();
                }
            }

        }
        printMassive(newMassive);
        return newMassive;
    }
}

