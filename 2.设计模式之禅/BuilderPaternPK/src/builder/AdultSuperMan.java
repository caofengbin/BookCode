package builder;

public class AdultSuperMan extends Builder {

	@Override
	public SuperMan getSuprMan() {
		
		super.setBody("ǿ׳������");
		super.setSpecialTalent("�����");
		super.setSpecialSymbol("��ǰ��S���");
		
		return super.superMan;
	}

}
