package com.gqt.arraysproj.package1;
import java.util.Scanner; 
public class arrayCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students who's marks shoud be entered");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of student "+(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
        sc.close();
        System.out.println();
		System.out.println("All athe marks has been entered successfully");
		System.out.println("--------------------------------------------");
		
		for(int i=0;i<n;i++) {
			System.out.println("marks of student "+(i+1)+" is "+arr[i]);
		}
		
		
		
		
		
	}

}
