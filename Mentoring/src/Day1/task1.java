package Day1;
/** write a method that will return the sum of all the elements of the integer array given array and its size as
 * an argument.
 * write a method which will search an array for some given value
 * @author Asiyat
 *
 */
public class task1 {
	public static int sumOfElements (int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void
	
	
	search(int arr[]) {
		
		
	}
		
	public static void main(String[] args) {
		task1 t=new task1();
		int arr1[]= {1,3,3};
		
		System.out.println(sumOfElements(arr1));
	}

	
}
