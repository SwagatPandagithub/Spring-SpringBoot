package in.iNeuron.Component;

public class Printer {
	
	private static Printer INSTANCE= null;
	
	private Printer() {
		System.out.println("Constructor made private");
	}
	
	static {
		System.out.println("Printer.class file is loading......");
	}
	
	public static Printer getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new Printer();
			System.out.println("new object is created....");
		}
		return INSTANCE;
	}

}
