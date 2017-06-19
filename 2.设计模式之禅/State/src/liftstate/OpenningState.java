package liftstate;

public class OpenningState extends LiftState {

	@Override
	public void close() {
		
		super.context.setLiftState(Context.closingState);
		super.context.getLiftState().close();
	}

	@Override
	public void open() {
		
		System.out.println("µçÌÝÃÅ¿ªÆô...");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
