package praticepackage;

public class MethodOverload3 {
	
	   static void addition(double a, double b)
	   {
		    double sum = a+b;
		    System.out.println("the sum of the two values is --> :" + sum);
	   }

	      void addition(int a , double b)
	      {
	    	 double sum=a+b;
	    	 System.out.println("the sum of the two values is --> : " + sum); 
	    	  
	      }
	      
	      static void addition(double a, int b)
	      {
	    	  double sum=a+b;
		      System.out.println("the sum of the two values is --> : " + sum);
	      }
	   
	      void addition(int a, int b)
	      {
	    	  double sum=a+b;
	    	  System.out.println("the sum of two numbers is --> : " + sum);
	      }
	      
	      static void addition(boolean b, String name, char n)
	      {
	    	  System.out.println("My name is " +  name  +  n);
	      }
	      
	public static void main(String[] args) {
	
		MethodOverload3 m3 = new MethodOverload3();
		    m3.addition(78, 67.4567);
            addition(6.456,8);
            m3.addition(8484, 9383);
            addition(56.345,9.3456);
            addition(true,"pavan",'k');
	}

}
