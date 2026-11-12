public class Demo {
    public static void main(String[] args) {
        // Create two Book objects
        Book book1 = new Book("Clean Code", "Robert C. Martin", 464);
        Book book2 = new Book("The Pragmatic Programmer", "Andrew Hunt", 352);

        // Display initial details
        book1.displayInfo();
        book2.displayInfo();

        // Call functions on book1
        book1.borrowBook();
        book1.borrowBook(); // Trying to borrow again shows a warning
        book1.displayInfo();

        // Return book1
        book1.returnBook();
        book1.displayInfo();
    }
}