package problem1;
import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int number; 
		int num1, num2, num3, num4;
		
		System.out.print("Enter a 4 digit number to decrypt:");
		number = scnr.nextInt();
		
		num3 = number / 1000;
		num4 = number / 100 % 10;
		num1 = number / 10 % 10;
		num2 = number % 10;
		
		num1 = ( ( num1 + 10 ) - 7) % 10; 
		num2 = ( ( num2 + 10 ) - 7) % 10; 
		num3 = ( ( num3 + 10 ) - 7) % 10;
		num4 = ( ( num4 + 10 ) - 7) % 10; 
		
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3);
		System.out.print(num4);

		
		scnr.close();
		
		
		
		
		
	}

}
