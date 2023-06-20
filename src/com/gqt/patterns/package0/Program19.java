package com.gqt.patterns.package0;

public class Program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	   														/* i=0/j=0		i=0/j=1		i=0/j=2		i=0/j=3 	i=0/j=4
		 														   i=1/j=0		i=1/j=1		i=1/j=2		i=1/j=3		i=1/j=4									
		 														   i=2/j=0      i=2/j=1     i=2/j=2     i=2/j=3     i=2/j=4										
		 														   i=3/j=0		i=3/j=1		i=3/j=2		i=3/j=3		i=3/j=4		 																							
		 														   i=4/j=0		i=4/j=1		i=4/j=2		i=4/j=3		i=4/j=4
		 														   i=5/j=0		i=5/j=1		i=5/j=2		i=5/j=3 	i=5/j=4
		 														   i=6/j=0		i=6/j=1		i=6/j=2		i=6/j=3		i=6/j=4									
		 														   i=7/j=0      i=7/j=1     i=7/j=2     i=7/j=3     i=7/j=4										
		 														   i=8/j=0		i=8/j=1		i=8/j=2		i=8/j=3		i=8/j=4		 																							
		 														   i=9/j=0		i=9/j=1		i=9/j=2		i=9/j=3		i=9/j=4	*/
		
		int n=17;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1
				   || i==j || i+j==n-1
				   || i==n/2 || j==n/2
				   || i+j==(n-1)/2
				   || i-j==(n-1)/2
				   || j-i==(n-1)/2
				   || i+j==((n-1)/2)*3
						) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
