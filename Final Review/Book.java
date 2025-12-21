/**
 * Practice Assignment: Creating a Book Class
 * 
 * Instructions: Follow the comments below to create a complete Book class.
 * This assignment covers:
 * - Classes and Objects
 * - Instance Fields (private variables)
 * - Constructors (two different constructors)
 * - Getters and Setters
 * - toString method
 * 
 * When you're done, you should be able to create Book objects and access their
 * data!
 */

public class Book {

    // TODO 1: Declare private instance fields
    // Create the following private instance variables:
    // - title (String)
    // - author (String)
    // - pages (int)
    // - isRead (boolean)

    // TODO 2: Create a constructor with NO parameters (default constructor)
    // This constructor should set:
    // - title to "Unknown"
    // - author to "Unknown"
    // - pages to 0
    // - isRead to false

    // TODO 3: Create a constructor with ALL parameters
    // This constructor should accept:
    // - String title
    // - String author
    // - int pages
    // - boolean isRead
    //
    // Use the 'this' keyword to assign the parameters to the instance variables

    // TODO 4: Create getter methods for all instance variables
    // Remember: getters return the value and take no parameters
    // - getTitle() should return title
    // - getAuthor() should return author
    // - getPages() should return pages
    // - isRead() should return isRead (note: boolean getters often use 'is' instead
    // of 'get')

    // TODO 5: Create setter methods for all instance variables
    // Remember: setters return void and take one parameter
    // - setTitle(String title) should set this.title
    // - setAuthor(String author) should set this.author
    // - setPages(int pages) should set this.pages
    // - setRead(boolean isRead) should set this.isRead

    // TODO 6: Create a toString() method
    // This method should return a String with all the book information
    // Format: "Title: [title], Author: [author], Pages: [pages], Read: [isRead]"
    // Example: "Title: Harry Potter, Author: J.K. Rowling, Pages: 309, Read: true"

    // TODO 7: Create a method called displayInfo() that prints the book information
    // This method should be void (no return)
    // It should print out the book's information in a nice format
    // You can use System.out.println() statements

    // BONUS TODO 8: Create a method called markAsRead()
    // This method should set isRead to true
    // Return type: void

    // Test your class by uncommenting the main method below:
    /*
     * public static void main(String[] args) {
     * // Test the default constructor
     * Book book1 = new Book();
     * System.out.println("Book 1 (default constructor):");
     * book1.displayInfo();
     * 
     * System.out.println("\n" + "=".repeat(50) + "\n");
     * 
     * // Test the parameterized constructor
     * Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, false);
     * System.out.println("Book 2 (parameterized constructor):");
     * book2.displayInfo();
     * 
     * System.out.println("\n" + "=".repeat(50) + "\n");
     * 
     * // Test setters
     * book1.setTitle("1984");
     * book1.setAuthor("George Orwell");
     * book1.setPages(328);
     * book1.setRead(true);
     * 
     * System.out.println("Book 1 (after using setters):");
     * book1.displayInfo();
     * 
     * System.out.println("\n" + "=".repeat(50) + "\n");
     * 
     * // Test getters
     * System.out.println("Testing getters for Book 2:");
     * System.out.println("Title: " + book2.getTitle());
     * System.out.println("Author: " + book2.getAuthor());
     * System.out.println("Pages: " + book2.getPages());
     * System.out.println("Read: " + book2.isRead());
     * 
     * System.out.println("\n" + "=".repeat(50) + "\n");
     * 
     * // Test markAsRead (bonus)
     * book2.markAsRead();
     * System.out.println("Book 2 (after marking as read):");
     * book2.displayInfo();
     * }
     */
}
