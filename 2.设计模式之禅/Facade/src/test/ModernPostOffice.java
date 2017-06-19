package test;

public class ModernPostOffice {
	
	private ILetterProcess letterProcess = new LetterProcess();
	
	private Police letterPolice = new Police();
	
	public void sendLetter(String context, String address) {
		
		letterProcess.writeContext(context);
		letterProcess.fillEnvelope(address);
		
		letterPolice.checkLetter(letterProcess);
		
		letterProcess.letterIntoEnvelope();
		letterProcess.sendLetter();
		
	}
	
}
