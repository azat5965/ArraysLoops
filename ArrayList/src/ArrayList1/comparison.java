package ArrayList1;

import java.util.ArrayList;

public class comparison {
	public static void main(String[] args) {
		ArrayList<String>bookShelf1=new ArrayList<>();
		ArrayList<String>bookShelf2=new ArrayList<>();
		
		bookShelf1.add("Java OCA");
		bookShelf1.add("Python book");
		bookShelf1.add("OCA tests");
		bookShelf1.add("C#");
		
		bookShelf2.add("Java OCA");
		bookShelf2.add("Python book");
		bookShelf2.add("OCA tests");
		bookShelf2.add("C#");
		
		if(bookShelf1.equals(bookShelf2)) {//comparing data type and value
			System.out.println("Same books");
		}else {
			System.out.println("Different");
		}
		if(bookShelf1==(bookShelf2)) {    //comparing references
			System.out.println("Same books");
		}else {
			System.out.println("Different");
		}
		
		ArrayList<ArrayList>
		
		
		
		
		
		
		
		
		
		
		
	}

}
