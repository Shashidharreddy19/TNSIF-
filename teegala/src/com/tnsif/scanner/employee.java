package com.tnsif.scanner;
import java.util.Scanner;
public class employee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the id");
		int id= sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the location");
		String location=sc.next();
		System.out.println("enter the salary");
		int salary=sc.nextInt();
		System.out.println("employee id is "+id+".name is "+name+".location is"+location+".salary"+salary);
		sc.close();
	}

}
