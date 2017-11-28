package holaMundo;

public class SportsCar extends Car {
	
	private int trunkCapacity;
	private int maxEngine;
	
	public SportsCar(String brand, String type, float speed, int trunkCapacity, int maxEngine) {
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
		System.out.println("Feel the power of the Sport Car");
	}
	
	public void stop() {
		super.stop();
		System.out.println("Why in the hell you choose to stop this monster");
	}
}
