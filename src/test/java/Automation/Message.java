package Automation;

public class Message {
	
	public String message = "";
	
	public Message() {
		
	}
	
	public Message(String message) {
		this.message = message;
	}
	
	
	public void printMessage() {
		System.out.println(message);
		int a =0;
	    int b = 1/a;
	}
	
	public String SystemMessage() {
		message = "Test 3" + message;
		System.out.println(message);
		
		return message;
	}
	

}
