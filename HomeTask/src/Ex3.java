
public class Ex3 {
	
	public int getNum(double x, int y) {
		int day=1;
		while (x<y){
			x=x+x*0.1;  // 
			day++;
		}
		return day ;
	}
		
	public static void main(String[] args) {
		/*Задачи на while and for loop 
		1.В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от 
		предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена составит 
		не менее y километров. 
		Программа получает на вход действительные числа x и y и должна вывести одно натуральное число.
		Test cases
		Input:
		10
		20       
		Output:   
		9
		/////
		Input:
		10
		100
		Output:
		26*/
		
		Ex3 obj=new Ex3();
		
		System.out.println(obj.getNum(10, 20));
		

	}

}
