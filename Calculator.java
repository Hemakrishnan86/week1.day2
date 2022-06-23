package week1.day2;

public class Calculator {


	public int Add (int num1, int num2) {


		return num1 + num2;

	}

	public int Sub (int num1, int num2) {


		return num1 - num2;

	}

	public int Mul (int num1, int num2) {


		return num1 * num2;

	}

	public int Div (int num1, int num2) {


		return num1 / num2;

	}


	public static void main (String[] args) {


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


