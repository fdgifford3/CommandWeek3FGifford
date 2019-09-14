
public class ExhaustFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String description = "Exhaust Fan";
	int speed;
	
	public ExhaustFan() {
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
		System.out.println("The " + this.description + "'s speed has been set to high.");
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println("The " + this.description + "'s speed has been set to medium.");
	}
	
	public void low() {
		speed = LOW;
		System.out.println("The " + this.description + "'s speed has been set to low.");
	}
	
	public void off() {
		speed = OFF;
		System.out.println("The " + this.description + " has been turned off.");
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String getDescription() {
		return description;
	}
}
