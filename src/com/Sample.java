package com;
import java.util.Scanner;
public class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//infinate loop
		while(true) {
			System.out.println("enter choice:");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("hiii");
				break;

			case 2:
				System.out.println("byeee");
				break;
			case 3:
				System.out.println("thank u");
				System.exit(0);  //we cant repeat the output
			default:
				System.out.println("invalid choice");
			}
			System.out.println("-----------------");
		}
	}

}
