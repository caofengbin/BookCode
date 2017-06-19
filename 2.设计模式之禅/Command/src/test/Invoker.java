package test;

public class Invoker {

	private Command command;
	
	public void setcommand(Command command) {
		this.command = command;
	}
	
	public void action() {
		this.command.execute();
	}
	
}
