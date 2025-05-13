package praticepackage;

import java.util.Scanner;

public class Persondetails {

	public static void main(String[] args) {

		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the age of the person");
		    int age = s2.nextInt();
		System.out.println("Enter the weight of the person");
		    double weight =  s2.nextDouble();
		System.out.println("Enter the height of the person");
		    int height = s2.nextInt();
		 System.out.println("Age of the person is " + age + " and weight is -> " + weight  + " height is " + height );
		     s2.close();
		

	}

}
