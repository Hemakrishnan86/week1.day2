package week1.day2;

public class Mycalculator {

	public static void main(String[] args) {
		
		
		Calculator cal = new Calculator();
		int add = cal.Add(5,3);
		System.out.println(add);

		int sub = cal.Sub(10, 8);	
		System.out.println(sub);

		int mul = cal.Mul(2, 2);
		System.out.println(mul);

		int div = cal.Div(6, 3);
		System.out.println(div);

	}

}
