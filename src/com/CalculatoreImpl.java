package com;

 class CalculatoreImpl implements Calculator {
	public void add(int a, int b) {
		System.out.println("sum of "+a+" and "+b+" is "+(a+b));
	}
	public void sub(int a,int b) {
		System.out.println("difference of "+a+" and "+b+" is "+(a-b));
	}
	public void mul(int a,int b) {
		System.out.println("product of "+a+" and "+b+" is "+(a*b));
	}
	public void div(int a,int b) {
		System.out.println("divivsion of "+a+" and "+b+" is "+(a/b));
	}

}
