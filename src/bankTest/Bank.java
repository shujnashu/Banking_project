package bankTest;


import java.util.Scanner;

abstract class RateOfInterestBank {
	abstract float rateOfInterest();
}

class SBI extends RateOfInterestBank {
	float rateOfInterest() {
		float rSBI = 7.3f;
		return rSBI;
	}
}

class Axis extends RateOfInterestBank {
	float rateOfInterest() {
		float rAxis = 8.5f;
		return rAxis;
	}

}

public class Bank {
	public static void main(String[] args) {
		float principelAmount, rSBI, rAxis, simpleInterest;
		int numberOfMonth;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle AMount and number of months : ");
		principelAmount = sc.nextFloat();
		numberOfMonth = sc.nextInt();

		sc.close();

		RateOfInterestBank b = new SBI();
		rSBI = b.rateOfInterest();

		simpleInterest = (principelAmount * numberOfMonth * rSBI) / 100;

		System.out.println("Simple Interest of SBI : " + simpleInterest);
		
		RateOfInterestBank b1 = new Axis();

		rAxis = b1.rateOfInterest();

		simpleInterest = (principelAmount * numberOfMonth * rAxis) / 100;

		System.out.println("Simple Interest of Axis : " + simpleInterest);
	}
}
