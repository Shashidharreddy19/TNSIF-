package com.tnsif.second;

import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System .out.println("enter the number");
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println("it is even");
		}
		else {
			System.out.println("it is not even");
		}
		sc.close();

	}

}
