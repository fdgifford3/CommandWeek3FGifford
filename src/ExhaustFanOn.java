
public class ExhaustFanOn implements Command {
	ExhaustFan exhaustFan;
	
	public ExhaustFanOn(ExhaustFan exhaustFan) {
		this.exhaustFan = exhaustFan;
	}
	
	public void execute() {
		exhaustFan.high(); 
	}

}
