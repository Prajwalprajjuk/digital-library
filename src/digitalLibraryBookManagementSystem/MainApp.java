package digitalLibraryBookManagementSystem;


import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookService service = new BookService();

        while (true) {

            System.out.println("\n===== DIGITAL LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book Price");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Category: ");
                    String category = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    sc.nextLine();
                    System.out.print("Status (Available/Issued): ");
                    String status = sc.nextLine();

                    service.addBook(new Book(title, author, category, price, status));
                    break;

                case 2:
                    service.viewBooks();
                    break;

                case 3:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();

                    System.out.print("New Price: ");
                    double newPrice = sc.nextDouble();

                    service.updatePrice(id, newPrice);
                    break;

                case 4:
                    System.out.print("Book ID: ");
                    int deleteId = sc.nextInt();
                    service.deleteBook(deleteId);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}