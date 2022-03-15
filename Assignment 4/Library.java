
public class Library {
    // Add the missing implementation to this class
	
	static String openingHour = "Libraries are open daily from 9am to 5pm.";
	static int bookcounter = 0; // Counter to keep count of books in booklist
	String address;
	Book[] booklist = new Book[100];	

	// Constructor
	Library(String libraryAddress){
		address = libraryAddress;
	}
	
	
	void addBook(Book book1) {
		booklist[bookcounter] = book1;
		bookcounter++; // increment counter after each addition of new book
	}
	
	
	static void printOpeningHours() {
		System.out.println(openingHour);
	}
	
	
	void printAddress() {
		System.out.println(address);
	}
	
	
	void printAvailableBooks() {
		if(booklist[0] == null) { // if the first element in booklist is a null
			System.out.println("No book in catalog");
		}else {
			for(int i = 0; i < booklist.length; i++) { // for each book in booklist
				if(booklist[i] != null && booklist[i].isBorrowed() == false) { // if book is not null, and it is not borrowed
					System.out.println(booklist[i].getTitle());
					}
				}
			}
		}

	
	void borrowBook(String bookTitle) {
		boolean isFound = false;
		
		// iterate over the booklist
		for(int i=0; i < bookcounter; i++) {
			if(booklist[i] != null && booklist[i].getTitle().equals(bookTitle)) {
				if(booklist[i].isBorrowed() == false) { // if book is found and it is not borrowed
					booklist[i].rented();
					System.out.println("You successfully borrowed " + bookTitle);
					isFound = true;
				}else if(booklist[i].isBorrowed() == true) { // if book is found but it is borrowed
					System.out.println("Sorry, this book is already borrowed. ");
					isFound = true;
				}
			}
		}if(isFound == false) { // if book is not found
			System.out.println("Sorry, this book is not in our catalog.");
		}
	}
	
	
	void returnBook(String bookTitle) {
		for(int i = 0; i < bookcounter; i++) {
			if(booklist[i] != null && booklist[i].getTitle().equals(bookTitle)) {
				booklist[i].returned();
				System.out.println("You successfully returned " + bookTitle);
			}
		}
	}
	
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 
