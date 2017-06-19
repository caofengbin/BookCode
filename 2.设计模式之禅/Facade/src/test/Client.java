package test;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ModernPostOffice helloRoadPostOffice = new ModernPostOffice();
		
		String address = "Happy Road No.666,God Province,Heaven";
		
		String context = "Hello, It's me, do you know who I am? I'm your old lover.I'd like to...";
//
//		ILetterProcess letterProcess = new LetterProcess();
//		letterProcess.writeContext("Hello, It's me, do you know who I am? I'm your old lover.I'd like to...");
//		
//		letterProcess.fillEnvelope("Happy Road No.666,God Province,Heaven");
//		
//		letterProcess.letterIntoEnvelope();
//		
//		letterProcess.sendLetter();
//		
		helloRoadPostOffice.sendLetter(context, address);
	}

}
