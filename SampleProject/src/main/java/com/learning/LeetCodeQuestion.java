package com.learning;

import java.util.Scanner;
//https://leetcode.com/discuss/interview-question/428244/audible-oa-2019-cutting-metal-surplushttps://leetcode.com/discuss/interview-question/428244/audible-oa-2019-cutting-metal-surplus
public class LeetCodeQuestion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the testing based length :");
		//int baseLength = sc.nextInt();
		int baseLength = 30;
		System.out.println("Enter cost per cut :");
		int costPerCut = sc.nextInt();
		System.out.println("Enter the metal price :");
		int metalPrice = sc.nextInt();
		System.out.println("Enter the no.of rods :");
		int noOfRods = sc.nextInt();
		System.out.println("Enter the rod size");
		int[] rods = new int[noOfRods];
		for(int i=0;i<noOfRods;i++) {
			rods[i] = sc.nextInt();
		}
		
		int revenue = findTotalRevenue(rods, metalPrice, costPerCut, baseLength);
		System.out.println(revenue);
		sc.close();
	}
	
	private static int findTotalRevenue(int[] rods, int metalPrice, int costPerCut, int baseLength) {
		int revenue = 0;
		int extra = 0, pieces = 0, regular = 0;
		for(int i=0;i<rods.length;i++) {
			if(rods[i]%baseLength!=0) {
				extra+=1;
			}
			pieces += rods[i]/baseLength;
			regular += (rods[i]/baseLength) - 1;
		}
		System.out.println("Pieces :"+pieces+"  regular :"+regular+" extra :"+extra);
		revenue = (metalPrice * pieces * baseLength) - costPerCut*(extra+regular);
		return revenue;
	}
}
