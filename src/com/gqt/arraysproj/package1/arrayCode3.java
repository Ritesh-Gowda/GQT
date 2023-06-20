package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class arrayCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of schools : ");
		int sch = sc.nextInt();
		int cls = 2;
		System.out.print("enter the number of students in each class : ");
		int stu = sc.nextInt();
		int [][][] arr = new int [sch][cls][stu];
		
		System.out.println();
		
		
		for(int i=0;i<sch;i++) {
			System.out.print("you are inside school : "+(i+1));
			System.out.println();
			for(int j=0;j<cls;j++) {
				System.out.print("---> you are inside class : "+(j+1));
				System.out.println();
				for(int k=0;k<stu;k++) {
					System.out.print("------> enter the marks of student "+(k+1)+" : ");
					arr[i][j][k]=sc.nextInt();
					
				}
			}
		}
		sc.close();
		
		
		System.out.println();
		System.out.println("entries done...");
		System.out.println();
		
		for(int i=0;i<sch;i++) {
			System.out.println("---------------------------------------------");
			System.out.print("school number : "+(i+1));
			System.out.println();
			for(int j=0;j<cls;j++) {
				System.out.print("---> class number : "+(j+1));
				System.out.println();
				for(int k=0;k<stu;k++) {
					System.out.println("------> marks of student "+(k+1)+" is "+arr[i][j][k]);
					
				}
				System.out.println();
			}
		}
		
	}

}
