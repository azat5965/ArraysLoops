package ArrayList1;

public class ArrayListPractice {
	/**giving String str="BDAKKLIOPLKKF";
	 * create StringBuilder and do below tasks
	 * Task1 : delete first and last occurance of "K"
	 * Task 2: whatever is left from StringBuilder object change the first occurance of K to M
	 * Task 3: insert "bility" after letter "A"
	 */
	public static void main(String[] args) {
		
	
	
	StringBuilder str=new StringBuilder("BDAKKLIOPLKKF");
	str.deleteCharAt(3);
	System.out.println(str);
	str.deleteCharAt(11);
	
	str.replace(3, 4, "M");
	System.out.println(str);
	str.insert(3, "bility");
	System.out.println(str);
	
	//String word=AF123GYRPJKIRAMBDACEDCMJK;
	//create StringBuilder object
	//append all the letter between A and D if it is available in string word(ABCD)
	
	
	String word="AF123GYRPJKIRAMBDACEDCMJK";
	StringBuilder strB=new StringBuilder();
	for(int i=0; i<word.length(); i++) {
		System.out.print(word.charAt(i)+",");
		//if(word.charAt(i)>='A' && word.charAt(i)<='D')
		if(word.charAt(i)=='A' ||word.charAt(i)==('B')||word.charAt(i)=='C' ||word.charAt(i)==('D')) {
			strB.append(word.charAt(i));		
		}
		
	}
	System.out.println();
	System.out.println(strB);

}
	





}
