package garage;

public class Car extends Vehicle {
	// Attributes
	private int wheels;

	public Car() {
		super();
		this.wheels = 4;
		this.type="car";
	}

	// Constructor
	public Car(String size, int age, String colour, String type, int wheels) {
		super(size, age, colour, type);
		this.wheels = wheels;
	}

	// Methods

	@Override
	public void ride() {
		System.out.println("vroom vroom");
	}
	@Override
	public double getCost() {
		return 100 * 12;
	}
}
