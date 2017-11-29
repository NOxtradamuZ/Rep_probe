package Carro;
import Carro.accesories.Wheel;;


public class Car {

//	private Wheel[] wheels;
	private int velocity;
	private Wheel[] wheels;
	private final int DEFAULT_VELOCITIY = 120;
	
	//private Wheel rueda = new Wheel(5,"mojado");
	
	//public Wheel getWheels() {
		//if (this.wheels == null) {
		//	this.wheels = new Wheel (); //Crea el motor para el coche
		//}
		//return this.wheels;
	//}
			
	public Car() {
		this.velocity = this.DEFAULT_VELOCITIY;
		this.wheels = this.createWheels();
	}
	
	public Car(int velocity) {
		//super();
		this.velocity = velocity;		
		this.wheels = this.createWheels();
	}
	
	public int getVelocity() {
		return velocity;
	}
	
	public int setVelocity(int velocity) {
		this.velocity = velocity;
		return this.velocity;
	}
	
	public Wheel[] getWheels() {
		return wheels;
	}
		
	public boolean setWheels(Wheel[] wheels) {
		this.wheels = wheels;
		return true;
	}	
	
	private Wheel[] createWheels() {
		Wheel[] wheels = new Wheel [4];
		
		wheels[0] = new Wheel(20, "Mojado");
		wheels[1] = new Wheel(21, "Seco");
		wheels[2] = new Wheel(22, "Tierra");
		wheels[3] = new Wheel(23, "Asfalto");
	
		return wheels;
	}
}