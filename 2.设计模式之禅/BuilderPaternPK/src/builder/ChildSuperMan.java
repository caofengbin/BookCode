package builder;

public class ChildSuperMan extends Builder {

	@Override
	public SuperMan getSuprMan() {
		
		super.setBody("强壮的躯体");
		super.setSpecialTalent("刀枪不入");
		super.setSpecialSymbol("胸前带小S标志");
		
		return super.superMan;
	}

}
