package Template;

public class Client {
    public static void main(String[] args){
        Account savingAccount = new SavingAccount();
        Account currentAccount = new CurrentAccount();
        Account salaryAccount = new SalaryAccount();

        System.out.println( savingAccount.taxCalculator() );
        System.out.println( currentAccount.taxCalculator() );
        System.out.println( salaryAccount.taxCalculator() );
    }
}
