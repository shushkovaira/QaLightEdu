package Currency;

public class MainClass {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(36);
        System.out.println("Dollar " + dollar.getKursNBU());
        dollar.setKursNBU(36.5);
        System.out.println("New kurs = " + dollar.getKursNBU());
        dollar.exchangeGrnToCurrency(4015);
        dollar.exchangeCurrencyToGrn(200);
        dollar.setMarga(1.15);
        dollar.exchangeGrnToCurrency(4015);
        dollar.exchangeCurrencyToGrn(200);

        Euro euro = new Euro(38);
        euro.exchangeCurrencyToGrn(1000);

        Bitcoin bitcoin = new Bitcoin(20000);
        bitcoin.exchangeCurrencyToGrn(1);
    }
}
