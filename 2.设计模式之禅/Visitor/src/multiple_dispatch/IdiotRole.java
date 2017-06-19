package multiple_dispatch;

public class IdiotRole implements Role {

	public void accept(AbstractActor actor) {
		
		actor.act(this);
	}

}
