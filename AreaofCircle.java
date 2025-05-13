package praticepackage;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		   System.out.println("Enter the value of pi");
		  double  pi =    s1.nextDouble();
		 System.out.println("Enter the value of r");
		   double r = s1.nextDouble();
		  double Areaofcircle = pi*r*r;
		 System.out.println("Area of circle is --> : " + Areaofcircle); 
		s1.close(); 

	}

}
