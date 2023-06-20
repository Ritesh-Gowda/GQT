package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class arrayCode2 {

//	class    student
//	01       05
//	02       05
//	03       05
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of classes : ");
		int cls = sc.nextInt();
		System.out.print("enter the number of students in class : ");
		int stu = sc.nextInt();
		int [][] arr = new int[cls][stu];
		
		for(int i=0;i<cls;i++) {
			System.out.println("----------------------------------");
			System.out.println("you are inside the class "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.print("enter the marks of student "+(j+1)+" : ");
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		
System.out.println();
System.out.println("#######################################");
System.out.println("all the marks were entered successfully");
System.out.println("below are the marks you've entered");
System.out.println("#######################################");
System.out.println();
		
		for(int i=0;i<cls;i++) {
			System.out.println("----------------------------------");
			System.out.println("from class "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Marks of student "+(j+1)+" is : "+arr[i][j]);
				 
			}
		}	
		
		
		
	}

}
