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
    }
    