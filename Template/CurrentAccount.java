package Template;

public class CurrentAccount extends Account{

    @Override
    public double incomeCalculator() {
        return 1000000;
    }

    @Override
    public double estimatedTaxCalculator(double annualIncome) {
        return (annualIncome*0.05);
    }

    @Override
    public double taxDeductionCalculator(double estimatedTax) {
        return (estimatedTax*0.02);
    }
    
}
