package test;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	public Map<?, ?> getUserBaseInfo() {

		HashMap<String, String> baseInfoMap = new HashMap<String, String>();
		baseInfoMap.put("userName", "这个员工叫混世魔王...");
		baseInfoMap.put("mobileNumber", "这个员工电话是...");
		
		return baseInfoMap;
		
	}

	public Map<?, ?> getUserHomeInfo() {
		
		HashMap<String, String> homeInfo = new HashMap<String, String>();
		homeInfo.put("homeTelNumber", "员工的家庭电话是...");
		homeInfo.put("homeAddress", "员工的家庭地址是...");
		
		return homeInfo;
	}

	public Map<?, ?> getUserOfficeInfo() {

		HashMap<String, String> officeInfo = new HashMap<String, String>();
		officeInfo.put("jobPosition", "这个人的职位是BOSS...");
		officeInfo.put("officeTelNumber", "员工的办公电话是...");
		
		return officeInfo;
	}

}
