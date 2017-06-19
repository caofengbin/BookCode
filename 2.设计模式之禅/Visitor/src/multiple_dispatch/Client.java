package multiple_dispatch;

public class Client {

	public static void main(String[] args) {
		
		AbstractActor actor = new OldActor();
		AbstractActor young = new YoungActor();
		
		Role role = new GongFuRole();
		actor.act(role);
		actor.act(new GongFuRole());
		
		Role idiotRole = new IdiotRole();
		role.accept(actor);
		role.accept(young);
		
		idiotRole.accept(actor);
		idiotRole.accept(young);

	}

}
