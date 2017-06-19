package multiple_dispatch;

public class GongFuRole implements Role {

	public void accept(AbstractActor actor) {
		
		actor.act(this);
	}

}
