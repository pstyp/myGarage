package garage;

public abstract class Vehicle {

	// Attributes

	protected String size;
	protected int age;
	protected String colour;
	protected String type;

	
	// Constructor

	public Vehicle() {
		super();
		this.size = "medium";
		this.age = 1;
		this.colour = "black";
		this.type = "generic";
	}
	
	// Constructor

	public Vehicle(String size, int age, String colour, String type) {
		this.size = size;
		this.age = age;
		this.colour = colour;
		this.type = type;
	}



	//Methods
	
	public double getCost() {
		return 1.00;
	}
	
	public void ride() {
		System.out.println("vroom");

	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
