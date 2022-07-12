package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<String> ourList = new ArrayList();
        System.out.println(ourList);

        ourList.add("Test1");
        System.out.println(ourList);
        ourList.add("Test2");
        ourList.add("Test3");
        System.out.println(ourList);
        ourList.add("");
        ourList.add("Test5");
        System.out.println(ourList);
        System.out.println(ourList.get(4));
        System.out.println(ourList.get(4)+ " "+ourList.get(2));
        ourList.remove(1);
        System.out.println(ourList);
        for (int i = 0; i < ourList.size(); i++) {
            System.out.println(i+1+" "+ourList.get(i));
        }
        for (String element:ourList) {
            System.out.println(element);
        }
        ourList.add(3,"Test4");
        System.out.println(ourList);
        System.out.println("_________");

        ArrayList<Integer>ourListInteger=new ArrayList<>();
        ourListInteger.add(22);
        ourListInteger.add(66);
        ourListInteger.add(33);
        ourListInteger.add(11);
        System.out.println(ourListInteger);
        System.out.println(Collections.max(ourListInteger));
        Collections.sort(ourListInteger);
        System.out.println(ourListInteger);
        Collections.reverse(ourListInteger);
        System.out.println(ourListInteger);

        System.out.println("----ListList----");
        ArrayList<ArrayList<String>> ourListList=new ArrayList<>();
        ourListList.add(new ArrayList<>());
        ourListList.get(0).add("Test11");
        ourListList.get(0).add("Test12");
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        ourListList.get(1).add("Test21");
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        ourListList.add(new ArrayList<>());
        ourListList.get(3).add("Test31");
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        ourListList.get(0).add(2,"Test13");
        System.out.println(ourListList);

        System.out.println("___________");
        ArrayList<String> list =new ArrayList<>();
        list.add("element1");
        list.add("element2");

        System.out.println(list);
        ourListList.add(list);
        System.out.println(ourListList);



        System.out.println("------The End------");
    }
}
