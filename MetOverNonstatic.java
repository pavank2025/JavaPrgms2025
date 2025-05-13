package praticepackage;

public class MetOverNonstatic {

	  void addition(int a , int b)
	  {
		  int sum=a+b;
		 System.out.println("addition of two numbers is --> : " + sum);
		  
	  }
	   void addition(double a, double b)
	   {
		   double sum=a+b;
		   System.out.println("addtion of two numbers is --> :" + sum);
		   
	   }
	
	   static void addition(int a, double b)
	   {
		   double sum=a+b;
		   System.out.println("addtion of two numbers is --> :" + sum);
	   }
	   
	   static void addition(double a, int b)
	   {
		   double sum=a+b;
		   System.out.println("addtion of two numbers is --> :" + sum);
		   
	   }
	   static void addition(boolean b, String c, char d) {
		   
		     System.out.println("My name is --> : " + c);
		     System.out.println(b);
		     System.out.println(d);
	   }
	public static void main(String[] args) 
	{
		MetOverNonstatic a1 = new MetOverNonstatic();
		   a1.addition(4000, 5000);
		   addition(500, 6.456);
		   addition(6.546, 45);
		   a1.addition(56.345456, 6.23445);
		   addition(false,"pavan",'N');
	}

}
