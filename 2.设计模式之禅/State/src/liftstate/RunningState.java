package liftstate;

public class RunningState extends LiftState {

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		
		System.out.println("电梯上下运行...");
		
	}

	@Override
	public void stop() {
		
		super.context.setLiftState(Context.stoppingState);
		super.context.getLiftState().stop();
		
	}

}
