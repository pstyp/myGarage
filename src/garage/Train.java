package garage;

public class Train extends Vehicle {
	// Attributes
	private int wheels;
	private boolean ticketsRequired;

	// Constructor
	public Train() {
	super();
	this.wheels=100;
	this.type="train";
	this.ticketsRequired=true; 
	}
			// Constructor
	public Train(String size, int age, String colour, String type, int wheels, boolean ticketsRequired) {
		super(size, age, colour, type);
		this.wheels = wheels;
		this.ticketsRequired = ticketsRequired;
	}
	

	// Methods

	@Override
	public void ride() {
		System.out.println("choo choo!");
	}
	@Override
	public double getCost() {
		return 50 + 25;
	}
}
