package Encapsulation;

public class testPerson {
	public static void main(String[] args) {
		person p1=new person();
		
		p1.setName("Michael");
		System.out.println(p1.getName());
		
		p1.setlastName("Clark");
		System.out.println(p1.getLastName());
		
		p1.setAge(21);
		System.out.println(p1.getAge());
		
		p1.setSSN("888-88-888");
		System.out.println(p1.getSSN());
		
		p1.setGender('M');
		System.out.println(p1.getGender());
	}

}
