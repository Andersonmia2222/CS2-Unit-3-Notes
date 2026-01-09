    /**
     * BuildABear.java defines the buildABear class
     * which is a template for BuildABear objects
     */
    
    public class BuildABear {
    // 3 sections in an object class 
    // 1. Instance variables(data/attributes/fields)

 private String type; // just declare don't assign 
    private String name; 
    private int fillLevel;
    private double price; 
    private boolean hasSpeaker;
    private String recording; 
    // ENCAPSULATION: keep variables private (they can't be directly accessed outside of this class)

    //2. CONSTRUCTORS (initalize values)
    // DEFAULT CONSTRUCTOR does not take any arguments (no-arg)
    // what gets called when user says "= new BuildABear()"
    public BuildABear(){
      this.type = "bear"; // WE pick the values 
      this.name = "Teddy";
      this.fillLevel = 75;
      this.price = 150.00;
      this.hasSpeaker = false;
      this.recording = "";


    }

   // PARAMETERIZED CONSTRUCTOR allows user to provide args
   // user Passes va;ues to the constructor call

   public BuildABear(String t, String n, int fl)  {
      this.type = t; // User picked the value for type!
      this.name = n;
      this.fillLevel = fl;
      this.price = 150.00;
      this.hasSpeaker = false;
      this.recording = "";

}
    // 3. METHIDS (behaviors/actions)

    // ACCESSORS("getters") return the value of an instance var

   public String getType() {
      return type;

   } 

   public String getName(){
      return name;
   }

public int getFillLevel() {
   return fillLevel;

}

public double getPrice() {
   return price;
}

    
    
    // write a toString() method so that we can print an objects STATE 
    //  including this method changes what happens when you print an object 
    // otherwise doing system.out.println(object) just shows a memory location 

    public String toString() {

      String state = "BuildABear[" + type + "," + name + "," + fillLevel + "," + price + ")";
return state;

    }

// mutators("setters") are void, but accept an agrument to change
// the value of an objects instance variable to something new

// only need setters for variables you want the user to change


public void setName(String newName) {
   //assign the object's name to the new value
   
this.name = newName;
}
public void setFillLevel(int newFL) {
this.fillLevel = newFL;
}

   } // end class