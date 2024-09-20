package org.jsp.task;

import java.util.Scanner;

public class SimpleCalculator {

	//Simple Calculator
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first Number");
			double a = sc.nextInt();
			System.out.println("Enter Second Number");
			double b = sc.nextInt();
			System.out.println("1. Addition(+)\n2. Substraction(-)\n3. Multiplication(*)\n4. Division(/)");
			int op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				if(b != 0) {
				System.out.println(a/b);
				}else {
					System.out.println("Error : Can't divide / zero");
				}
				break;
			default:
				System.out.println("Enter valid Input");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
