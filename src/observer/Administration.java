package observer;

public class Administration implements IBookInPoorCondition {

	@Override
	public void update() {
		System.out.println("Administración: ");
		System.out.println("Envio una queja formal...");
	}

}
