package praticepackage;

import java.util.Scanner;

public class AreaofTraingle {

	public static void main(String[] args) 
	{
	    Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the value of base");	   
	    int base =  sc1.nextInt();
		System.out.println("Enter the value of height");
		int height = sc1.nextInt();
		double Areaoftraingle = 0.5*base*height;
		System.out.println("Area of triangle is : --> " + Areaoftraingle); 
		

	}

}
