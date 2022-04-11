package com.lab2.problem1;

import java.util.Scanner;

public class PayMoney {
	public static void main(String[] args) {
		 int size;
		 int transaction;
	     int target;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		size = sc.nextInt();//3
		
		int array[] = new int[size];
		
		System.out.println("Enter the transactions in the array: ");
		for(transaction=0;transaction<size;transaction++) { 
			array[transaction] = sc.nextInt();   //20,12,31
		}
		
		System.out.println("Enter total Number of targets to be achieved: ");
		int t = sc.nextInt();
		
		
		for(int i =1;i<=t;i++) {
			System.out.println("Enter the value of targets from the user: ");
			target = sc.nextInt();//32
			
			int sum=0;
		for(transaction = 0; transaction < size ;transaction++) {
			sum = sum + array[transaction];
			if(sum >= target) {
				
				break;
			}	

		}
		if(sum < target) {
			System.out.println("Target not achieved");
		}
		else
			System.out.println("Target achieved after "+(transaction+1)+" transactions");
	}
 
	}

}
