package test;

public class Women implements IWomen {
	
	/**
	 * 通过一个int类型的参数来描述妇女的个人状况
	 * 1--未出嫁
	 * 2--出嫁
	 * 3--夫死
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
