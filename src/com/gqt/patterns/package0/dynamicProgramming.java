package com.gqt.patterns.package0;
import java.util.Scanner;
public class dynamicProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("enter the value of n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int num = n;
		for(int i=5;i>=1;i--) {
			System.out.print(num*i+" ");
		}
		
	}

}
