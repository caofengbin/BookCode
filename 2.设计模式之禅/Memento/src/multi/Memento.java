package multi;

import java.util.HashMap;

public class Memento {

	private HashMap<String, Object> stateMap;
	
	public Memento(HashMap<String, Object> map) {
		
		this.stateMap = map;
		
	}

	public HashMap<String, Object> getStateMap() {
		
		return stateMap;
		
	}

	public void setStateMap(HashMap<String, Object> stateMap) {
		
		this.stateMap = stateMap;
		
	}
	
	public void restoreMemento(Memento memento) {
		
		BeanUtils.restoreProp(this, memento.getStateMap());
		
	}
	
}
