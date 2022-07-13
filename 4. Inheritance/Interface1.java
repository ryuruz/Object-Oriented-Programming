interface PhoneInterface1 { 
	final int TIMEOUT = 10000; 
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}
class Samsung implements PhoneInterface1{
	@Override
	public void sendCall() {
		System.out.println("띠리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	
	public void flash() {System.out.println("전화기에 불이 켜졌습니다.");};
}
public class Interface1 {
	public static void main(String [] args) {
		Samsung p = new Samsung();
		p.printLogo();
		p.sendCall();
		p.receiveCall();
		p.flash();
	}
}