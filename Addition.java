package praticepackage;

public class Addition {
	
	 static void addition()
	 {
		 int a=2000;
		 int b=500;
		 int sum=a+b;
		 System.out.println("the addition of two numbers is --> : " + sum );
				 
	 }
	 
	 static void substraction()
	 {
		 int a=2000;
		 int b=500;
		 int sub=a-b;
		 System.out.println("the substraction of two numbers is --> : " + sub );
	 }
	 
	 static void multiplication()
	 {
		 int a=500;
		 int b=300;
		 int mul=a*b;
	   System.out.println("the multiplication of two numbers is --> :" +mul);	 
	 }
	 
	 static void division()
	 {
		  int a=103;
		  int b=20;
		  int div=a/b;
		  System.out.println("the division of two numbers is --> :" + div);
	 }

	 static void modulus()
	 {
		 int a=102;
		 int b=50;
		 int mod=a%b;
		 System.out.println("the modulus of two numbers is -->" + mod);
	 }
	 
	public static void main(String[] args) 
	
	{
              addition();
              substraction();
              multiplication();
              division();
              modulus();
		

	}

}
