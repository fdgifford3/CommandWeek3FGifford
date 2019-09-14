
public class Oven {
	int temp = 350; //Default oven preheat temp is 350 degrees fahrenheit
	String description = "Oven";
	
	public void on() {
		this.temp = 350;
		System.out.println("The " + this.description + " has been turned on. \nThe " + 
		this.description + "'s temperature has been set to " + this.temp + ".");
	}
	
	public void off() {
		this.temp = 0;
		System.out.println("The " + this.description + " has been turned off.");
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
		System.out.println("The " + this.description + "'s tempurature has been set to " + this.temp + ".");
	}
	
	public int getTemp() {
		return temp;
	}
	
	public String getDescription() {
		return description;
	}
	
}
