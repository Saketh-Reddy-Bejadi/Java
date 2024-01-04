
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + "\tAuthor: " + book.getAuthor() +
                    "\tAvailable: " + (book.isAvailable() ? "Yes" : "No"));
        }
        System.out.println();
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Library library = new Library();

            while (true) {
                System.out.println("1. Add Book");
                System.out.println("2. Display Books");
                System.out.println("3. Borrow Book");
                System.out.println("4. Return Book");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                try {
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    switch (choice) {
                        case 1:
                            System.out.print("Enter book title: ");
                            String title = scanner.nextLine();
                            System.out.print("Enter author name: ");
                            String author = scanner.nextLine();
                            Book newBook = new Book(title, author);
                            library.addBook(newBook);
                            System.out.println("Book added successfully!\n");
                            break;
                        case 2:
                            library.displayBooks();
                            break;
                        case 3:
                            System.out.print("Enter the title of the book to borrow: ");
                            String borrowTitle = scanner.nextLine();
                            Book borrowBook = library.findBook(borrowTitle);
                            if (borrowBook != null && borrowBook.isAvailable()) {
                                borrowBook.setAvailable(false);
                                System.out.println("Book borrowed successfully!\n");
                            } else {
                                System.out.println("Book not available or does not exist.\n");
                            }
                            break;
                        case 4:
                            System.out.print("Enter the title of the book to return: ");
                            String returnTitle = scanner.nextLine();
                            Book returnBook = library.findBook(returnTitle);
                            if (returnBook != null && !returnBook.isAvailable()) {
                                returnBook.setAvailable(true);
                                System.out.println("Book returned successfully!\n");
                            } else {
                                System.out.println("Book cannot be returned or does not exist.\n");
                            }
                            break;
                        case 5:
                            System.out.println("Exiting Library Management System. Goodbye!");
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice. Please try again.\n");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.\n");
                    scanner.nextLine(); // consume the invalid input
                }
            }
        }
    }
}
