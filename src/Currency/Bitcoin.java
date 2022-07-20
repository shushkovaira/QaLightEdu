package Currency;

public class Bitcoin extends Currency implements IsCryptoCurrency {
    public Bitcoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Bitcoin";
    }

    @Override
    public boolean isCryptoCurr() {
        return true;
    }

    @Override
    public double exchangeCurrencyToGrn(double numberOfCurrency) {
        System.out.println("restriction of NBU");
        return numberOfCurrency;
    }
}

