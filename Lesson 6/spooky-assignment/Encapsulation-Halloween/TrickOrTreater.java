public class TrickOrTreater {
    // Private fields - encapsulated data that cannot be directly accessed
    private String name;
    private int sugarLevel;
    private int candyCount;
    private String[] candyBag = new String[100];
    
    /**
     * Constructor to create a new TrickOrTreater
     * @param name The name of the trick-or-treater
     */
    public TrickOrTreater(String n) {
        name = n;
    }
    
    /**
     * Public getter method for the name
     * @return The trick-or-treater's name
     */
    public String getName() {
        return name;
        }
    
    /**
     * Public method to collect candy - demonstrates controlled access
     * Safely increments candy count and sugar level
     * @param candy The type of candy collected
     */
    public void collectCandy(String candy) {
        for (int i = 0; i < 100; i++){
            if (candyBag[i] != null){
        
            }    
            else{
                candyBag[i] = candy;
                break;
            }
            }    
        }
    
    public void getGandy() {
        int countOfNoNull = 0;
         for (int i = 0; i < 100; i++) {
             if (candyBag[i] != null){ 
             System.out.println(candyBag[i]);
             countOfNoNull++;
             }
             
         }
             System.out.println(countOfNoNull);
             
        
        
        
        
        
    }
        
    
    /**
     * Public method to eat candy - demonstrates controlled modification
     * Safely decreases candy count and increases sugar level
     */
    public void eatCandy(String candy) {
        int notMeCandy = 0;
        for (int i = 0; i < 100; i++){
            if (candyBag[i].equals(candy)){
                System.out.println("You big and ate: " + candyBag[i]);
                System.arraycopy(candyBag, i + 1, candyBag, i, candyBag.length - 1 - i); // Removes 1 element starting at index 2
                sugarLevel += 10;
                break;
            }
            if (candyBag[i] != candy){
                notMeCandy++;
            }
            
            }
            if (notMeCandy == 100)System.out.println("No candy");
        }
    
    
    /**
     * Public method to display current status
     * Calls the private helper method to check sugar levels
     */
    public void showStatus() {
        // Display current candy count and sugar level. Look at the README for format.
        checkSugarCrash(); // Call private helper method
    }
    
    /**
     * Private helper method - demonstrates internal encapsulation
     * Only accessible within this class, not from external code
     */
    private void checkSugarCrash() {
        if (sugarLevel > 60){
            System.out.println(name + "is bouncing off the walls with energy!");
        }
        else if (sugarLevel > 40){
            System.out.println(name + "is feeling quite hyper!");
        }
        else if (sugarLevel > 20){
            System.out.println(name + "is feeling pretty good!");
        }
        else if (sugarLevel > 0){
            System.out.println(name + "is feeling normal");
        }
         else{
            System.out.println(name + "could use some sugar!");
        }
        // Behavior based on sugarLevel:
        // > 60  → "💫 [name] is bouncing off the walls with energy!"
        // > 40  → "⚡ [name] is feeling quite hyper!"
        // > 20  → "😊 [name] is feeling pretty good!"
        // > 0   → "🙂 [name] is feeling normal."
        // ≤ 0   → "😴 [name] could use some sugar!"
    }
}

// ONE LAST THING SHAWN: Make sure to test your class in HalloweenNight.java! 
// Use HalloweenNight.java as your main method file, make an instance of TrickOrTreater, and call its methods to demonstrate encapsulation in action.
// Also, void == no return value! I want you to use System.out.println inside the methods to show output when methods are called.
