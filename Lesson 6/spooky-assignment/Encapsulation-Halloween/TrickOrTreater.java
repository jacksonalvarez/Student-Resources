/**
 * TrickOrTreater class demonstrates encapsulation principles
 * by protecting private data with controlled public methods.
 * 
 * Halloween-themed class that models a trick-or-treater
 * collecting and eating candy while tracking sugar levels.
 */
public class TrickOrTreater {
    // Private fields - encapsulated data that cannot be directly accessed

    
    /**
     * Constructor to create a new TrickOrTreater
     * @param name The name of the trick-or-treater
     */
    public TrickOrTreater(String name) {

    }
    
    /**
     * Public getter method for the name
     * @return The trick-or-treater's name
     */
    public String getName() {
        return ;
        }
    
    /**
     * Public method to collect candy - demonstrates controlled access
     * Safely increments candy count and sugar level
     * @param candy The type of candy collected
     */
    public void collectCandy(String candy) {

    }
    
    /**
     * Public method to eat candy - demonstrates controlled modification
     * Safely decreases candy count and increases sugar level
     */
    public void eatCandy() {


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