package ArrayList1;

import java.util.ArrayList;


public class CarShow {
	public static void main(String[] args) {
		
	
	Car myCar1=new Car("Nissan",2012,13000.00);
	Car myCar2=new Car("Toyota", 2015, 18000);
	Car myCar3=new Car("Lexus",2019,35000);
	Car myCar4=new Car("Honda", 2019,23000);
	Car myCar5=new Car("Lamborgini", 2019,50000.00);
	
	ArrayList<Car>carList=new ArrayList<Car>();
	carList.add(myCar1);
	carList.add(myCar2);
	carList.add(myCar3);
	carList.add(myCar4);
	carList.add(myCar5);
	
	for(int i=0; i<carList.size();i++){
		
	   // this.price =13000+2600;  
    	//carList.get(i).increasePrice(carList.get(i).getPrice());
	
	//	System.out.println(carList.get(i).getPrice());
		
		
		carList.get(i).setPrice(carList.get(i).getPrice()+carList.get(i).getPrice()*0.2);
		
	
		
		
		
	}
	
	}

}
