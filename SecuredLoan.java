

public class SecuredLoan extends Loan
{
	public SecuredLoan(String loanType, double loanAmount, int tenure, double roi, double salary, String loanDisbursalDate, int repaymentFrequency) {
		super(loanType, loanAmount, tenure, roi, salary, loanDisbursalDate, repaymentFrequency);
	}

	public SecuredLoan() {

	}

	public void calculateLoanToValueRatio()
	{
		HomeLoan h = new HomeLoan("amar",20*20,20000);
		h.homeLoneLTV();
		VehicleLoan v = new VehicleLoan("sedan","2015","Suzuki",2015,30000);
		v.vehicleLoneLTV();;
	}

}
