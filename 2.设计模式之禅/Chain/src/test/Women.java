package test;

public class Women implements IWomen {
	
	/**
	 * ͨ��һ��int���͵Ĳ�����������Ů�ĸ���״��
	 * 1--δ����
	 * 2--����
	 * 3--����
	 */
	
	private int type = 0;
	
	private String request = "";
	
	public Women(int type, String request) {
		this.type = type;
		
		switch(this.type) {
		case 1:
			this.request = request;
			break;
		case 2:
			this.request = request;
			break;
		case 3:
			this.request = request;
			break;
		}
		
		this.request = request;
	}

	public String getRequest() {

		return this.request;
	}

	public int getType() {

		return this.type;
	}

}
