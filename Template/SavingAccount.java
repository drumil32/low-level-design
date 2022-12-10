package Template;

public class SavingAccount extends Account{

    @Override
    public double estimatedTaxCalculator(double annualIncome) {
        return (annualIncome*0.10);
    }

    @Override
    public double incomeCalculator() {
        return 1000000;
    }

    @Override
    public double taxDeductionCalculator(double estimatedTax) {
        return (estimatedTax*0.0);
    }
    
}
