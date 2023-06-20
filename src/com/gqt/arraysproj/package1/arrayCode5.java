package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class arrayCode5 {

	
//  Jagged Arrays
//	class	students
//	 0		  3
//	 1		  4
//	 2		  5
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("enter the number of class : ");
		int n = sc.nextInt();
		int arr[][] = new int[n][];
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter the count of students in class "+(i+1)+" : ");
			arr[i]=new int[sc.nextInt()];
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("you are inside the class : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("enter the marks of student  "+(j+1)+" : ");
				arr[i][j]=sc.nextInt();			}
		}
		sc.close();
			
		System.out.println();
			
		for(int i=0;i<arr.length;i++) {
			System.out.println("class number "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("marks of student "+(j+1)+" is : "+arr[i][j]);
			}
		}
			
		}
		
	

}
