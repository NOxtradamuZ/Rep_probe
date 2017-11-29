package Carro.accesories;


public class Wheel {
	
	private float radius;
	private String weather;
	
	public Wheel () {
		
	}
	
	public Wheel (float radius, String weather) {
		this.radius = radius;
		this.weather = weather;
	}
		
	//public int getRadius () {
	//	return this.radius;
	//}
	
	//public String getWeather () {
	//	return this.weather;
	//}
	
	public void rotate() {
		System.out.println("Rotate the hot wheels");
	}
}
