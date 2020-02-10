import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Loan
{
	private int loanId;
	private String loanType;
	private double loanAmount;
	private int tenure;
	private double roi;
	private double salary;
	public  enum loanStatus{pending,approved,notapproved};
	private double emiPerMonth;
	private String loanDisbursalDate;
	private double maxEligibleLoanAmount;
	private int repaymentFrequency;

	public double getSalary() {
		return salary;
	}

	public int getLoanId() {
		return loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public double getRoi() {
		return roi;
	}

	public double getEmiPerMonth() {
		return emiPerMonth;
	}

	public String getLoanDisbursalDate() {
		return loanDisbursalDate;
	}

	public double getMaxEligibleLoanAmount() {
		return maxEligibleLoanAmount;
	}

	public int getRepaymentFrequency() {
		return repaymentFrequency;
	}

	public Loan(String loanType, double loanAmount, int tenure, double roi, double salary, String loanDisbursalDate, int repaymentFrequency) {
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.roi = roi;
		this.salary = salary;
		this.loanDisbursalDate = loanDisbursalDate;
		this.repaymentFrequency = repaymentFrequency;
	}

	public void calculateEmi()
	{
		double finalRoi = roi*0.01;
		// System.out.println(finalRoi);
		double roiandNoOfPayment = finalRoi/repaymentFrequency;

		double n= tenure*repaymentFrequency;
		double power = Math.pow((1+roiandNoOfPayment),n);
		emiPerMonth = loanAmount*(finalRoi/repaymentFrequency) /(1-1/power);


	}
	public void generateRepaymentSchedule() {


		double finalroi = roi * 0.01;
		double roiandNoOfPayment = finalroi / repaymentFrequency;
		double n = tenure * repaymentFrequency;
		double power = Math.pow((1 + roiandNoOfPayment), n);
		emiPerMonth = loanAmount * (finalroi / repaymentFrequency) / (1 - 1 / power);
		System.out.println("Monthly Installment is:" + emiPerMonth);
		double openingBalance = loanAmount;
		double principalComponent = 0;
		double interestComponent = 0;
		double installment = emiPerMonth;
		for (int i = 0; i <= n; i++) {


			openingBalance = openingBalance - principalComponent;
			interestComponent = openingBalance * (finalroi / 12);
			principalComponent = installment - interestComponent;
			System.out.println("Installment No:" + "  " + i + "  " + "Opening Balance:" + "  " + openingBalance + "  " + "Principal Component:" + "  " + principalComponent + "  " + "IntersetComponent:" + "  " + interestComponent + "  " + "Inatallment:" + "  " + installment);

		}
	}
	public void calculateLatePenality()
	{
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(loanDisbursalDate, formatter);

		long diff = ChronoUnit.DAYS.between(date,today);
		double penalty = diff*50;
		System.out.println("Penalty is:" +penalty);
	}


	public void calculateEligibleLoanAmount()
	{
		double E = (salary*0.8)/2; //Max Eligible EMI
		double effectiveroi = roi*0.01;
		double power = Math.pow((1+effectiveroi),tenure);
		maxEligibleLoanAmount = (E*(power)-1)/effectiveroi*power;
		System.out.println("MaX Eligible Loan Amount:" + maxEligibleLoanAmount);
	}
	
	

}
