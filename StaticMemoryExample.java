package praticepackage;

public class StaticMemoryExample {
	
	     String brand;
	     int price;
	     static String name;
	 
	  public void show()
	  {
		  System.out.println(brand + " : " + price + " : " + name);
	  }

	public static void main(String[] args) {
		StaticMemoryExample m1 = new StaticMemoryExample();
		   m1.brand="apple";
		   m1.price=60000;
		   m1.name="smartphone";
		   StaticMemoryExample m2 = new StaticMemoryExample();
		   m2.brand="Samsung";
		   m2.price=40000;
		   m2.name="phone";
		   m2.name="newphone";

		  m1.show();
		  m2.show();
	}

}
