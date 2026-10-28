package propertyManagement;

public class Plot {
	private Plot plot;
	private int x;
	private int y;          //attributes
	private int depth;
	private int width;
	
	 public Plot(int x, int y, int width, int depth) {
	        this.x = x;
	        this.y = y;
	        this.width = width;                        //constructor
	        this.depth = depth;
	    }
	
//getters 		
	 public Plot getPlot() {
		    return plot;
		}
	public int getX() {
			return x;
	}
	
	public int getY() {
			return y;
	}
		
	public int getWidth() {
		return width;
	}
	
	public int getDepth(){
	return depth;
	}
	
	//setters
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
		
	}
    public void setWidth(int width) {
	this.width=width;
}

    public void setDeph(int depth) {
	this.depth=depth;
    }

  
//overlaps
    public boolean overlaps(Plot other) {

        // Calculate the edges of this plot
        int rightEdge = this.x + this.width;
        int bottomEdge = this.y + this.depth;

        // Calculate the edges of the other plot
        int otherRightEdge = other.x + other.width;
        int otherBottomEdge = other.y + other.depth;

        // Check if the plots are separated horizontally
        if (rightEdge <= other.x || otherRightEdge <= this.x) {
            return false;
        }

        // Check if the plots are separated vertically
        if (bottomEdge <= other.y || otherBottomEdge <= this.y) {
            return false;
        }

        // If they are not separated, they overlap
        return true;
    }
 
 public boolean encompasses(Plot other) {
	 
	 int rightEdge = this.x + this.width;
	    int leftEdge = this.x;            //management plots    
	    int topEdge= this.y;
	    int bottomEdge=this.y +this.depth;
	    int otherplotrightEdge= other.getX()+ other.getWidth();
	    int otherplotleftEdge= other.getX();
	    int otherplotBottomEdge= other.getY()+ other.getDepth(); //property bottom edge 
	    int otherplotTopEdge= other.getY();
	    //encompasses means to see if plots fit inside not ove
if(otherplotrightEdge> rightEdge) {
	    	return false;
	    }

if(otherplotleftEdge < leftEdge) {
	return false;
}
	if(otherplotTopEdge<topEdge) {
		return false;
	}
	if(bottomEdge< otherplotBottomEdge) {
		return false;
	}
	
	else {
		return true;
	}
 }
//this= managemen tplot, other= plot whos method is running 
	    

 //- this.x is the x-coordinate of the plot whose method you're calling — in this case, imagine it's the management plot.
	 //- other.getX() gets the x-coordinate of the other plot you're checking — for example, a property's plot.
	@Override
	
	public String toString() {
	    return x + "," + y + "," + width + "," + depth;
	}
 
 }
 
	    

 

