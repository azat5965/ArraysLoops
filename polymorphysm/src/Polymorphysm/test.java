package Polymorphysm;

public class test {
	public static void main(String[] args) {
//reference side     object side
//super class		child class
		father f1=new child();
		f1.drive();
		f1.shave();
		((child)f1).sayHi();
		
		
		
		child f2=new grandChild();
		f2.drive();
		f2.sayHi();
		f2.shave();
	
		((grandChild)f2).cry();
		System.out.println("===============");
		father f3=new grandChild();
		f3.shave();
		f3.drive();
		((child)f3).sayHi();
		((grandChild)f3).cry();
		
		
		
			
		
	}

}
