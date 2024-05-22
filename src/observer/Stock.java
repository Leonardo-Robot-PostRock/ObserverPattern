package observer;

public class Stock implements IBookInPoorCondition {

	public void update() {
		System.out.println("Stock: ");
		System.out.println("Le doy de baja");
	}
}
