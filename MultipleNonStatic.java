package praticepackage;

public class MultipleNonStatic 
{
      void multiply()
      {
    	  System.out.println("Multilying two numbers");
      }
	 
       void division()
       {
    	   System.out.println("division of two numbers");
       }
	
        void substraction()
       {
    	   System.out.println("substraction of two numbers");
       }
       
	public static void main(String[] args) 
	{
		MultipleNonStatic m1 = new MultipleNonStatic();
		    m1.division();
		    m1.multiply();
		    m1.substraction();
		   
		    
		    
		

	}

}
