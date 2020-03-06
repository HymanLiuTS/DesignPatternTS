package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 06-3��-2020 9:14:10
 */
public class CeilingFanHighCommand implements Command {

	private CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanHighCommand(CeilingFan celingFan){
		this.ceilingFan=celingFan;
	}

	@Override
	public void execute() {
		prevSpeed=ceilingFan.getSpeed();
		ceilingFan.high();
	}

	public void undo(){
		switch (prevSpeed){
			case CeilingFan.HIGH:
				ceilingFan.high();
			case CeilingFan.MEDIUM:
				ceilingFan.medium();
			case CeilingFan.LOW:
				ceilingFan.low();
			case CeilingFan.OFF:
				ceilingFan.off();
		}

	}
}//end CeilingFanHighCommand