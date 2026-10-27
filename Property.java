


package propertyManagement;

public class Property {
	private Plot plot;
	private String name;
	private String city;
	private String owner;
	private double rentalAmount;
	
public Property(String name, String city, String owner, double rentalAmount, Plot plot) {
	this.name=name;
	this.city=city;           //constructor
	this.owner=owner;
	this.rentalAmount=rentalAmount;
	this.plot=plot;
	
}
public Property(String name, String city, double rentalAmount, String owner) {
    this.name = name;
    this.city = city;
    this.rentalAmount = rentalAmount;
    this.owner = owner;
    this.plot = new Plot(0,0,1,1);
    
}

public Property(String name, String city, double rentalAmount,
        String owner, int x, int y, int width, int depth) {
this.name = name;
this.city = city;
this.rentalAmount = rentalAmount;
this.owner = owner;
this.plot = new Plot(x, y, width, depth);
}



//setters 

public void setPlot(Plot plot) {
	this.plot= plot;
}
public void setName(String name) {
	this.name=name;
}
public void setCity(String city ) {
	this.city=city;
}
	
public void setOwner(String owner) {	
this.owner=owner;
}
	public void setRentalAmount(double rentalAmount)
	{
		this.rentalAmount=rentalAmount;
	}
	
//getters 
	public String getName() {
		return name;
	}
	
	public String getPropertyName() {
	    return name;
	}
	public String getCity() {
		return city;
		
		
	}
	public String getOwner() {
		return owner;
	}
public double getRentalAmount() {
	return rentalAmount;
}
public double getRentAmount() {
    return rentalAmount;
}
public Plot getPlot() {
	return plot;
}
	@Override
public String toString(){
	
	return name+ "," + city + "," + owner + "," + rentalAmount;
}
	
	
	

}
