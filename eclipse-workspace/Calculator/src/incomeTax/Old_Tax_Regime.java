package incomeTax;

import java.util.Scanner;

public class Old_Tax_Regime {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Taxable income !!");
		int taxableIncome = sc.nextInt();
		Old_Tax_Regime otr = new Old_Tax_Regime();
		otr.oldTaxRegime(taxableIncome);
		otr.newTaxRegime(taxableIncome);
		
		System.out.println();
		System.out.println("Yearly tax according to old regime "+otr.oldTaxRegime(taxableIncome));
		System.out.println();
//		System.out.println("Monthly tax  "+Math.round(otr.newTaxRegime(taxableIncome)/12));
//		System.out.println(otr.newTaxRegime(taxableIncome)/12);
		System.out.println();
		System.out.println("Yearly tax according to new regime "+otr.newTaxRegime(taxableIncome));
		System.out.println();
//		System.out.println("Monthly tax  "+Math.round(otr.oldTaxRegime(taxableIncome)/12));
//		if(otr.oldTaxRegime(taxableIncome)>otr.newTaxRegime(taxableIncome)) {
//			System.out.println();
//			System.out.println("Yearly tax according to old regime "+otr.newTaxRegime(taxableIncome));
//			System.out.println();
//			System.out.println("Monthly tax  "+Math.round(otr.newTaxRegime(taxableIncome)/12));
//		}
//		else {
//			System.out.println();
//			System.out.println("Yearly tax according to new regime "+otr.oldTaxRegime(taxableIncome));
//			System.out.println();
//			System.out.println("Monthly tax  "+Math.round(otr.oldTaxRegime(taxableIncome)/12));
//		}
	}
	
	
	
	
	
	public double newTaxRegime(int taxableIncome) {
		final int default_amount = 250000;
		double incomeTax1 =0;
		if (taxableIncome > 500000 && taxableIncome <= 750000) {
		incomeTax1 = (int) ((0.10 * (taxableIncome - (2 * default_amount))) + (0.05 * default_amount));
		} 
		
		else if (taxableIncome > 750000 && taxableIncome <= 1000000) {
		incomeTax1 = (int) ((0.15 * (taxableIncome - (3 * default_amount))) + (0.10 * default_amount)
	 + (0.05 * default_amount));
		} 
		
		else if (taxableIncome > 1000000 && taxableIncome <= 1250000) {
		incomeTax1 = (0.20 * (taxableIncome - (4 * default_amount))) + (0.15 * default_amount)
		+ (0.10 * default_amount) + (0.05 * default_amount);
		} 
		
		else if (taxableIncome > 1250000 && taxableIncome <= 1500000) {
		incomeTax1 = (0.25 * (taxableIncome - (5 * default_amount))) + (0.20 * default_amount)
		+ (0.15 * default_amount) + (0.10 * default_amount) + (0.05 * default_amount);
		} 
		
		else if (taxableIncome > 1500000) {
		incomeTax1 = (0.30 * (taxableIncome - (6 * default_amount))) + (0.25 * default_amount)
		+ (0.20 * default_amount) + (0.15 * default_amount) + (0.10 * default_amount)
		+ (0.05 * default_amount);
		}
		// calculate Cess
		incomeTax1 += incomeTax1 * 0.04;
		
		return Math.round(incomeTax1);
	}
	
	
	
	
	
	
	public double oldTaxRegime(int income) {
		final int default_amount = 250000;
		double incomeTax = 0;
		double taxableIncome = income -50000;
		 
//		if (taxableIncome > 500000 && taxableIncome <= 1000000) {
//			 incomeTax =  ((0.20 * (taxableIncome - (2 * default_amount))) + (0.05 * default_amount));
//			 } 
	if (taxableIncome > 1000000) {
		incomeTax = (0.30 * (taxableIncome - (4 * default_amount)))
		 + (0.20 * (2 * default_amount) + (0.05 * default_amount));
	}
//		else if (taxableIncome > 1500000) {
//			 incomeTax =  ((0.30 * (taxableIncome - (6 * default_amount))) + (0.30 * (2 * default_amount))
//			 + (0.20 * (2 * default_amount) + 0.05 * default_amount));
//			  }
              // calculate Cess
        incomeTax += incomeTax * 0.04;
		return Math.round(taxableIncome);
	}
}
