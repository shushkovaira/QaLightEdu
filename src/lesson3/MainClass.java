package lesson3;

public class MainClass {
    public static void main(String[] args) {
        int[][] massiveMassive = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11}};
        System.out.println("Rows " + massiveMassive.length);
        System.out.println("Line2 " + massiveMassive[1].length);
        System.out.println("Element" + massiveMassive[2][2]);
//        System.out.println("-----");
        for (int i = 0; i < massiveMassive.length; i++) {
            for (int j = 0; j < massiveMassive[i].length; j++) {
                System.out.print(massiveMassive[i][j] + " ");
            }
            System.out.println();
        }
 //       System.out.println("-----");
        printMassive(massiveMassive);

        int[][] massiveMassive2 = new int[5][5];
        for (int i = 0; i < massiveMassive2.length; i++) {
            for (int j = 0; j < massiveMassive2[i].length; j++) {
                massiveMassive2[i][j] = 5;


            }
        }
        System.out.println("-----");
        printMassive(massiveMassive2);

    }

    private static void printMassive(int[][] massiveMassive) {
        for (int i = 0; i < massiveMassive.length; i++) {
            for (int j = 0; j < massiveMassive[i].length; j++) {
                System.out.print(massiveMassive[i][j] + " ");
            }
            System.out.println();
        }


    }

}

