package praticepackage;

public class NonStaticMethod {
	
	   void addition()
	   {
		   System.out.println("Addition of two numbers");
	   }

	   void substraction()
	   {
		   System.out.println("substracting two numbers");
	   }
	public static void main(String[] args) 
	{
	       
		       NonStaticMethod m1 = new NonStaticMethod();
		       m1.addition();
		       m1.substraction();
		       System.out.println("My main method");

	}

}
