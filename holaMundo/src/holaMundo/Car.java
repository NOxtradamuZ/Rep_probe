package holaMundo;

public class Car {

	private String brand;
	private String type;
	private float speed;
	private Engine engine;
	
	private Engine getEngine() {
		if (this.engine == null) {
			this.engine = new Engine (); //Crea el motor para el coche
		}
		return this.engine;
	}
	
	public Car() {
		
	}
	
	public Car(String brand, String type, float speed) {
		//super();
		this.brand = brand;
		this.type = type;
		this.speed = speed;
		//this.engine = engine;  // Se puede poner así, sin embargo, crearlo de la otra forma es más elegante
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
	
	public void run() {
		this.getEngine().runEngine();
		System.out.println("Run");
	}
	
	//public void move() {
		//this.getEngine.moveEngine();
		//System.out.println("Move");  //Se borra esta parte, porque no hace falta
	//}
	
	public void stop() {
		this.getEngine().stopEngine();
		System.out.println("Stop");
	}
}