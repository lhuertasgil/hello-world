package HuertasGil_p2;
import java.util.Scanner;

public class bmiCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int userInput; 
		int weightLbs;
		int weightKgs;
		int heightMeters;
		int heightInches; 
		int bmi;
		
		System.out.println("1. Calculate BMI in lbs & inches");
		System.out.println("2. Calculate BMI kg & meters");
		userInput = scnr.nextInt();
		
		switch ( userInput ) {
			case 1:
				System.out.println("Enter weight in pounds:");
				weightLbs = scnr.nextInt();
				System.out.println("Enter height in inches:");
				heightInches = scnr.nextInt();
				
				bmi = ( 703 * weightLbs) / (heightInches*heightInches); 
				
				System.out.println("BMI:" + bmi);
				//BMI Cat: 
				if ( bmi < 18.5) {
					System.out.println("Underweight");
				}
				else if (bmi >= 18.5 && bmi < 24.9) {
					System.out.println("Normal weight");
				}
				else if ( bmi >= 25 && bmi < 29.9) {
					System.out.println("Overweight");
				}
				else {
					System.out.println("Obesity");
				}
			break;
			
			case 2:
				System.out.println("Enter weight in kilograms:");
				weightKgs = scnr.nextInt();
				System.out.println("Enter height in meters:");
				heightMeters = scnr.nextInt();
				
				bmi = weightKgs / (heightMeters * heightMeters);
				
				System.out.println("BMI:" + bmi);
				System.out.print("BMI Category:");
				//BMI Cat: 
				if ( bmi < 18.5) {
					System.out.println("Underweight");
				}
				else if (bmi >= 18.5 && bmi < 24.9) {
					System.out.println("Normal weight");
				}
				else if ( bmi >= 25 && bmi < 29.9) {
					System.out.println("Overweight");
				}
				else {
					System.out.println("Obesity");
				}
			break;
			
			default: 
				System.out.print("Enter 1 or 2");
			break;
		}
				
		scnr.close();
		
	}

}
