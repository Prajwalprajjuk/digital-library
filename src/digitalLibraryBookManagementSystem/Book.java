package digitalLibraryBookManagementSystem;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private String category;
    private double price;
    private String status;

    public Book() {}

    public Book(String title, String author, String category, double price, String status) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.status = status;
    }

    // Getters and Setters

    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
