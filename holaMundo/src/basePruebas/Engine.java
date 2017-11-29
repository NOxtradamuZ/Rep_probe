package basePruebas;

public class Engine {
	
	private int intake;
	private int numPiston;
	private int engineCapacity;

	public Engine() {
		
	}
	
	public Engine(int intake, int numPiston, int engineCapacity) {
		//super();
		this.intake = intake;
		this.numPiston = numPiston;
		this.engineCapacity = engineCapacity;
	}
	
	public int getIntake() {
		return this.intake;
	}
	
	public int getnumPiston() {
		return this.numPiston;
	}
	
	public int getEngineCapacity() {
		return this.engineCapacity;
	}
		
	public void runEngine() {
		System.out.println("Run the engine");
	}
	
	//public void moveEngine() {
		//System.out.println("CarMover the engine");
	//}
	
	public void stopEngine() {
		System.out.println("Stop the engine");
	}
	
}