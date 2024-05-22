package observer;

public class Purchases implements IBookInPoorCondition {
	
	public void update() {
		System.out.println("Compras: ");
		System.out.println("Solicito nueva cotización...");
	}
}
