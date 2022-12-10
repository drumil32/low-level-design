package Template;

public class SalaryAccount extends Account{

    @Override
    public double estimatedTaxCalculator(double annualIncome) {
        return (annualIncome*0.15);
    }

    @Override
    public double incomeCalculator() {
        return 1000000000.0;
    }

    @Override
    public double taxDeductionCalculator(double estimatedTax) {
        return (estimatedTax*0.06);
    }
    
}
