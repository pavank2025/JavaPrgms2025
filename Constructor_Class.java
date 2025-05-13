package praticepackage;

public class Constructor_Class {

	    Constructor_Class()
	    {
	    	System.out.println("1st");
	    }
	
	    Constructor_Class(int a)
	    {
	    	System.out.println("2nd");
	    }
	    Constructor_Class(boolean b)
	    {
	    	System.out.println("3rd");
	    }
	
	public static void main(String[] args) 
	{
	     new Constructor_Class();
	     new Constructor_Class(true);
	     new Constructor_Class(45678);
	     

	}

}
