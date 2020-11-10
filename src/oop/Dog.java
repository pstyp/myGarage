package oop;

public class Dog extends Animal {
	// Attributes 
		private String colour;
		private boolean canWoof = true;

		// Constructor
		public Dog(String colour, boolean canWoof, String size, int lifespan, String habitat) {
			super(size, lifespan, habitat);
			this.canWoof=true;
			this.colour=colour;
		}


	// Methods

	public boolean canWoof() {
		return canWoof;
}
}
