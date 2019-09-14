
public class ElectricMixerOn implements Command {
	ElectricMixer eMixer;
	
	public ElectricMixerOn(ElectricMixer eMixer) {
		this.eMixer = eMixer;
	}
	
	public void execute() {
		eMixer.low(); //default speed to low so things don't splatter
	}
}
