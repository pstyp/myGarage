package garage;

public class Bike extends Vehicle {
	// Attributes
	private int wheels;

	// Constructor
	public Bike() {
		super();
		this.wheels = 2;
		this.type = "bike";
	}

	// Constructor
	public Bike(String size, int age, String colour, String type, int wheels) {
		super(size, age, colour, type);
		this.wheels = wheels;
		this.type = type;
	}

// Methods

	@Override
	public void ride() {
		System.out.println("*cycling sound*");
	}

	@Override
	public double getCost() {
		return 200.00 + 5.00 * 12;
	}
}
