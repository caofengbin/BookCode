package multiple_dispatch;

public class OldActor extends AbstractActor {

	@Override
	public void act(GongFuRole role) {

		System.out.println("年龄大了，不能演功夫角色");
	}

}
