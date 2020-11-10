package oop;

public class Animal {
	
	
// Attributes
	
	protected String size;
	protected int lifespan;
	protected String habitat; 

// Constructor
	
	public Animal(String size, int lifespan, String habitat) {
		super();
		this.size=size;
		this.lifespan=lifespan;
		this.habitat=habitat;

	// alt+shift+s
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getLifespan() {
		return lifespan;
	}

	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	// Methods
	public void sleep() {
		System.out.println("Animal sleeps");
	}
	public void move() {
		System.out.println("Animal moves");
	}
	public void eat(String food) {
		System.out.println(this.size + " animal eats "+food);
	}
}



