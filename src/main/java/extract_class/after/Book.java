package extract_class.after;

public class Book {
	private String title;
	private String isbn;
	private String price;
	private Author author;

	public Book(String title, String isbn, String price, String authorName, String authorMail) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.author = new Author(authorName, authorMail);
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
		return author.getAuthorName();
	}

	public String getAuthorMail() {
		return author.getAuthorMail();
	}

	public void setAuthorName(String authorName) {
		this.author.setAuthorName(authorName);
	}

	public void setAuthorMail(String authorMail) {
		this.author.setAuthorMail(authorMail);
	}
	
	public String toXml() {
		String autor = tag("author", tag("name", author.getAuthorName()) +"\r\n"+ tag("mail", author.getAuthorMail()));
		String book = tag("book", tag("title", title) +"\r\n"+ tag("isbn", isbn) +"\r\n"+ tag("price", price) +"\r\n"+ autor);
		return book;
	}

	private String tag(String element, String content) {
		return String.format("<%1$s>%2$s</%1$s>", element, content);
	}

}
