import java.util.HashSet;
import java.util.LinkedHashSet;

/**create one phone class
		 * create 3 arg constructor(Name,Model,Price);
		 * create 5 different object using thid constructor(3 of them
		 * create one LinkedHashSet
		 * store all the objects to the linkedHashSet
		 * using foreach loop print out all the phone names and models
		 * which price is less than 1000
		 * 
		 */
public class phone {
	String name;
	String model;
	int price;
	
	public phone(String name, String model, int price) {
		this.name=name;
		this.model=model;
		this.price=price;
	}
	public static void main(String[] args) {
		phone Samsung=new phone("Samsung", "A5",100);
		phone Iphone=new phone("Iphone", "Iphone 6", 1200);
		phone Nokia=new phone("Nokia","6300",1000);
		phone Motorola=new phone("Motorola","6310", 400);
		phone Sony=new phone("Sony","599",700);
		LinkedHashSet<phone>phones=new LinkedHashSet<phone>();
		phones.add(Samsung);
		phones.add(Iphone);
		phones.add(Nokia);
		phones.add(Motorola);
		phones.add(Sony);
		
		for(phone n: phones) {
			if(n.price<1000) {
			System.out.println("Phone name is "+n.name+" model is "+n.model);
			
			}
		}
	}
	
	

}
