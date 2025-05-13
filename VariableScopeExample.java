package praticepackage;

public class VariableScopeExample {
        static int data=50;
	
	
      void methodwithlocal()
      {
    	  int data=100;
    	 System.out.println("local method");
    	 System.out.println("local variable data value is "+ data);
      }
         
      void accessinstancevariable()
      {
    	  data=51;
    	  System.out.println("this is instance variable data");
    	  System.out.println("Instance variable value is --> "+ data);
      }
      
	public static void main(String[] args) 
	{
		VariableScopeExample Obj = new VariableScopeExample();
				Obj.methodwithlocal();
				Obj.accessinstancevariable();
			
				
		
		
	}
		
		
	

}
