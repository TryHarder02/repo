

	public class Procedure {

	    String nameOfProcedure;
	    String dateOfProcedure;
	    String Practitioner;
	    double Charge;

	    public Procedure() {
	    }

	    public Procedure(String nameOfProcedure, String dateOfProcedure) {
	        this.nameOfProcedure = nameOfProcedure;
	        this.dateOfProcedure = dateOfProcedure;
	    }

	    public Procedure(String nameOfProcedure, String dateOfProcedure,
	                     String Practitioner, double Charge) {
	        this.nameOfProcedure = nameOfProcedure;
	        this.dateOfProcedure = dateOfProcedure;
	        this.Practitioner = Practitioner;
	        this.Charge = Charge;
	    }

	    public String getProcedure() {
	        return nameOfProcedure;
	    }

	    public String getdateOfProcedure() {
	        return dateOfProcedure;
	    }

	    public double getCharge() {
	        return Charge;
	    }

	    public String getPractitioner() {
	        return Practitioner;
	    }

	    public void setnameOfProcedure(String nameOfProcedure) {
	        this.nameOfProcedure = nameOfProcedure;
	    }

	    public void setPractioner(String Practitioner) {
	        this.Practitioner = Practitioner;
	    }

	    public void setdateOfProcedure(String dateOfProcedure) {
	        this.dateOfProcedure = dateOfProcedure;
	    }

	    public void setCharges(double Charge) {
	        this.Charge = Charge;
	    }

	    @Override
	    public String toString() {
	        return "Procedure Name: " + nameOfProcedure
	                + "\nDate: " + dateOfProcedure
	                + "\nPractitioner: " + Practitioner
	                + "\nCharge: $" + Charge;
	    }
	}

