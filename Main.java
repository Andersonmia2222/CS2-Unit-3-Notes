public class Main {

   public static void main(String []args) {
   
      // Create a new string -> SHORTCUT! 

   String Lebron = "bear";
   
   // But strings are actually objects 
   // The OG way to create a string:
   String steph = new String("bear");

   // ALL objects can be creayed using this pattern:
   //ClassName objectName = new ClassName();
   BuildABear basicBear = new BuildABear();
// "BuildABear basicBear" is declaring a variable of type BuildABear
// "new BuildABear()" is calling a CONSTRUCTOR to set up the object 


System.out.println(basicBear);
// create a new object with our values 
// called the constructor: ClassName(String, String, Int) 
BuildABear teddy = new BuildABear("teddy", "Claira", 90); 

// Printing an object calls the CLASS' toString() method 
System.out.println(teddy);

// Test our methods below by calling them on an object instance 
// Getters are non-void meaning (we need to handle output data) 
System.out.println( teddy.getType() ); 
// or,store the return value in a variable 
 double price = teddy.getPrice();
System.out.println( price );

// Setters are void ( means no return value)
// Calling void methods: objectName.methodName();

teddy.setName("Claira"); 
teddy.setFillLevel(50);
// setters (mutators) changed values. let's see the effects:
System.out.println(teddy);
   } // end Mian() Method 
} // end main class 
