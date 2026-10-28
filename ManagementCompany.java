package propertyManagement;

public class ManagementCompany {

	
	private String name;
	private String taxId;
	private double mgmtFeePercentage;
	public int MAX_PROPERTY= 5;
	private int MGMT_WIDTH=10;
	private int MGMT_DEPH=10;
	private Plot plot;
	private int numberOfProperties;
	
	Property[] property;
	
	public ManagementCompany(String name, String taxId, double mgmtFeePercentage, int MAX_PROPERTY, int MGMT_WIDTH, int MGMT_DEPH, Plot plot) {
	this.name=name;
	this.taxId=taxId;
	this.mgmtFeePercentage=mgmtFeePercentage;
	this.MAX_PROPERTY=MAX_PROPERTY;
	this.MGMT_WIDTH=MGMT_WIDTH;
	this.MGMT_DEPH=MGMT_DEPH;
	this.plot=plot;

	this.property= new Property[MAX_PROPERTY];
	
	}
	
	

public ManagementCompany(String name, String taxId, double mgmtFeePercentage) {

    this.name = name;

    this.taxId = taxId;

    this.mgmtFeePercentage = mgmtFeePercentage;

    this.property = new Property[MAX_PROPERTY];
    this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPH);

}

	//getters 
	public String getManagementCompanyName() {
		return name;
		
	}
	public String getName() {
	    return name;
	}
	
	public Plot getPlot() {
	    return plot;
	}
	public String getTaxId() {
		return taxId;
	}
	
	public double getMgmtFeePercentage() {
		return mgmtFeePercentage;
	}
public int getMAX_PROPERTY() {
	return MAX_PROPERTY;
}

public int getMGMT_WIDTH() {
	return MGMT_WIDTH;
}
public int getMGMT_DEPH() {
	return MGMT_DEPH;
}

	//setters 
public void setName(String name) {
	this.name=name;
}
public void setTaxId(String taxId)	{
	this.taxId=taxId;
	
}
public void setMgmtFeePercentage(double mgmtFeePercentage)	{
	this.mgmtFeePercentage=mgmtFeePercentage;
	
}
public void setMAX_PROPERTY(int MAX_PROPERTY) {	
	this.MAX_PROPERTY=MAX_PROPERTY;
}
public void setMGMT_WIDTH	(int MGMT_WIDTH) {
	this.MGMT_WIDTH=MGMT_WIDTH;
}
	public void setMGMT_DEPH(int MGMT_DEPH) {
		this.MGMT_DEPH=MGMT_DEPH;
		
	}
	
	
	public int addProperty(Property newProperty) {
		
		if(numberOfProperties == property.length) {
			return -1;
		
	}
		if(newProperty == null) {
			return -2;
		}
		
		if(!plot.encompasses(newProperty.getPlot())){
			return -3;
		}
		
		for(int i=0;  i< numberOfProperties; i++) {
			if(newProperty.getPlot().overlaps(property[i].getPlot())) {
				return -4;
			}
		}
		
			property[numberOfProperties]=newProperty;
			numberOfProperties++;
			return numberOfProperties-1;
		}
	
		public double getTotalRent() {
			double totalRent=0;
			for(int i=0; i<numberOfProperties; i++) {
				totalRent+= property[i].getRentalAmount();
			}
			return totalRent;
		}
			
		public Property getHighestRentProperty() {
				Property highest=property[0];
				for(int i= 1; i < numberOfProperties;i++) {
					if(property[i].getRentalAmount()> highest.getRentalAmount()){
						highest = property[i];
					}}
				
					return highest;
				}
			
		
				
				public void removeLastProperty() {
					if(numberOfProperties==0) {
						return;
					}
					property[numberOfProperties-1]= null;
					numberOfProperties--;
			
		}
		
				public boolean isPropertyFull() {
					
					if(numberOfProperties==MAX_PROPERTY) {
						return true;
					}
					else {
						return false;
					}
					
				}
				
				public int getPropertiesCount() {
					return numberOfProperties;
				}
		
				public boolean isManagementFeeValid() {
					if(mgmtFeePercentage>=0 && mgmtFeePercentage<=100) {
						return true;
					}
					else {
						return false;
					}
				}
	

public String toString() {
    String result = "List of the properties for " + name
            + ", taxID: " + taxId + "\n"
            + "______________________________________________________\n";

    for (int i = 0; i < numberOfProperties; i++) {
        result += property[i].toString() + "\n";
    }

    result += "______________________________________________________\n"
            + "\n"
            + " total management Fee: "
            + String.format("%.2f", getTotalRent() * mgmtFeePercentage / 100);

    return result;
}

	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

