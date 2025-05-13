package praticepackage;

class Parent {
    final void cannotOverride() {
        System.out.println("This method cannot be overridden.");
    }

    void canOverride() {
        System.out.println("This method can be overridden.");
    }
}

   class Child extends Parent {
    // void cannotOverride() 
    // { // Compile-time error: cannot override final method from Parent
     //    System.out.println("Trying to override...");
     //}

    @Override
    void canOverride() {
         System.out.println("This method is overridden in Child.");
    }
}