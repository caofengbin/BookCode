package multiple_dispatch;

public abstract class AbstractActor {

	public void act(Role role) {
		
		System.out.println("��Ա���԰����κν�ɫ");
	}
	
	public void act(GongFuRole role) {
		
		System.out.println("��Ա�����ݹ����ɫ");
	}
	
}
