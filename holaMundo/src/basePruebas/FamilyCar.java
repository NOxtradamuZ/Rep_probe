package basePruebas;

public class FamilyCar extends Car {
	
	private int trunkCapacity;
	private int maxEngine;
	
	public FamilyCar(String brand, String type, float speed, int trunkCapacity, int maxEngine) {
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
		System.out.println("Family road to the school");
	}
	
	public void stop() {
		super.stop();
		System.out.println("F**ck the family, buy a Ferrari");
	}
}
