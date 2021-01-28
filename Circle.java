//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {
	

	private double x;  // declare the private double instance radius
    private double y;  // declare the private double instance  x
    private double radius;  // declare the private double instance  y
	     
	    
	
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getCenter_x() {
		
		return x; 	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getCenter_y() {
		
		return y; 
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		return radius;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setCenter_x(double center_x) {
		
		this.x = center_x;	
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setCenter_y(double center_y) {
		
		this.y = center_y;
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius_r) {
		
		this.radius= radius_r;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter(double radius_r) {
		
		return (2 * radius_r);	
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area(double radius_r) {
		
		return (Math.PI * (radius_r * radius_r));	
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter(double radius_r) {
		
		return (2 * Math.PI * radius_r);	
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle(double radius_r, double x, double y) {
		
		if ((radius_r == 1.0) && (x == 0.0) && (y == 0.0)) {
			return true;
		}	
		else {
			return false;
		}
		
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		return ("center: (" + x + "," + y + ")" + "\nradius: " + radius); 
	}
	

	//--------------------------------------------------------
	// equals - retrun a boolean value on wheather or not if both circles have the same cetners, AND the same radius or not
	//--------------------------------------------------------
	
	
	public boolean equals(Circle anotherCircle) {
		if ((this.getRadius() == anotherCircle.getRadius()) && (this.getCenter_x() == anotherCircle.getCenter_x()) && (this.getCenter_y() == anotherCircle.getCenter_y())) {
			return true;
		}
		else {
			return false;
		}
		
	}

	// --------------------------------------------------------
	// isConcentric - returns true if the radius' of both circles are different from one another yet both of thier centers are the same 
	//---------------------------------------------------------
	
	public boolean isConcentric(Circle anotherCircle) {
		if ((this.getRadius() != anotherCircle.getRadius()) && (this.getCenter_x() == anotherCircle.getCenter_x()) && (this.getCenter_y() == anotherCircle.getCenter_y())) {
			return true;
		} 
		else {
			return false;
		}
	}

	// --------------------------------------------------------
	// distance - returns true if the square root of both radius of both circles squared plus the x axis postions of both circles minus eachother 
	//---------------------------------------------------------

	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(this.getCenter_y() - anotherCircle.getCenter_y(), 2) + Math.pow(this.getCenter_x() - anotherCircle.getCenter_x(), 2));
	}


	// --------------------------------------------------------
	// intersects - returns true if distance between the two circles is less than the radius of both circles subtracted from eachother 
	//---------------------------------------------------------


	public boolean intersects(Circle anotherCircle) {
		if (Math.sqrt(Math.pow(this.getCenter_y() - anotherCircle.getCenter_y(), 2) + Math.pow(this.getCenter_x() - anotherCircle.getCenter_x(), 2)) < (this.getRadius() - anotherCircle.getRadius())) {
			return true;
		}
		else {
			return false;
		}
	}
}

