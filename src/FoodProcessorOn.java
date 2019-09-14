
public class FoodProcessorOn implements Command {
	FoodProcessor fProcess;
	
	public FoodProcessorOn(FoodProcessor fProcess) {
		this.fProcess = fProcess;
	}
	
	public void execute() {
		fProcess.low(); //default speed to low so things don't splatter
	}

}
