package praticepackage;

public class Calculator 
{
      public static int add(int a , int b)
      {
    	  return a+b;
      }
	
      public int multiply(int a , int b)
      {
    	  return a*b;
      }
	
	public static void main(String[] args) 
	{
		
		int sum = Calculator.add(5, 3);
		  System.out.println(sum);
		Calculator cal = new Calculator();
		   System.out.println(cal.multiply(4, 5));
		System.out.println("My main method");   
          
	}

}
