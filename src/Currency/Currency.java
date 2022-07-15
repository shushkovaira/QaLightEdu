package Currency;

 abstract class Currency {
    private double kursNBU;
    private double marga = 1.1;

    public Currency(double kursNBU) {
        this.kursNBU = kursNBU;

    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }
    public double getKursBuy(){
        return kursNBU*marga;
    }
    public double getKursSell(){
        return kursNBU/marga;
    }
    abstract String getCurrencyName();

    public double exchangeGrnToCurrency(double numberOfGrn){
        double tempResult = numberOfGrn/ getKursBuy();
        System.out.println(
                String.format("For %s Grn you get %s %s by kurs %s (marga %s)"
                        ,numberOfGrn,tempResult,getCurrencyName(),getKursBuy(),marga));
        return tempResult;
    }
    public double exchangeCurrencyToGrn(double numberOfCurrency){
        double tempResult=numberOfCurrency*getKursSell();
        System.out.println(String.format("For %s %s you get %s Grn by kurs %s (marga %s)"
                ,numberOfCurrency,getCurrencyName(),tempResult,getKursSell(),marga));
        return tempResult;
    }
}
