package observer;

public class Library {

	public void returnBook(Book book) {
		if (book.getState().equals("MALO")) {
			BookAlarm alarm = new BookAlarm();

			alarm.notifyObservers();
		}

	}
}
