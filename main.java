import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Loan l = new Loan("abc",10000, 8, 10.0, 50000,  "02/07/2020",12);
        SecuredLoan s = new SecuredLoan();
        l.calculateEmi();
        l.generateRepaymentSchedule();
        l.calculateLatePenality();
        l.calculateEligibleLoanAmount();
        s.calculateLoanToValueRatio();;



    }
}
