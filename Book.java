public class Book {
    // Attributes (properties of a book)
    String title;
    String author;
    int pages;
    boolean isBorrowed;

    // Constructor to set up a new Book object
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isBorrowed = false; // Available by default
    }

    // Function 1: Display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Status: " + (isBorrowed ? "Borrowed" : "Available"));
        System.out.println("---------------------------");
    }

    // Function 2: Borrow the book
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("You have borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is already borrowed.");
        }
    }

    // Function 3: Return the book
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Thank you for returning \"" + title + "\".");
        } else {
            System.out.println("\"" + title + "\" was not borrowed.");
        }
    }
}