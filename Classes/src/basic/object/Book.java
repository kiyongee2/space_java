package basic.object;

public class Book{
	int bookNumber;   //책 번호
	String bookTitle; //책 제목
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}
	
	public String showInfo() {
		return bookNumber + ", " + bookTitle;
	}
}


