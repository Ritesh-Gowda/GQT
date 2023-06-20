package com.gqt.patterns.package0;

import java.util.Scanner;

public class V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 && i<3*n/4 ) || (j==(n/2)+1 && i<3*n/4) || (i-j==7) || (i+j==13 && i>=3*n/4)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
