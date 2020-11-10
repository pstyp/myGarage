package oop;

public class Cow extends Animal {
	// Attributes 
			private String colour;
			private boolean canMoo = true;

			// Constructor
			public Cow(String colour, boolean canMoo, String size, int lifespan, String habitat) {
				super(size, lifespan, habitat);
				this.canMoo=true;
				this.colour=colour;
			}


		// Methods

		public boolean canWoof() {
			return canMoo;
}
}
