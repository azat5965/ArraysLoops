package Interface;

public class test {
	public static void main(String[] args) {
		iphone i=new iphone();
		i.download();
		i.call(38489494);
		
		samsungPhone sp=new samsungPhone();
		sp.call(4555555);
		System.out.println(sp.getFiles());
		System.out.println(i.getFiles());
		
		memoryCard.staticMethod();
		iphone.staticMethod();
		System.out.println("====================================");
		
		camera c=new iphone();
		System.out.println(c.getPicture());
		System.out.println(((Phone)c).getFiles());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
