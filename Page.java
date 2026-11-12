public class Page {
    // Attributes
    int pageNumber;
    String content;
    boolean isBookmarked;

    // Constructor
    public Page(int pageNumber, String content) {
        this.pageNumber = pageNumber;
        this.content = content;
        this.isBookmarked = false;
    }

    // Function 1: Read/display the page
    public void readPage() {
        System.out.println("--- Page " + pageNumber + (isBookmarked ? " [Bookmarked]" : "") + " ---");
        System.out.println(content);
        System.out.println("---------------------------");
    }

    // Function 2: Toggle bookmark on or off
    public void toggleBookmark() {
        isBookmarked = !isBookmarked;
        if (isBookmarked) {
            System.out.println("Bookmark added to Page " + pageNumber + ".");
        } else {
            System.out.println("Bookmark removed from Page " + pageNumber + ".");
        }
    }
}