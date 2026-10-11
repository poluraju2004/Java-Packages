package com.examples.shapes;


/*Problem 2: Using Multiple Classes from Different Packages
Task: Create a package com.example.shapes with a class Circle and another package com.example.utils with a class MathUtils.
 The Circle class should use MathUtils (it should have a method to provide PI value)  to calculate the area of the circle. 
 Then, create a ShapeTest class to demonstrate this functionality.*/

import com.example.utils.MathUtils;
public class Circle {
	
	public void area(double r) {
		System.out.println(MathUtils.getPI()*r*r);
		
	
	}

}
