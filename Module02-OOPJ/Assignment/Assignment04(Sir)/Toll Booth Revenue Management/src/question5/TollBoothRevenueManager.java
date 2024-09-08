package question5;

public class TollBoothRevenueManager {
	private double carTollRate;
	private double truckTollRate;
	private double motorcycleTollRate;

	private int numCars;
	private int numTrucks;
	private int numMotorcycles;

	public TollBoothRevenueManager(double carTollRate, double truckTollRate, double motorcycleTollRate, int numCars,
			int numTrucks, int numMotorcycles) {
		super();
		this.carTollRate = carTollRate;
		this.truckTollRate = truckTollRate;
		this.motorcycleTollRate = motorcycleTollRate;
		this.numCars = numCars;
		this.numTrucks = numTrucks;
		this.numMotorcycles = numMotorcycles;
	}

	public double getCarTollRate() {
		return carTollRate;
	}

	public void setCarTollRate(double carTollRate) {
		this.carTollRate = carTollRate;
	}

	public double getTruckTollRate() {
		return truckTollRate;
	}

	public void setTruckTollRate(double truckTollRate) {
		this.truckTollRate = truckTollRate;
	}

	public double getMotorcycleTollRate() {
		return motorcycleTollRate;
	}

	public void setMotorcycleTollRate(double motorcycleTollRate) {
		this.motorcycleTollRate = motorcycleTollRate;
	}

	public int getNumCars() {
		return numCars;
	}

	public void setNumCars(int numCars) {
		this.numCars = numCars;
	}

	public int getNumTrucks() {
		return numTrucks;
	}

	public void setNumTrucks(int numTrucks) {
		this.numTrucks = numTrucks;
	}

	public int getNumMotorcycles() {
		return numMotorcycles;
	}

	public void setNumMotorcycles(int numMotorcycles) {
		this.numMotorcycles = numMotorcycles;
	}

	public int calculateTotalVehicles() {
		return numCars + numTrucks + numMotorcycles;
	}

	public double calculateRevenue() {
		return (carTollRate * numCars) + (truckTollRate * numTrucks) + (motorcycleTollRate * numMotorcycles);
	}

	@Override
	public String toString() {
		return String.format(
				"Car Toll Rate : Rs%.2f\nTruck Toll Rate : Rs%.2f\nMotorcycle Toll Rate : Rs%.2f\nNumber of Cars : %d\nNumber of Trucks : %d\nNumber of Motorcycles : %d",
				this.carTollRate, this.truckTollRate, this.motorcycleTollRate, this.numCars, this.numTrucks,
				this.numMotorcycles);
	}

}
