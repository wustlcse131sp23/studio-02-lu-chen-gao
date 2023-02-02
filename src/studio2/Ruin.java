package studio2;

import java.util.Scanner;
import java.lang.Math;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What's the amount of money that you start with: ");
		int startAmount = in.nextInt();
		System.out.print("What's the win probability, or the probability that you win a single play: ");
		Double winChance = in.nextDouble();
		System.out.print("What's the win limit: ");
		int winLimit = in.nextInt();
		System.out.print("What's the total simulations: ");
		int totalSimulations = in.nextInt();
		
		int loseCount=0;
		int winCount=0;
		for (int i=1; i<=totalSimulations; i++)
		{
			int j=startAmount;
			int count=0;
			while (j>0 && j<winLimit) {
			if (Math.random()<winChance) 
			{	
				j++;
				count++;
			}
			else 
			{	
				j--;
				count++;
			}
			
			}
			if (j==0) 
			{
				System.out.println("Simulation "+ i + ": " + count +" LOSE");
			loseCount++;}
			else {
				System.out.println("Simulation "+ i + ": " + count +" WIN");
			winCount++;}
			}
		System.out.println("Losses: " + loseCount + " Simulations: " + totalSimulations);
		
		double lll = (double)loseCount/totalSimulations;
		System.out.println(lll);
		
	System.out.println("Ruin Rate from Simulation: " + lll);
	
	double a=(1-winChance)/winChance; 
	if (winChance == 0.5) {
		double expectedRuin=1-startAmount/winLimit;
		System.out.println(expectedRuin);
	}
	else {
		double expectedRuin=(Math.pow(a,startAmount)-Math.pow(a,winLimit))/(1-Math.pow(a,winLimit));
		System.out.println(expectedRuin);
	}
	
	}
	
			
		}
			



