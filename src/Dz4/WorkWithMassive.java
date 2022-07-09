package Dz4;

public class WorkWithMassive {
    public static int[][] fillingMassive(int[][] massiveMassive, int valueForFilling) {
        for (int i = 0; i < massiveMassive.length; i++) {
            for (int j = 0; j < massiveMassive[i].length; j++) {
                if (massiveMassive[i][j] != valueForFilling) {
                    massiveMassive[i][j] = valueForFilling;
                }
            }
            System.out.println();
            {
            }
        }
        return massiveMassive;
    }

    public static int[][] fillingOfRightDiagonal(int[][] massiveMassive, int valueForFilling) {
        for (int i = 0; i < massiveMassive.length; i++) {
            for (int j = 0; j < massiveMassive[i].length; j++) {
                if (massiveMassive[i].length == massiveMassive[j].length) {
                    massiveMassive[0][0] = massiveMassive[1][1] = massiveMassive[2][2] = valueForFilling;
                } else {
                    System.out.println("Matrix is not squard");
                }

            }


        }
        System.out.println();

        return massiveMassive;
    }

    public static void printMassive(int[][] massiveMassive) {
        for (int[] ints : massiveMassive) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] fillingOfLeftDiagonal(int[][] massiveMassive, int valueForFilling) {
        for (int i = 0; i < massiveMassive.length; i++) {
            for (int j = 0; j < massiveMassive[i].length; j++) {
                if (massiveMassive[i].length == massiveMassive[j].length) {
                    massiveMassive[2][0] = massiveMassive[1][1] = massiveMassive[0][2] = valueForFilling;
                } else {

                }

            }

        }
        System.out.println();
        return massiveMassive;
    }
}

