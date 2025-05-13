package praticepackage;

public class RealTimeMethOverloading 
{
     static void login(String emailid)
     {
    	 System.out.println("login usig emailid ---> : " + emailid);
     }
	
     static void login(long mobilenr)
     {
    	 System.out.println("login using mobilenr --> :"+ mobilenr);
     }
	
	public static void main(String[] args) 
	{
	     login("pavank1999418@gmail.com");
	     login(8668468973l);
		

	}

}
