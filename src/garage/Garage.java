package garage;

import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> vehicles = new ArrayList<>();

	// Constructor
	public Garage() {
	}

	// Methods

	public void addType(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void removeType(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	public void emptyGarage() {
		vehicles.clear();
	}

	public double fixVehicle(Vehicle vehicle) {
		for (Vehicle handle : vehicles) {
			return handle.getCost();
		}
		return 0;
	}
	
	public void removeVehiclesByType(String mytype) {
		ArrayList<Vehicle> removedVehicles = new ArrayList<>();
			
		}
	
		

	public void printVehicles() {
		for (Vehicle handle : vehicles) {
			System.out.println(handle);
		}

	}
}
