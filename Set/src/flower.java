import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class flower {
	String name;
	int price;
	
	public flower(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public static void main(String[] args) {
		
		flower rose=new flower("Rose",10 );
		flower tulip=new flower("Tulip",15);
		flower orchid=new flower("Orchid",20);
		
		System.out.println(rose.name);
		System.out.println(rose.price);
		
		Set<flower>flowers=new HashSet<flower>();
		flowers.add(rose);
		flowers.add(tulip);
		flowers.add(orchid);
		
	//	Iterator i=flowers.iterator();
	//	while(i.hasNext()) {
	//		System.out.println(i.next());
	//	}
		for(flower fl: flowers) {
			System.out.println(fl.name);
			System.out.println(fl.price);
		}
		
	}

}
