package module;

import java.io.Serializable;

public class LibVO extends Object implements Serializable{
	private String bookName;
	private String bookWriter;
	private int bookPubYear;
	private String bookCategory;
	private int bookIsbm;
	private int	bookNumber;
	
	public LibVO() {
		
	}
	
	public void bookData() {
		System.out.printf("%-17.15s\t%-6.6s\t %d\t%s\t%d\t%d±Ç" 
				,bookName,bookWriter,bookPubYear,bookCategory,
				bookIsbm,bookNumber);
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public int getBookPubYear() {
		return bookPubYear;
	}

	public void setBookPubYear(int bookPubYear) {
		this.bookPubYear = bookPubYear;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public int getBookIsbm() {
		return bookIsbm;
	}

	public void setBookIsbm(int bookIsbm) {
		this.bookIsbm = bookIsbm;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

}
