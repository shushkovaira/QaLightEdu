package DZ5;

import java.util.ArrayList;

public class MainClassWorkWithLists {
    public static void main(String[] args) {
        ArrayList<Integer> ourListInteger = new ArrayList<>();

        ourListInteger.add(22);
        ourListInteger.add(66);
        ourListInteger.add(33);
        ourListInteger.add(11);
        ourListInteger.add(100);

        findMaxElement(ourListInteger);

        reverseElementsInList(ourListInteger);

    }

    public static int findMaxElement(ArrayList<Integer> ourListInteger) {
        int ourListIntegerMaxElement = ourListInteger.get(0);
        for (int i = 1; i < ourListInteger.size(); i++) {
            if (ourListInteger.get(i) > ourListInteger.get(0)) {
                ourListIntegerMaxElement = ourListInteger.get(i);
            }
        }
        System.out.println(ourListIntegerMaxElement);
        {
            return ourListIntegerMaxElement;
        }

    }

    public static ArrayList<Integer> reverseElementsInList(ArrayList<Integer> ourListInteger) {
        ArrayList<Integer> revArrayList = new ArrayList<>();

        for (int i = 0; i < ourListInteger.size(); i++) {

            revArrayList.add(ourListInteger.get(ourListInteger.size() - i - 1));
        }
        System.out.println(revArrayList);
        {
            return revArrayList;
        }
    }

}










