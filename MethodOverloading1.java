package praticepackage;

public class MethodOverloading1 {
	
	    //calculate the area of circle
	     double calculatearea(double radius)
	    {
	    	return Math.PI*radius*radius;
	    }
	     
	     //calculate the areaoftraingle
	     double calculatearea(double base, double height,String shapetype)
	     {
	    	 if(shapetype.equalsIgnoreCase("traingle")) {
	    	return 0.5*base*height; 
	     }
	       return 0.0;
	     }

	     
	     //calculate the area of rectangle
	     double calculatearea(double length, double width)
	     {
	    	 return length*width;
	     }
	public static void main(String[] args) 
	{
		MethodOverloading1 m1 = new MethodOverloading1();
			System.out.println("the area of the circle is --> : "+   m1.calculatearea(7.8));
			System.out.println("the area of the rectangle is --> :"+ m1.calculatearea(22.65, 73.56));
			System.out.println("the area of the traingle is --> :" + m1.calculatearea(5.6, 7.8, "traingle"));
			
				

	}

}
