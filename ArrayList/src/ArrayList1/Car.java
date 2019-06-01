package ArrayList1;
/** 1. Create car class;
 * 2. Create private fields: name String, year int, price as double
 * 3. Add getters and setters for all of them
 * 4. Create 1 arg constructor to set the name field, year and price
 * 5. Create 3 args constructor to set the name field, year and price
 * 6.Create toString method to return useful information about object
 * 7.Create 5 car instances in a class called CarShow with main method
 * 8. add them to ArrayList object
 * 9. print their info using toString method
 * 10. then increase the price of the cars 20%
 * @author Asiyat
 *
 */
public class Car {
	private String name;
	private int year;
	private double price;
	
	public void setName (String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getYear() {
		return year;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	
	public  Car (String name) {
		this.name=name;
	}
	
	public void increasePrice(double price) {
		//100= 100+20=120; 
		this.price=price+price*0.2;
	}
	public Car (String name, int year, double price) {
		this.name=name;
		this.year=year;
		this.price=price;
	}
	
	public  String toString() {

		
		return "Name: "+ name +"Year: "+year+ "Price: "+price;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
