package oop;

public class Cat extends Animal {

	// Attributes
	private String colour;
	private boolean canMeow = true;

	// Constructor
	public Cat(String colour, boolean canMeow, String size, int lifespan, String habitat) {
		super(size, lifespan, habitat);
		this.canMeow = true;
		this.colour = colour;
	}

    // Methods

	public boolean canMeow() {
		return canMeow;
	}
}