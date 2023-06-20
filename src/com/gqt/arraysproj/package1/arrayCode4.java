package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class arrayCode4 {

//	university	school	class	student
//   -------------------------------------
//   		0		0		0		5
//   						1		5
//   				1		0		5
//   						1		5
//   						
//   		1		0		0		5
//							1		5
//					1		0		5
//							1		5
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count of university : ");
		int uni = sc.nextInt();
		System.out.print("Enter the count of school : ");
		int sch = sc.nextInt();
		System.out.print("Enter the count of class : ");
		int cls = sc.nextInt();
		System.out.print("Enter the count of student : ");
		int std = sc.nextInt();
		
		int arr[][][][] = new int[uni][sch][cls][std];
		System.out.println();
		for(int i=0;i<uni;i++) {
			System.out.println("you are in the university number : "+(i+1));
			for(int j=0;j<sch;j++) {
				System.out.println("------>you are in the school number : "+(j+1));
				for(int k=0;k<cls;k++) {
					System.out.println("--------->you are in the class number : "+(k+1));
					for(int l=0;l<std;l++) {
						System.out.print("-------------->enter the marks of student "+(l+1)+" : ");
						arr[i][j][k][l]=sc.nextInt();					
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
		
		
		System.out.println();
		System.out.println("entries done.......");
		System.out.println();
		
		
		for(int i=0;i<uni;i++) {
			System.out.println();
			System.out.println("------------------------------------------");
			System.out.println("university number : "+(i+1)+"                    |");
			for(int j=0;j<sch;j++) {
				System.out.println("------------------------------------------");
				System.out.println("--->school number : "+(j+1)+"                    ");
				for(int k=0;k<cls;k++) {
					System.out.println("------>class number : "+(k+1)+"                  ");
					for(int l=0;l<std;l++) {
						System.out.println("--------->marks of student : "+(l+1)+" is "+arr[i][j][k][l]);										
					}
					System.out.println();
				}
			}
			System.out.println();
		}
		
		
		
	}

}
