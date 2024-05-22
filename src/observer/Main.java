package observer;

public class Main {
	public static void main(String[] args) {
		BookAlarm alarm = new BookAlarm();
		
		alarm.attach(new Purchases());
		alarm.attach(new Administration());
		alarm.attach(new Stock());

		Book book = new Book();
		book.setState("MALO");
		
		Library library = new Library();
		
		library.returnBook(book);
	}
}
