package com.lab2.problem2;

import java.util.Scanner;

public class Money {
	
	//Sorting array
	public void bubbleSort(int denominations[]) {
	for(int i = 0; i<denominations.length-1;i++) {
		for(int j = 0;j<denominations.length-i-1;j++) {
			if(denominations[j] < denominations[j+1]) {
				int temp = denominations[j];
				denominations[j] = denominations[j+1];
				denominations[j+1] = temp;
			}
		}
	}
	  
}
	public void notesCountImplementation(int denominations[], int amount) {
		int noteCounter[] = new int[denominations.length];
		
		try {
			for(int i = 0; i<denominations.length; i++) {
				if(denominations[i] <= amount) {
					noteCounter[i] = amount / denominations[i];
					amount = amount - noteCounter[i] * denominations[i];
				}
			}
			if(amount > 0) {
				System.out.println("exact amount can not be given with highest denomination");
			}else {
				System.out.println("Your payment approach in order to give min no of notes will be: ");
				for(int i =0; i<denominations.length;i++) {
					if(noteCounter[i] != 0) {
						System.out.println(denominations[i]+":"+noteCounter[i]);
					}
				}
			}
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		Money money = new Money();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Currency Denominations: ");
		int size = sc.nextInt();//5
		int denominations[] = new int[size];//declaration of array
		System.out.println("Enter the currency denominations value: ");
		for(int i=0; i<size;i++) {
			denominations[i] = sc.nextInt(); //60,5,12,78,25
		}
		
		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();//128
		
		money.bubbleSort(denominations);
		money.notesCountImplementation(denominations, amount);

	}

}
