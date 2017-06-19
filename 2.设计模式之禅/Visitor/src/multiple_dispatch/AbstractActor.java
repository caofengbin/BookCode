package multiple_dispatch;

public abstract class AbstractActor {

	public void act(Role role) {
		
		System.out.println("演员可以扮演任何角色");
	}
	
	public void act(GongFuRole role) {
		
		System.out.println("演员可以演功夫角色");
	}
	
}
