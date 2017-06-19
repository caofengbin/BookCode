package test;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {
	
	private Map<?, ?> baseInfo = super.getUserBaseInfo();
	
	private Map<?, ?> homeInfo = super.getUserHomeInfo();
	
	private Map<?, ?> officeInfo = super.getUserOfficeInfo();

	public String getHomeAddress() {
		
		String homeAddress = (String)this.homeInfo.get("homeAddress");
		System.out.println(homeAddress);
		
		return homeAddress;
		
	}

	public String getHomeTelNumber() {

		String homeTelNumber = (String)this.homeInfo.get("homeTelNumber");
		System.out.println(homeTelNumber);
		
		return homeTelNumber;
	}

	public String getJobPosition() {

		String jobPosition = (String) this.officeInfo.get("jobPostion");
		System.out.println(jobPosition);
		
		return jobPosition;
	}

	public String getMobileNumber() {
		
		String mobileNumber = (String)this.baseInfo.get("mobileNumber");
		System.out.println(mobileNumber);
		
		return mobileNumber;
	}

	public String getOfficeTelNumber() {

		String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
		System.out.println(officeTelNumber);
		
		return officeTelNumber;
	}

	public String getUserName() {

		String userName = (String) this.baseInfo.get("userName");
		System.out.println(userName);
		
		return userName;
	}

}
