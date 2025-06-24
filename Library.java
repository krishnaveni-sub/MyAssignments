package week1.day2;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println( "Book added successfully");
		return bookTitle;
		
	}
	public void issuebook() {
		System.out.println( "Book issued successfully");
	
	}
	

	public static void main(String[] args) {
		
		Library lb=new Library();
		System.out.println(	lb.addBook("Harry Potter-Part1"));
		lb.issuebook();

	}

}
