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

        if (temp1.startsWith("T")||temp1.startsWith("t"))   {
            System.out.println("The first char is T");
        }

        System.out.println("4)");
        System.out.println(temp1.replaceFirst("s","y"));

        }

    }


