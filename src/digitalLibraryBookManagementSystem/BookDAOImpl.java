package digitalLibraryBookManagementSystem;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {

    private final String URL = "jdbc:mysql://localhost:3306/digital_library";
    private final String USER = "root";
    private final String PASSWORD = "12345";

    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    @Override
    public void addBook(Book book) {

        String sql = "INSERT INTO books(title,author,category,price,status) VALUES(?,?,?,?,?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getCategory());
            ps.setDouble(4, book.getPrice());
            ps.setString(5, book.getStatus());

            ps.executeUpdate();
            System.out.println("Book Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Book> getAllBooks() {

        List<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM books";

        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                Book book = new Book();
                book.setBookId(rs.getInt("book_id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setCategory(rs.getString("category"));
                book.setPrice(rs.getDouble("price"));
                book.setStatus(rs.getString("status"));

                list.add(book);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public void updateBookPrice(int bookId, double price) {

        String sql = "UPDATE books SET price=? WHERE book_id=?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, price);
            ps.setInt(2, bookId);

            ps.executeUpdate();
            System.out.println("Book Price Updated!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBook(int bookId) {

        String sql = "DELETE FROM books WHERE book_id=?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, bookId);
            ps.executeUpdate();
            System.out.println("Book Deleted!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}