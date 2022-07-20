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
    public double exchangeGrnToCurrency(double numberOfGrn) {
        System.out.println("restriction of NBU");
        return numberOfGrn;
    }


}

