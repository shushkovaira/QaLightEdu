package Dz4;

public class MainClassWorkWithString {
    public static void main(String[] args) {
        String temp = " Test_String ";
        System.out.println("1)");
        System.out.println("'" + temp.trim() + "'");
        String temp1 = temp.trim();
        System.out.println("2)");
        System.out.println(temp.substring(0, 5));
        System.out.println("3)");

        char[] testStringChar1 = temp1.toCharArray();
        for (int i = 0; i < testStringChar1.length; i++) {
        }
        if (testStringChar1[0] == 'T' || testStringChar1[0] == 't') {
            System.out.println("The first char is T");
        }
        System.out.println("4)");
        System.out.println(temp1.replace("s","y"));

        }

    }


