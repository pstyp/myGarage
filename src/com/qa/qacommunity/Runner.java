package com.qa.qacommunity;

import garage.Car;
import garage.Garage;
import garage.Train;
import oop.Cat;
import oop.Cow;
import oop.Dog;

public class Runner {
	public static void main(String[] args) {
		// UniqueSum.start();
		Car sampleVehicle = new Car("large", 10, "black", "car", 4);
		Train sampleVehicle2 = new Train();
		Garage sampleGarage = new Garage();

		System.out.println("This is vehicle 1: " + sampleVehicle.getSize());
		

		sampleVehicle.ride();
		sampleGarage.addType(sampleVehicle);
		sampleGarage.printVehicles();
		sampleGarage.removeType(sampleVehicle);
		sampleGarage.addType(sampleVehicle2);
		sampleGarage.printVehicles();
		
		
		System.out.println("The cost is: " + sampleVehicle.getCost());
		
		
		System.out.println(sampleVehicle instanceof Car);
	}

	public static void oopExercise() {
		Cat genericAnimal = new Cat("white", true, "small", 1, "UK");
		Cow genericAnimal2 = new Cow("brown", true, "big", 1, "UK");
		Dog genericAnimal3 = new Dog("black", true, "massive", 1, "UK");

		genericAnimal3.move();
		genericAnimal2.sleep();
		genericAnimal3.eat("banana");
		genericAnimal.canMeow();
		genericAnimal3.canWoof();
	}
}
