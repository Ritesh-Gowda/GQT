package com.gqt.patterns.package0;
import java.util.Scanner;
public class narenda_sir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    
    
    for(int i=0;i<n;i++) {
    	
    	//g
		for(int j=0;j<n;j++) {
			if((i==0 && j<n/2 && j!=0 ) || (j==0 && i!=0 && i!=n-1) || (i==n-1 && j<n/4 && j!=0) ||
				(j==n/4 && i>n/2) ||
				(i==n/2 && j>n/4 && j<n/2) ||
				(j==n/2 && i>n/2)) {
			System.out.print("# ");
			}			
			else {
				System.out.print("  ");
			}	
		}
            System.out.print("");
   
            
            
    
	     //r
		 for(int j=0;j<n;j++) {
		 if(j==0 || (i==0 && j<n/2) || (j==n/2 && i<n/2) || (i==n/2 && j<n/2) || (i-j==5)) {
		   System.out.print("# ");
			}
			else {
				System.out.print("  ");
			}
		}	 
		 System.out.print("");
		 
		 
		 for(int j=0;j<5;j++) {
			 if(i==n-1) {
				 System.out.print("_");
			 }
			 else {
				 System.out.print(" ");
			 }
		 }
		 
		 System.out.print("");
		 
		 for(int j=0;j<6;j++) {
			 System.out.print(" ");
		 }
		 System.out.print("");
		 
		 
		 //n
		for(int j=0;j<n;j++) {
				if((j==0) || (j==n-1) || (i==j) ) {
				System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.print("");
		 
		for(int j=0;j<6;j++) {
			System.out.print(" ");
		}
		System.out.print("");
		
		
		//a
		for(int j=0;j<n;j++) {
			if(j==0 || j==n/2 || (i==0 && j<n/2) || (i==n/2 && j<n/2)) {
			System.out.print("# ");
			
			}
			else {
				System.out.print("  ");
			
			}
		}
			
		System.out.print("");
		
		//r
		for(int j=0;j<n;j++) {
			if(j==0 || (i==0 && j<n/2) || (j==n/2 && i<n/2) || (i==n/2 && j<n/2) || (i-j==5)) {
			System.out.print("# ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("");
		
		
		//e
		for(int j=0;j<n;j++) {
			if((i==0 && j<n/2) || (i==n/2 && j<n/2) || (i==n-1 && j<n/2) || j==0) {
			System.out.print("# ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("");
		
		
		//n
		for(int j=0;j<n;j++) {
			if((j==0) || (j==n-1) || (i==j) ) {
			System.out.print("# ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("");
		
		for(int j=0;j<6;j++) {
			System.out.print(" ");
		}
		System.out.print("");
		
		
		//d
		for(int j=0;j<n;j++) {
			if(j==0 || (j==n/2 && i!=0 && i!=n-1) || (i==0 && j<n/2) || (i==n-1 && j<n/2)) {
			System.out.print("# ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("");
		
		
		//r
		for(int j=0;j<n;j++) {
			if(j==0 || (i==0 && j<n/2) || (j==n/2 && i<n/2) || (i==n/2 && j<n/2) || (i-j==5)) {
			System.out.print("# ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("");
		
		
		//a
		for(int j=0;j<n;j++) {
			if(j==0 || j==n/2 || (i==0 && j<n/2) || (i==n/2 && j<n/2)) {
			System.out.print("# ");
			
			}
			else {
				System.out.print("  ");
			
			}
		}
		System.out.print("");
         System.out.println();
		
	
		
    
	
     

	}
    
    
    
    
    
    
    
    
}
}


