package Mentoring;

public class LoopWithString {
	public static void main(String[] args) {
		String name="Asiyat";
		for(int i=name.length()-1;i>=0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		for(int i=0; i<=name.length()-1; i++) {
			System.out.print(name.charAt(i));
		}
	}

}
