package Interface;

public class iphone extends Phone {
	
	public static void staticMethod() {
		System.out.println("iphone class static method");
	}
	@Override
	public String getPicture() {
		return "Getting picture from Iphone";
	}
	@Override
	public void download() {
		System.out.println("Iphone is downloading");
	}
	@Override
	public Number getFiles() {
		return 25;
	}
	@Override
	public String getName() {
		return "IphoneName";
	}
	@Override
	public void lock() {
		System.out.println("Iphone is locked");
	}
	@Override
	public void call(long number) {
		System.out.println("Iphone is calling to "+number);
			}
	@Override
	public void text(long number) {
		System.out.println("Iphone is texting to"+number);
	}
	@Override
	public void takePicture() {
		System.out.println("Taking picture in Iphone");
		
		
	}
	

}
