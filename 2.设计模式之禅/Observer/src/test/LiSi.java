package test;

public class LiSi implements ILiSi {

	public void update(String context) {
		
		System.out.println("��˹���۲쵽�����ӻ����ʼ���ϰ�㱨��...");
		this.reportToQinShiHuang(context);
		System.out.println("��˹���㱨���...\n");
		
	}
	
	private void reportToQinShiHuang(String reportContext) {
		
		System.out.println("��˹�����棬���ϰ壡�������л��--->" + reportContext);
		
	}

}
