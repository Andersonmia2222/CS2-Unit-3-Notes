public class Main {

   public static void main(String []args) {
   
      // Create a new string -> SHORTCUT! 

   String Lebron = "bear";
   
   // But strings are actually objects 
   // The OG way to create a string:
   String steph = new String("bear");

   // ALL objects can be creayed using this pattern:
   //ClassName objectName = new ClassName();
   BuildABear bear = new BuildABear();
// "BuildABear bear" is declaring a variable of type BuildABear
// "new BuildABear()" is calling a CONSTRUCTOR to set up the object 


System.out.println(bear);

   }
}
