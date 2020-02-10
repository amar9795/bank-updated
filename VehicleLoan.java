

public class VehicleLoan extends SecuredLoan
{
	private String vehicleCategory;
	private String vehicleModelNo;
	private String manufacturer;
	private int yearOfmanufacture;
	private double assetValue;

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public String getVehicleModelNo() {
        return vehicleModelNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfmanufacture() {
        return yearOfmanufacture;
    }

    public double getAssetValue() {
        return assetValue;
    }

    public VehicleLoan(String vehicleCategory, String vehicleModelNo, String manufacturer, int yearOfmanufacture,
                       double assetValue) {
		super();
		this.vehicleCategory = vehicleCategory;
		this.vehicleModelNo = vehicleModelNo;
		this.manufacturer = manufacturer;
		this.yearOfmanufacture = yearOfmanufacture;
		this.assetValue = assetValue;
	}
public void vehicleLoneLTV(){
	    double LTV = getLoanAmount()/assetValue;
    System.out.println("Vehicle Lone LTV is:" + LTV);
}

	

}
