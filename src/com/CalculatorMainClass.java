package com;     
import java.util.Scanner;
public class CalculatorMainClass {
	public static void main(String[] args) {
		System.out.println("********* Welcome to Calculatore Project ********");
		Scanner sc = new Scanner(System.in);
		Calculator cal = new CalculatoreImpl();
		while(true) {

			//menu driven programs.
			System.out.println("1:Addition\n2:Substraction\n3:Miltiplication");
			System.out.println("4:Division\n5:EXIT\nenter choice:");
			int choice = sc.nextInt();


			int a =0;
			int b =0;
			if(choice>=1 && choice<=4) {
				System.out.println("enter the 2 numbers:");
				a = sc.nextInt();
				b = sc.nextInt();
			}
			
			switch(choice) {
			case 1:
				cal.add(a, b);
				break;
			case 2:
				cal.sub(a, b);
				break;
			case 3:
				cal.mul(a, b);
				break;
			case 4:
				cal.div(a,b);
				break;
			case 5:
				System.out.println("thank u");
				System.exit(0);
			default:
				System.out.println("invalid choice");
				}
			System.out.println("-----------------------");
			




		}
		
	}

}
