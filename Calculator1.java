package praticepackage;

public class Calculator1 {

    // A static method
    public static int add(int a, int b) {
        System.out.println("Executing static add method.");
        return a + b;
    }

    // A non-static method
    public int multiplyAndAdd(int x, int y, int z) {
        System.out.println("Executing non-static multiplyAndAdd method.");
        int product = x * y;
        // Calling the static method 'add' from within a non-static method
        int sum = add(product, z); // Can also be called as Calculator.add(product, z);
        return sum;
    }

    public static void main(String[] args) {
        // To call the non-static method, we need an object
        Calculator1 myCalc = new Calculator1();
        int result = myCalc.multiplyAndAdd(5, 2, 3);
        System.out.println("Result of multiplyAndAdd: " + result);

        // We can also call the static method directly from main (which is also static)
        System.out.println("Result of static add: " + Calculator.add(10, 20));
    }
}


