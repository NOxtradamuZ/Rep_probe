package basePruebas;

public class AllTerrain extends Car {
	
	private int trunkCapacity;
	private int maxEngine;
	
	public AllTerrain(String brand, String type, float speed, int trunkCapacity, int maxEngine) {
		super(brand, type, speed);
		this.trunkCapacity = trunkCapacity;
		this.maxEngine = maxEngine;
		}
	
	public int getCapacity() {
		return this.trunkCapacity;
	}
	
	public int getEngine() {
		return this.maxEngine;
	}
	
	public void run() {
		super.run();
		System.out.println("Go Monster Truck");
	}
	
	public void stop() {
		super.stop();
		System.out.println("RIP your Monster Truck");
	}
}
