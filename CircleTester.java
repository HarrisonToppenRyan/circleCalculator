//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
public class CircleTester{
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setCenter_x(0.0);
		circle1.setCenter_y(0.0);
		circle1.setRadius(2);
		circle2.setCenter_x(2.0);
		circle2.setCenter_y(1.0);
		circle2.setRadius(1);
		System.out.println("circle1 = "+circle1);
		System.out.println("circle2 = "+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setCenter_x(-3.0);
		circle1.setCenter_y(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		
		System.out.println("circle1 = "+circle1);

      
		
		// set the circle2 radius to 5.3
		circle2.setRadius(-5.3);
      
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2 = "+circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1 diameter, area, perimeter: = "+ circle1.diameter(1.0) + ", " +  circle1.area(1.0) + ", " + circle1.perimeter(1.0));
		
		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2 diameter, area, perimeter: = "+ circle2.diameter(-5.3) + ", " +  circle2.area(-5.3) + ", " + circle2.perimeter(-5.3));
		
		// display whether circle1 is a unit circle
		System.out.println(circle1.isUnitCircle(2.0, 0.0, 0.0));
		
		// display whether circle2 is a unit circle
		System.out.println(circle2.isUnitCircle(-5.3, 2.0, 1.0));
		
		// your additional tests should be placed below here
		// equals tests
		// test #1
		System.out.println(circle1.equals(circle2));
		// test #2
		circle1.setCenter_x(2.0);
		circle1.setCenter_y(2.0);
		circle1.setRadius(2);
		circle2.setCenter_x(2.0);
		circle2.setCenter_y(2.0);
		circle2.setRadius(2);
		System.out.println(circle1.equals(circle2));
		// test #3
		circle1.setCenter_x(1.0);
		circle1.setCenter_y(2.0);
		circle1.setRadius(2);
		circle2.setCenter_x(2.0);
		circle2.setCenter_y(2.0);
		circle2.setRadius(2);
		System.out.println(circle1.equals(circle2));

		// isConcentric tests
		// test # 1

		System.out.println(circle1.isConcentric(circle2));
		
		
		// test #2 
		circle1.setCenter_x(2.0);
		circle1.setCenter_y(2.0);
		circle1.setRadius(2);
		circle2.setCenter_x(2.0);
		circle2.setCenter_y(2.0);
		circle2.setRadius(2);
		System.out.println(circle1.isConcentric(circle2));

		// test #3
		circle1.setCenter_x(2.0);
		circle1.setCenter_y(2.0);
		circle1.setRadius(3);
		circle2.setCenter_x(2.0);
		circle2.setCenter_y(2.0);
		circle2.setRadius(2);
		System.out.println(circle1.isConcentric(circle2));

		// distance tests
		// test #1 
		System.out.println(circle1.distance(circle2));

		// test #2 

		circle1.setCenter_x(5.0);
		circle1.setCenter_y(3.0);
		circle1.setRadius(6);
		circle2.setCenter_x(4.0);
		circle2.setCenter_y(7.0);
		circle2.setRadius(7);
		System.out.println(circle1.distance(circle2));

		// test #3

		circle1.setCenter_x(19.0);
		circle1.setCenter_y(5473.0);
		circle1.setRadius(8);
		circle2.setCenter_x(78.65);
		circle2.setCenter_y(85.876);
		circle2.setRadius(14);
		System.out.println(circle1.distance(circle2));

		// intersects tests 
		// test #1 

		System.out.println(circle1.intersects(circle2));

		// test #2

		circle1.setCenter_x(2.0);
		circle1.setCenter_y(2.0);
		circle1.setRadius(2);
		circle2.setCenter_x(2.0);
		circle2.setCenter_y(2.0);
		circle2.setRadius(2);
		System.out.println(circle1.intersects(circle2));


		// test #3

		circle1.setCenter_x(2.0);
		circle1.setCenter_y(2.0);
		circle1.setRadius(20);
		circle2.setCenter_x(2.0);
		circle2.setCenter_y(2.0);
		circle2.setRadius(100);
		System.out.println(circle1.intersects(circle2));


	}
	
}
