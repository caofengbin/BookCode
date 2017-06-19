package test;

import java.util.ArrayList;

public interface IRoot {

	public String getInfo();
	
	public void add(IBranch branch);
	
	public void add(ILeaf leaf);
	
	public abstract ArrayList<?> getSubordinateInfo();
	
}
