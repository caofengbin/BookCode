package builder;

public class AdultSuperMan extends Builder {

	@Override
	public SuperMan getSuprMan() {
		
		super.setBody("强壮的躯体");
		super.setSpecialTalent("会飞行");
		super.setSpecialSymbol("胸前带S标记");
		
		return super.superMan;
	}

}
