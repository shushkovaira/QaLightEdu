package Currency;

public class MenuCurrency extends Menu {
    public static void printCurrencyMenu(){
        System.out.println("");
        System.out.println("Choose currency");
        System.out.println("1.dollar");
        System.out.println("2.euro");
        System.out.println("3.us som");
        System.out.println("Enter your choice");

    }

    public static Currency setCurrency(int currencyNumber) {
        Currency tempCurrency;
        switch (currencyNumber){
            case 1:
                System.out.println("dollar");
                tempCurrency=ListOfCurrency.getGetCurrencyHashMap().get("USD");
                break;
            case 2:
                System.out.println("euro");
                tempCurrency=ListOfCurrency.getGetCurrencyHashMap().get("EUR");
                break;
            case 3:
                System.out.println("uz som");
                tempCurrency=ListOfCurrency.getGetCurrencyHashMap().get("Uz Som");
                break;
            default:
                System.out.println("default currency: dollar");
                tempCurrency=ListOfCurrency.getGetCurrencyHashMap().get("USD");
        }
        return tempCurrency;
    }
}
