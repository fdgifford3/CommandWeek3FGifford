
public class ExhaustFanOff implements Command {
	ExhaustFan exhaustFan;
	
	public ExhaustFanOff(ExhaustFan exhaustFan) {
		this.exhaustFan = exhaustFan;
	}
	
	public void execute() {
		exhaustFan.off(); 
	}

}
