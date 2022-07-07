package lesson3;

import java.util.Locale;

public class MainClassString {
    public static void main(String[] args) {
        String testString= " Test2";
        System.out.println("Size = "+testString.length());
        char[] testStringChar=testString.toCharArray();
        for (int i = 0; i < testStringChar.length; i++) {
            System.out.println(testStringChar[i]);

        }
        System.out.println("-----");
        System.out.println(testString.toUpperCase());
        System.out.println(testString.toLowerCase());
        System.out.println(testString);
        String newStringTest = testString.toLowerCase();
        System.out.println(newStringTest);
        System.out.println("-----");
        System.out.println(testString.substring(1,5));
        System.out.println("'"+testString.trim()+"'");
        String testString2 = new String(" Test2");
        if(testString.equals(testString2)){
            System.out.println("Eq");
        }else {
            System.out.println("Not Eq");
        }
        String testSplite = "test;Test2;Test3";
        System.out.println(testSplite.split(";")[1]);
        System.out.println(testSplite.replace(";",","));
        System.out.println(testSplite
                .trim()
                .toUpperCase()
                .split(";")[0].substring(0,4));
    }
}
