package praticepackage;

public class MethodOverloading {

	   static void addition(double a, double b)
	   {
		   double sum=a+b;
		   System.out.println(sum);
	   }
	
	   static void addition(int a, int b)
	   {
		   int sum=a+b;
		   System.out.println(sum);
	   }
	
	public static void main(String[] args) 
	{
	   addition(32,64);
	   addition(6.96,9.89);

	}

}
