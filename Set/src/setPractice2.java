import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setPractice2 {
	/**create one Set names is cities
	 * store following elements to the cities set collection 
	 *Chicago, Los Angeles, Irving, Austin, Austin
	 *iterate over the element and print 
	 *Irving is available in our Set if Irving is available
	 */
	public static void main(String[] args) {
		
	
	 
	 Set cities=new HashSet();
	 cities.add("Chicago");
	 cities.add("Los Angeles");
	 cities.add("Irving");
	 cities.add("Austin");
	 cities.add("Austin");
	 //object           method
	 Iterator i=cities.iterator();
	 while(i.hasNext()) {
		 if(i.next().equals("Irving")) {
			 System.out.println("Irving is available in our set");
		 }
		
	 } 
	 System.out.println(cities);
	 System.out.println(cities.contains("Austin"));
	 System.out.println(cities.contains("Asiyat"));
	 System.out.println(cities.isEmpty());
	 cities.clear();
	 System.out.println(cities.isEmpty());
	 System.out.println(cities);
	 
	 
	 
	 
	}	 


}
