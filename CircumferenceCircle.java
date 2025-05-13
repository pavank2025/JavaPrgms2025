package praticepackage;

import java.util.Scanner;

public class CircumferenceCircle {

	public static void main(String[] args) 
	{
	
	  Scanner s1 = new Scanner(System.in);
	   System.out.println("Enter the value of pi");
	      double pi  =      s1.nextDouble();
	      System.out.println("Enter the value of r");
	      double r = s1.nextDouble();
	     double circumofCircle =  2*Math.PI*r;
	    System.out.println("the circumference of the circle is --> :" + circumofCircle); 
		

	}

}
