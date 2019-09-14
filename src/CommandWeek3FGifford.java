/*
 * Frederick Gifford
 * CPSC-60000 Week 3 Command Pattern with Baking Theme
 * 9.13.2019
 * Prof Nowak
 */
public class CommandWeek3FGifford {

	public static void main(String[] args) {
		System.out.println("Frederick Gifford\nCPSC-60000\nWeek 3 Command Pattern\n");
		
		RemoteControl remoteControl = new RemoteControl();
		
		// Instantiate Appliances
		Oven oven = new Oven();
		ElectricMixer eMixer = new ElectricMixer();
		FoodProcessor foodProcessor = new FoodProcessor();
		ExhaustFan exaustFan = new ExhaustFan();

		//Instantiate Command objects for appliances
		OvenOnCommand ovenOn = new OvenOnCommand(oven);
		OvenOffCommand ovenOff = new OvenOffCommand(oven);
		ElectricMixerOn eMixerOn = new ElectricMixerOn(eMixer);
		ElectricMixerOff eMixerOff = new ElectricMixerOff(eMixer);
		FoodProcessorOn foodProcessOn = new FoodProcessorOn(foodProcessor);
		FoodProcessorOff foodProcessOff = new FoodProcessorOff(foodProcessor);
		ExhaustFanOn exaustFanOn = new ExhaustFanOn(exaustFan);
		ExhaustFanOff exaustFanOff = new ExhaustFanOff(exaustFan);
		
		remoteControl.setCommand(0, ovenOn, ovenOff); //Oven
		remoteControl.setCommand(1, eMixerOn, eMixerOff); //Electronic Mixer
		remoteControl.setCommand(2, foodProcessOn, foodProcessOff); //Food Processor
		remoteControl.setCommand(3, exaustFanOn, exaustFanOff); //Exhaust Fan
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(0);
		remoteControl.offButtonWasPushed(1);
		remoteControl.offButtonWasPushed(2);
		remoteControl.offButtonWasPushed(3);
		
		remoteControl.onButtonWasPushed(4); //Testing. Nothing should happen for slot 4, it is still the NoCommand object
		remoteControl.offButtonWasPushed(4); //Testing. Nothing should happen for slot 4, it is still the NoCommand object

	}

}
