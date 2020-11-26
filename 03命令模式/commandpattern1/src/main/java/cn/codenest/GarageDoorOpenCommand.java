package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 */
public class GarageDoorOpenCommand implements Command {

	private GarageDoor garageDoor;
	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor=garageDoor;
	}

	public void finalize() throws Throwable {

	}
	public void  execute(){
		garageDoor.open();
	}

	@Override
	public void undo() {
		garageDoor.close();
	}
}//end GarageDoorOpenCommand