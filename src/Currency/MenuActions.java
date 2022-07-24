package Currency;

public class MenuActions extends Menu {
    public static void printActionMenu(Currency workingCurrency){
        System.out.println();
        System.out.println("Choose action for "+workingCurrency.getCurrencyName()+":");
        System.out.println("1: Change currency to grn");
        System.out.println("2: Change grn to currency");
        System.out.println("3: Change kurs nbu");
        System.out.println("4: Show kurs nbu");
        System.out.println("100: exit");
        System.out.println("Your choise");
    }

    public static void doActionsWithCurrency(Currency workingCurrency, int menuNumber) {
        switch (menuNumber){
            case 1:
                System.out.println("Enter number "+workingCurrency.getCurrencyName()+":");
                double nunberOfCurrency=Menu.getDoubleFromConsole();
                workingCurrency.exchangeCurrencyToGrn(nunberOfCurrency);
                break;
            case 2:
                System.out.println("Enter number of GRN:");
                workingCurrency.exchangeGrnToCurrency(getDoubleFromConsole());
                break;
            case 3:
                System.out.println("Enter new Kurs NBU for currency "+workingCurrency.getCurrencyName());
                workingCurrency.setKursNBU(getDoubleFromConsole());
                break;
            case 4:
                System.out.println(String.format("Kurs NBU for %s is %s",workingCurrency.getCurrencyName()
                        ,workingCurrency.getKursNBU()));
                break;
            default:
                System.out.println("No Action with number "+menuNumber);
        }
    }
}
