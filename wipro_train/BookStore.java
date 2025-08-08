package wipro_train;
import java.util.Scanner;

public class BookStore {
	
	String BookName;
	int BookId;
	int BookPrice;
	
	void addBooks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Book: ");
		BookName = sc.next();
		System.out.println("Enter book ID: ");
		BookId = sc.nextInt();
		System.out.println("Enter price: ");
		BookPrice = sc.nextInt();

	}
	void displayBooks() {
		System.out.println("Name: "+BookName);
		System.out.println("ID: "+BookId);
		System.out.println("Price: "+BookPrice);
		
	}

	public static void main(String[] args) {
		BookStore book = new BookStore();
		book.addBooks();
		book.displayBooks();

	}

}
