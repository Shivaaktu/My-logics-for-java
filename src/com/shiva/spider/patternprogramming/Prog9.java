package com.shiva.spider.patternprogramming;

public class Prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(9);
	}
	public static void pattern(int n) {
		int space=n-1;
		int star=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print(j+"   ");
			}
			space--;
			star++;
			System.out.println();
		}
	}

}
