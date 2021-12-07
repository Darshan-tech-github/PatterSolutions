package loop.package1;

public class pattern {
	static int val = 1 ;

	public static void main(String[] args) {
		
		int n = 4 ;
		
		pattern31(n) ;
		
	}
	
	static void pattern13(int n) {
		for(int row=1 ;row<=n ; row++) {
			for(int col=1 ;col<=(n-row) ;col++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int col=1 ;col<=2*(row-1)-1 ;col++) {
				
					System.out.print(" ") ;
				
			}
			if(row!=1)
			System.out.print("*");
			System.out.println();
		}
	}
	
	static void pattern14(int n) {
		for(int row=1 ;row<=n ; row++) {
			for(int col=1 ;col<=row-1 ;col++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int col=1 ;col<=2*(n-row)-1 ;col++) {
				if(row==1)
					System.out.print("*");
				else
					System.out.print(" ") ;
				
			}
			if(row!=n)
			System.out.print("*");
			System.out.println();
		}
	}
	static void pattern15(int n) {
		
		pattern13(n) ;
		for(int row=1 ;row<=n-1 ; row++) {
			for(int col=1 ;col<=row ;col++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int col=1 ;col<=2*(n-row-1)-1 ;col++) {
					System.out.print(" ") ;
				
			}
			if(row!=n-1)
			System.out.print("*");
			System.out.println();
		}
	}
	static void pattern17(int n) {
		
		for(int row=1 ;row<=n; row++) {
			for(int col=1 ;col<=n-row ;col++) {
				System.out.print(" ");
			}
			for(int col=row ;col>=1;col--) {
				System.out.print(col) ;
			}
			for(int col=2 ;col<=row ;col++) {
				System.out.print(col) ;
			}
			System.out.println();
		}
		for(int row=1 ;row<=n-1; row++) {
			for(int col=1 ;col<=row ;col++) {
				System.out.print(" ");
			}
			for(int col=n-row ;col>=1;col--) {
				System.out.print(col) ;
			}
			for(int col=2 ;col<=n-row ;col++) {
				System.out.print(col) ;
			}
			System.out.println();
		}
	}
	
	static void pattern18(int n) {
		for(int row=1 ;row<=n; row++) {
			for(int col=1 ;col<=n-row+1 ;col++) {
				System.out.print("*");
			}
			for(int col=1 ;col<=row*2-2;col++) {
				System.out.print(" ") ;
			}
			for(int col=1 ;col<=n-row+1 ;col++) {
				System.out.print("*") ;
			}
			System.out.println();
		}
		
		for(int row=1 ;row<=n; row++) {
			for(int col=1 ;col<=row ;col++) {
				System.out.print("*");
			}
			for(int col=1 ;col<=(n-row)*2;col++) {
				System.out.print(" ") ;
			}
			for(int col=1 ;col<=row ;col++) {
				System.out.print("*") ;
			}
			System.out.println();
		}
	}
	static void pattern19(int n) {
		for(int row=1 ;row<=n; row++) {
			for(int col=1 ;col<=row ;col++) {
				System.out.print("*");
			}
			for(int col=1 ;col<=(n-row)*2;col++) {
				System.out.print(" ") ;
			}
			for(int col=1 ;col<=row ;col++) {
				System.out.print("*") ;
			}
			System.out.println();
		}
		
		for(int row=1 ;row<=n-1; row++) {
			for(int col=1 ;col<= n-row ;col++) {
				System.out.print("*");
			}
			for(int col=1 ;col<=row*2;col++) {
				System.out.print(" ") ;
			}
			for(int col=1 ;col<=n-row ;col++) {
				System.out.print("*") ;
			}
			System.out.println();
		}
	}
	
	static void pattern20(int n) {
		for(int row=1 ;row<=n; row++) {
			if(row==n || row==1) {
				for(int col=1 ;col<=n ;col++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for(int col=1 ;col<=n-2 ;col++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern21(int n) {
		for(int row=1 ;row<=n; row++) {
			for(int col=1 ;col<=row ;col++) {
				System.out.print(val +"  ");
				val++ ;
			}
			System.out.println();
		}
	}
	static void pattern22(int n) {
		for(int row=1 ;row<=n; row++) {
			for(int col=1 ;col<=row ;col++) {
				int c = (row+col)%2==0 ? 1 : 0 ;
				System.out.print(c + " ") ;
			}
			System.out.println();
		}
	}
	
	static void pattern24(int n) {
		for(int row=1 ;row<=n; row++) {
			System.out.print("*");
			for(int col=1 ;col<=row-2;col++) {
				System.out.print(" ");
			}
			if(row!=1 ) {
				System.out.print("*") ;
			}
			for(int col=1 ;col<=2*(n-row) ;col++) {
				System.out.print(" ");
			}
			if(row!=1) {
				System.out.print("*") ;
			}
			for(int col=1 ;col<=row-2;col++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int row=1 ;row<=n; row++) {
			System.out.print("*");
			for(int col=1 ;col<=(n-row+1)-2;col++) {
				System.out.print(" ");
			}
			if(row!=n) {
				System.out.print("*") ;
			}
			for(int col=1 ;col<=2*(row-1) ;col++) {
				System.out.print(" ");
			}
			if(row!=n) {
				System.out.print("*") ;
			}
			for(int col=1 ;col<=(n-row+1)-2;col++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}
	
	
	
	static void pattern25(int n) {
		for(int row=1 ;row<=n; row++) {
			for(int col=1 ;col<=n-row ;col++) {
				System.out.print(" ") ;
			}
			if(row==1 || row==n) {
				for(int col=1 ;col<=n ;col++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for(int col=1 ;col<=n-2 ;col++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern26(int n) {
		for(int row=1 ;row<=n; row++) {
			for(int col=1 ;col<=n-row+1 ;col++) {
				System.out.print(row+" ") ;
			}
			System.out.println();
		}
	}
	
	
	static void pattern31(int n) {
		for(int row=1 ;row<=2*n-1 ;row++) {
			
			for(int col=1 ;col<=2*n-1 ;col++) {
				int c = Math.min(Math.min(row, 2*n-row) , Math.min(col,2*n-col));
				System.out.print(n+1-c+" ");
			}
			System.out.println() ;
		}
	}
	
}
