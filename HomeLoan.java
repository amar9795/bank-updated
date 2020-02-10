
public class HomeLoan extends SecuredLoan
{
	private String buildername;
	private int propertySize;
	private double propertyValue;

    public String getBuildername() {
        return buildername;
    }

    public int getPropertySize() {
        return propertySize;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public HomeLoan(String buildername, int propertySize, double propertyValue) {
		super();
		this.buildername = buildername;
		this.propertySize = propertySize;
		this.propertyValue = propertyValue;
	}
    public void homeLoneLTV(){
        double LTV = getLoanAmount()/propertyValue;
        System.out.println("Home Lone LTV is:" + LTV);
    }



}