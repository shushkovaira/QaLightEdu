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
}

