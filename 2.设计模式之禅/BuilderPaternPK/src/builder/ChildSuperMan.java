package builder;

public class ChildSuperMan extends Builder {

	@Override
	public SuperMan getSuprMan() {
		
		super.setBody("ǿ׳������");
		super.setSpecialTalent("��ǹ����");
		super.setSpecialSymbol("��ǰ��СS��־");
		
		return super.superMan;
	}

}
