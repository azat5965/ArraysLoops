package shapes;

public class test {
	public static void main(String[] args) {
		circle c=new circle(5);
		c.draw();
		System.out.println(c.calculateArea());
		System.out.println("=========================");
		
		square s =new square(5);
		s.draw();
		System.out.println(s.calculateArea());
	}

}
