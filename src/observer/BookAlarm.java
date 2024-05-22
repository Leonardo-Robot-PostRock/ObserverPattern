package observer;

import java.util.ArrayList;

public class BookAlarm implements Subject {
	private static ArrayList<IBookInPoorCondition> observers = new ArrayList<IBookInPoorCondition>();

	@Override
	public void attach(IBookInPoorCondition observer) {
		BookAlarm.observers.add(observer);
	}

	@Override
	public void dettach(IBookInPoorCondition observer) {
		BookAlarm.observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			BookAlarm.observers.get(i).update();
		}
	}

}
