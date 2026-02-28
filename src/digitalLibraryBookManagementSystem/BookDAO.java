package digitalLibraryBookManagementSystem;

import java.util.List;

public interface BookDAO {

    void addBook(Book book);
    List<Book> getAllBooks();
    void updateBookPrice(int bookId, double price);
    void deleteBook(int bookId);
}