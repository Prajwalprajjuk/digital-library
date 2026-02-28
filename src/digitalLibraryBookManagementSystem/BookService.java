package digitalLibraryBookManagementSystem;


import java.util.List;

public class BookService {

    private BookDAO dao = new BookDAOImpl();

    public void addBook(Book book) {
        dao.addBook(book);
    }

    public void viewBooks() {

        List<Book> list = dao.getAllBooks();

        for (Book b : list) {
            System.out.println(
                    b.getBookId() + " | " +
                    b.getTitle() + " | " +
                    b.getAuthor() + " | " +
                    b.getCategory() + " | " +
                    b.getPrice() + " | " +
                    b.getStatus()
            );
        }
    }

    public void updatePrice(int id, double price) {
        dao.updateBookPrice(id, price);
    }

    public void deleteBook(int id) {
        dao.deleteBook(id);
    }
}
