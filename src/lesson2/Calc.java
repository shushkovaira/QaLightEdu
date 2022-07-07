package lesson2;

public class Calc {
    public static int division(int dilene, int dilnuk) {
        try {
            int result = dilene / dilnuk;

            return result;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException-dilnuk zero is impossible " +e.getMessage());
            return 999;

        }catch (NumberFormatException e){
            System.out.println("NumberFormatException "+e.getMessage());
            return 888;
        }
        finally {
            System.out.println("Finally");
        }

    }

    public static double division(double dDilene, double dDilnuk) {
        try {
            double result = dDilene / dDilene;
            return result;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException-dilnuk zero is impossible " +e.getMessage());
            return 999;

        }catch (NumberFormatException e){
            System.out.println("NumberFormatException "+e.getMessage());
            return 888;
        }
        finally {
            System.out.println("Finally");
        }
    }
}

