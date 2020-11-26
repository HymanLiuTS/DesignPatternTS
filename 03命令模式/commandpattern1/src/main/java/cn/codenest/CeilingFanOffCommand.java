package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 06-3��-2020 9:14:10
 */
public class CeilingFanOffCommand implements Command {

	private CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanOffCommand(CeilingFan celingFan){
		this.ceilingFan=celingFan;
	}

	@Override
	public void execute() {
		prevSpeed=ceilingFan.getSpeed();
		ceilingFan.off();
	}

	public void undo(){
		switch (prevSpeed){
			case CeilingFan.HIGH:
				ceilingFan.high();
				break;
			case CeilingFan.MEDIUM:
				ceilingFan.medium();
				break;
			case CeilingFan.LOW:
				ceilingFan.low();
				break;
			case CeilingFan.OFF:
				ceilingFan.off();
				break;
		}

	}
}//end CeilingFanHighCommand