package praticepackage;

public class OverloadMainmethod {

	public static void main(String[] args) 
	{
		OverloadMainmethod m1 = new OverloadMainmethod();
		System.out.println("Main method");
		m1.main(6);
		main(false);

	}

	  void main(int a)
	{
		System.out.println("overload1");
	}
	
	 static void main(boolean b)
	{
		System.out.println("overload2");
	}
}
