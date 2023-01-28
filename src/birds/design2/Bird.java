package birds.design2;

public class Bird {
	public void eat() { 
		System.out.println("eat: " + this.getClass().getSimpleName());
	}
}