package lesson2;

public class WorkWithMassive {
    public void analyzwMassive(int[] massive, int valueForComparing) {
        for (int i = 0; i < massive.length; i++) {

            if (massive[i] < valueForComparing) {
                System.out.println(massive[i] + " Value less than " + valueForComparing);
            } else if (massive[i] == valueForComparing) {
                System.out.println(massive[i] + " Value is  equal " + valueForComparing);
            } else {
                System.out.println(massive[i]+" Value more than " + valueForComparing);
            }

        }
    }
    public static int[][] fillingMassive(int[][]massiveMassive,int valueForFilling) {
        for (int i = 0; i < massiveMassive.length; i++) {
            for (int j = 0; j < massiveMassive[i].length; j++) {
                if (massiveMassive[i][j] != valueForFilling) {
                    System.out.print(massiveMassive[i][j] == valueForFilling);
            }


            }
            System.out.println(); {



    }
    }
       return massiveMassive;
}
}


