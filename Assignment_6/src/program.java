import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Book {

	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Book() {
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book book = (Book) obj;
		return this.getIsbn().equals(book.getIsbn());
	}
}

public class program {
	public static List<Book> list = new ArrayList<>();

	public static Book[] getInstances() {
		Book[] books = new Book[5];
		books[0] = new Book("B06", 199.00, "PO", 45);
		books[1] = new Book("B08", 677.00, "ET", 23);
		books[2] = new Book("B03", 189.00, "MK", 54);
		books[3] = new Book("B02", 125.00, "AK", 65);
		books[4] = new Book("B01", 870.00, "SB", 90);
		return books;
	}

	public static void addBooks(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			list.add(books[i]);
		}
	}

	public static void displayForward(Book[] books) {
		ListIterator<Book> trav = list.listIterator();
		while (trav.hasNext()) {
			Book book = trav.next();
			System.out.println(book.toString());
		}
	}

	public static void displayReverse(Book[] books) {
		ListIterator<Book> trav = list.listIterator(list.size());
		while (trav.hasPrevious()) {
			Book book = trav.previous();
			System.out.println(book.toString());
		}
	}

	public static void acceptRecord(String[] bookid) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Book id");
		bookid[0] = scanner.next();
	}

	public static boolean deleteBook(String bookid) {
		Book book = new Book();
		book.setIsbn(bookid);
		if (list.contains(book)) {
			list.remove(book);
			return true;
		}
		return false;
	}

	public static int menuList() {
		int ch;
		Scanner scanner = new Scanner(System.in);
		System.out.println("0.Exit\n1. Add new book in list\r\n" + "2. Display all books in forward order\r\n"
				+ "3. Display all books in reverse order\r\n" + "4. Delete a book at given index.\r\n"
				+ "5. Sort all books by price in desc order\nEnter the choice");
		return scanner.nextInt();
	}

	static class SortByPrice implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {
			return Double.compare(o2.getPrice(), o1.getPrice());
		}

	}

	public static void main(String[] args) {
		int ch;
		String[] bookid = new String[1];
		Book[] books = program.getInstances();
		while ((ch = menuList()) != 0) {
			switch (ch) {
			case 1:

				program.addBooks(books);
				break;
			case 2:
				program.displayForward(books);
				break;
			case 3:
				program.displayReverse(books);
				break;
			case 4:
				program.acceptRecord(bookid);
				boolean removed = program.deleteBook(bookid[0]);
				if (removed) {
					System.out.println("removed successfully");
				} else {
					System.out.println("book not found");
				}
				break;
			case 5:
				list.sort(new SortByPrice());
				for (Book book : list) {
					System.out.println(book);
				}
				break;
			default:
				break;
			}

		}

	}

}
