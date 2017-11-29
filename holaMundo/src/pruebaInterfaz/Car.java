package pruebaInterfaz;

public class Car extends Vehicule implements StartStop {

	private String brand;
	private String type;
	private float speed;
	
	
	
	public Car() {
		
	}
	
	public Car(String brand, String type, float speed) {
		//super();
		this.brand = brand;
		this.type = type;
		this.speed = speed;
		//this.engine = new Engine();  // Se puede poner así, sin embargo, crearlo de la otra forma es más elegante
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getType () {
		return this.type;
	}
	
	public float getSpeed() {
		return this.speed;
	}
	
	public void start() {
		System.out.println("Run");
	}
	
	//public void move() {
		//this.getEngine.moveEngine();
		//System.out.println("CarMover");  //Se borra esta parte, porque no hace falta
	//}
	
	public void stop() {
		System.out.println("Stop");
	}
	
	public void forward() {
		System.out.println("Moving forward");
	}
	
}