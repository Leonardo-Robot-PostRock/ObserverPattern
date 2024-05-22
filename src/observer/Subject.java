package observer;

public interface Subject {

	public void attach(IBookInPoorCondition observer);

	public void dettach(IBookInPoorCondition observer);

	public void notifyObservers();
}
