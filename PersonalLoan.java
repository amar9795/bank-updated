
public class PersonalLoan extends UnsecuredLoan
{

	private String qualification;
	private double workExperience;
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public double getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(double workExperience) {
		this.workExperience = workExperience;
	}
	public PersonalLoan() {
		// TODO Auto-generated constructor stub
	}
	public PersonalLoan(String qualification, double workExperience) {
		super();
		this.qualification = qualification;
		this.workExperience = workExperience;
	}
	
}
