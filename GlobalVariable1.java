package praticepackage;

public class GlobalVariable1 
{
       static int a=100;
       static int b=40;
	
    void addition()
    {
    	  a=101;
    	 int sum=a+b;
    	System.out.println(sum); 
    }
      void substraction()
      {
    	   int sub=a-b;
    	   System.out.println(sub);
      }
       static void multiplication()
       {
    	   int mul=a*b;
    	   System.out.println(mul);
       }
       static void division()
       {
    	   int div = a/b;
    	    System.out.println(div);   
       }
       void modulus()
       {
    	     int mod= a%b;
    	     System.out.println(mod);
       }
       
	public static void main(String[] args) {
		      
		GlobalVariable1 G1 = new GlobalVariable1();
		          G1.addition();
		  G1.substraction();        
		  multiplication();
		   division();
		   G1.modulus();
	}

}
