package praticepackage;

public class Nonstaticcal {
	
	   void addition()
	   {
		   int a=25000;
		   int b=30;
		   int sum=a+b;
		  System.out.println("the addition of two numbers is => : " + sum ); 
	   }
	   
	   void substraction()
	   {
		   int a=5000;
		   int b=765;
		   int sub=a-b;
		  System.out.println("the substraction of two numbers is => : " + sub ); 
	   }
      void multiplication()
      {
    	  int a=5000;
		   int b=600;
		   int mul=a*b;
		  System.out.println("the multiplication of two numbers is => : " + mul );
      }
	   void division()
	   {
		   int a=6000;
		   int b=31;
		   int div=a/b;
		   System.out.println("the division of two numbers is => : " + div ); 
	   }
	   
	   void modulus()
	   {
		   int a=70000;
		   int b=57;
		   int mod= a%b;
		 System.out.println("the modulus of two  numbers is ==> : " + mod);  
	   }
	   
	public static void main(String[] args) 
	{
		Nonstaticcal c1 = new Nonstaticcal();
		   c1.addition();
		   c1.substraction();
		   c1.multiplication();
		   c1.division();
		   c1.modulus();
		 

		
		
	}

}
