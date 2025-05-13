package praticepackage;

public class MetOverload2 {
	
	static void  sendmessage(String message)
	{
		System.out.println("text message is "+ message);
	}

	static void sendmessage(String msg, String sub)
	{
		 System.out.println("text message is " + msg + " with subject " + sub);
	}
	  
	 static void sendmessage(boolean b)
	 {
		 System.out.println("the boolean value is " +b);
	 }
	
	
	public static void main(String[] args) 
	{
	      sendmessage("your item deliverd successfully");
	      sendmessage("your item deliverd successfully","amazon order");
          sendmessage(true);
	}

}
