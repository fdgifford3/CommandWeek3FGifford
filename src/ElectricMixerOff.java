
public class ElectricMixerOff implements Command {
	ElectricMixer eMixer;
	
	public ElectricMixerOff(ElectricMixer eMixer) {
		this.eMixer = eMixer;
	}
	
	public void execute() {
		eMixer.off();
	}
}
