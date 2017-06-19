package test;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	public Map<?, ?> getUserBaseInfo() {

		HashMap<String, String> baseInfoMap = new HashMap<String, String>();
		baseInfoMap.put("userName", "���Ա���л���ħ��...");
		baseInfoMap.put("mobileNumber", "���Ա���绰��...");
		
		return baseInfoMap;
		
	}

	public Map<?, ?> getUserHomeInfo() {
		
		HashMap<String, String> homeInfo = new HashMap<String, String>();
		homeInfo.put("homeTelNumber", "Ա���ļ�ͥ�绰��...");
		homeInfo.put("homeAddress", "Ա���ļ�ͥ��ַ��...");
		
		return homeInfo;
	}

	public Map<?, ?> getUserOfficeInfo() {

		HashMap<String, String> officeInfo = new HashMap<String, String>();
		officeInfo.put("jobPosition", "����˵�ְλ��BOSS...");
		officeInfo.put("officeTelNumber", "Ա���İ칫�绰��...");
		
		return officeInfo;
	}

}
