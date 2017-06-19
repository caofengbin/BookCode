package flyweight;

/**
 * ³éÏóÏíÔª½ÇÉ«
 * @author Administrator
 *
 */
public abstract class Flyweight {
	
	//private String intrinsic;
	
	protected final String Extrinsic;
	
	public Flyweight(String Extrinsic) {
		this.Extrinsic = Extrinsic;
	}
	
	public abstract void operate();

	public String getExtrinsic() {
		return Extrinsic;
	}

//	public void setIntrinsic(String intrinsic) {
//		this.intrinsic = intrinsic;
//	}
	
	
}
