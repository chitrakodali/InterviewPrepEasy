import java.util.ArrayList;
import java.util.List;

public class TaxCalculator {

    static List<TaxRate> rateList = new ArrayList<>();

    public TaxCalculator() {}

    public static void main(String[] args) {

        TaxRate rate1 = new TaxRate(0, 10000, 5);
        TaxRate rate2 = new TaxRate(10000, 25000, 10);
        TaxRate rate3 = new TaxRate(25000, 75000, 12);
        TaxRate rate4 = new TaxRate(75000, 150000, 15);
        TaxRate rate5 = new TaxRate(150000, 0, 20);

        rateList.add(rate1);
        rateList.add(rate2);
        rateList.add(rate3);
        rateList.add(rate4);
        rateList.add(rate5);

        // calculate salary
        double salary = 160000;
        double taxValue = computeTax(salary);
        System.out.println("Tax for Salary " + salary + " is " + taxValue);

    }

    private static double computeTax(double salary) {
        double tax = 0;
        double sum = 0;
        for (int i = 0; i < rateList.size(); i++) {
            TaxRate rate = rateList.get(i);
            if ((salary <= rate.getMax() || rate.getMax() == 0) && salary > rate.getMin()) {
                tax = (salary-rate.getMin()) * rate.getRate()/100;
                for (int j=0; j<i; j++) {
                    TaxRate inner = rateList.get(j);
                    sum = sum + (inner.getMax()-inner.getMin()) * inner.getRate()/100;
                }
                tax += sum;
                break;
            }
        }
        return tax;
    }

}

class TaxRate {

    private int min;
    private int max;
    private double rate;

    public TaxRate(int min, int max, double rate){
        this.min = min;
        this.max = max;
        this.rate = rate;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}








