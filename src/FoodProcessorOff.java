
public class FoodProcessorOff implements Command {
	FoodProcessor fProcess;
	
	public FoodProcessorOff(FoodProcessor fProcess) {
		this.fProcess = fProcess;
	}
	
	public void execute() {
		fProcess.off();
	}

}
