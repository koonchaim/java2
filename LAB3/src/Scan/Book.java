package Scan;

public class Book {
	private int bookid;
	private String author;
	private String title;
	private String publisher;
	private String noOfPages;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(String noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "\t"+noOfPages+"\t"+bookid+"\t"+author;
	}
	
	
}
