package test;

public class MultiThread extends Thread{
	private SignInfo signInfo;
	
	public MultiThread(SignInfo signInfo) {
		this.signInfo = signInfo;
	}
	
	public void run() {
		if (!signInfo.getId().equals(signInfo.getLocation())) {
			System.out.println("id : " + signInfo.getId());
			System.out.println("location : " + signInfo.getLocation());
			System.out.println("Thread not safety !");
		}
	}
}
