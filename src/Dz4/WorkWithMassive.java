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
            for (int j = 0; j < massiveMassive.length; j++) {
                if (i == j) {
                    massiveMassive[i][j] = valueForFilling;
                } else {
                    return massiveMassive;
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
            for (int j = 0; j < massiveMassive.length; j++) {
                    massiveMassive[massiveMassive.length-1][0] = massiveMassive[0][massiveMassive.length-1] = valueForFilling;
                }
            }
        System.out.println(massiveMassive);
        return massiveMassive;
    }
}

