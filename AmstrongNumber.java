package week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int input = 153;
		
		int calculated = 0;
		
		int orgNumber = input;
		
		while (input > 0) {
			
				int rem = input % 10;
		
		calculated = calculated + (rem*rem*rem);
				
			input = input / 10;
		}
		
			
System.out.println(calculated);

    if (orgNumber == calculated) {
    	
    	System.out.println("is a Prime Number");
    			
	}else {
		
		System.out.println("Is not a Prime Number");
	}
			
	}
	
	

}
