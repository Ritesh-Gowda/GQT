package com.gqt.patterns.package0;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value of n : ");
		int n= sc.nextInt();
		sc.close();
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
			num=1;
		}

	}

}
