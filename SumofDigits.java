package week1.day2;

public class SumofDigits {

	public static void main(String[] args) {

		int input = 123;
		int sum = 0;

		while (input>0) //if we don't know the number of iterations we are using While 

		{

			int rem = input % 10; //to get the reminder

			sum = sum + rem;

			input = input / 10; //to get the quotient of the input


		}

		System.out.println(sum);


	}

}
