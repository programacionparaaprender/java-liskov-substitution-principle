package birds.design2;

public class FlightBird extends Bird {
	public void fly() { 
		System.out.println("fly: " + this.getClass().getSimpleName());
	}
}
