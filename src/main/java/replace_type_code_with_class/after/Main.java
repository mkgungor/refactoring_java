package replace_type_code_with_class.after;

public class Main {
	public static void main(String[] args) {
		Item book = new Item(ItemType.BOOK, "세계 역사", 4800);
		Item dvd = new Item(ItemType.DVD, "뉴욕의 꿈 특별판", 3000);
		Item soft = new Item(ItemType.SOFTWARE, "튜링 머신", 3200);
		
		System.out.printf("%5s = %s%n","book", book);
		System.out.printf("%5s = %s%n", "dvd", dvd);
		System.out.printf("%5s = %s%n", "soft", soft);
	}
}
