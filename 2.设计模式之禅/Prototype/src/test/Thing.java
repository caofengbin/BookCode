package test;

import java.util.ArrayList;

public class Thing implements Cloneable {

	private ArrayList<String> arrayList = new ArrayList<String>();

	@Override
	protected Thing clone() throws CloneNotSupportedException {
		
		Thing thing = null;
		
		try {
			thing = (Thing)super.clone();
			this.arrayList = (ArrayList<String>)this.arrayList.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return thing;
		
	}	
	
	public void setValue(String value) {
		this.arrayList.add(value);
	}
	
	public ArrayList<String> getValue() {
		return this.arrayList;
	}
		
}
