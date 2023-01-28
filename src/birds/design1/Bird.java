package birds.design1;

public class Bird {
	public void fly() { 
		System.out.println("fly: " + this.getClass().getSimpleName());
	}
	
	public void eat() { 
		System.out.println("eat");
	}
}