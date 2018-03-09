package extract_class;

public class Book {
	private String title;
	private String isbn;
	private String price;
	private String authorName;
	private String authorMail;

	public Book(String title, String isbn, String price, String authorName, String authorMail) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.authorMail = authorMail;
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getPrice() {
		return price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getAuthorMail() {
		return authorMail;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setAuthorMail(String authorMail) {
		this.authorMail = authorMail;
	}
	
	public String toXml() {
		String autor = tag("author", tag("name", authorName) +"\r\n"+ tag("mail", authorMail));
		String book = tag("book", tag("title", title) +"\r\n"+ tag("isbn", isbn) +"\r\n"+ tag("price", price) +"\r\n"+ autor);
		return book;
	}

	private String tag(String element, String content) {
		return String.format("<%1$s>%2$s</%1$s>", element, content);
	}

}
